public class Professor{
    private String name;
    private String department;
    private double annual_salary;
    private int year_in_profession;

    public Professor(String name, String department, double annual_salary, int year_in_profession){
        this.name = name;
        this.department = department;
        this.annual_salary = annual_salary;
        this.year_in_profession = year_in_profession;
    }

    public Professor(Professor p){
        //validation
        if (p == null 
        || p.getName().equals("") 
        || p.getDepartment().equals("")
        || p.getAnnualSalary() < 0
        || p.getYearInProfession() < 0) {
            System.out.println("Invalid entry, session terminated.");
            System.exit(0);
        }

        this.name = p.name;
        this.department = p.department;
        this.annual_salary = p.annual_salary;
        this.year_in_profession = p.year_in_profession;
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

    public String toString(){

        return s;
    }
}