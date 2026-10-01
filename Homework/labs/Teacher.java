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

    public Professor(Professor p){
        //validation
        if (isValidInput(p)){
            this.name = p.name;
            this.department = p.department;
            this.annual_salary = p.annual_salary;
            this.year_in_profession = p.year_in_profession;
            // deep copy
            // this.annual_salary = new Double(p.annual_salary);
        }
    }

    private boolean isValidInput(Professor p){
        if (p == null 
        || (p.getName().equals(""))
        || p.getDepartment().equals("")
        || p.getAnnualSalary() < 0
        || p.getYearInProfession() < 0) {
            System.out.println("Invalid input.");
            // for the current purpose of actually running this code, exit 0 will be commented out  
            // and the program will return false but still continue creating the p object even if a bad input is entered
            // System.exit(0);
            return false;
        }
        return true;
    }

    public String getName(){
        return this.name;
    }

    public String getDepartment(){
        return this.department;
    }

    public double getAnnualSalary(){
        return this.annual_salary;
    }

    public int getYearInProfession(){
        return this.year_in_profession;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setAnnualSalary(double salary){
        this.annual_salary = salary;
    }

    public void setYearInProfession(int year){
        this.year_in_profession = year;
    }

    public String toString(){
        String output = "";

        output += 
        "Name: " + this.getName() + " || " 
        + "Department: " + this.getDepartment() + " || " 
        + "Annual Salary: " + this.getAnnualSalary() + " || " 
        + "Year in Profession: " + this.getYearInProfession()
        ;

        return output;
    }
}