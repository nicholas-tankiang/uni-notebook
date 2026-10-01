// CSCI185
// Nicholas Tankiang
// M3: Inheritance 101 Lab

public class Teacher extends Person{
    private String id;
    private int salary;
    private int num_yr_prof;

    public Teacher(String name, int age, String ssn, boolean isAlive, String id, int salary, int num_yr_prof){
        super(name, age, ssn, isAlive);
        this.id = id;
        this.salary = salary;
        this.num_yr_prof = num_yr_prof;
    }

    public Teacher(){
        // def case
        super("", 0, "", false);
        this.id = "";
        this.salary = 0;
        this.num_yr_prof = 0;
    }

    public String getID(){
        return this.id;
    }

    public double getSalary(){
        return this.salary;
    }

    public int getProfYears(){
        return this.num_yr_prof;
    }

    public void setID(String id){
        this.id = id;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void setProfYears(int year){
        this.num_yr_prof = year;
    }

    public String toString(){
        String output = super.toString();
        output += "ID: " + this.getID() + " || " 
        + "Salary: " + this.salary + " || " 
        + "Years in Profession: " + this.num_yr_prof + "\n\n";
        return output;
    }
}