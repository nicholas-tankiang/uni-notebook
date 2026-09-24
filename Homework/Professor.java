public class Professor{
    private String name;
    private String department;
    private double annual_salary;
    private int year_in_profession;

    /**
    * Class Invariance: 
    * FOLLOWING VAR CASES PROHIBITED:
    * null name, null department, negative salary, negative profession years
    * @param name non-null, non-empty string
    * @param department non-null, non-empty string
    * @param annual_salary non-null double
    * @param year_in_profession non-null int
    */
    public Professor(String name, String department, double annual_salary, int year_in_profession){
        this.name = name;
        this.department = department;
        this.annual_salary = annual_salary;
        this.year_in_profession = year_in_profession;
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