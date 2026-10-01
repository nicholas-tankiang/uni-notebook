public class Student extends Person {
    //local data
    private String stu_id;
    private double gpa;
    private String grade;

    //constructor
    public Student(String name, int age, String ssn, boolean isAlive, String id, double g, String grade){
        super(name, age, ssn, isAlive);
        this.stu_id = id;
        this.gpa = g;
        this.grade = grade;
    }

    //toString
    public String toString(){
        String output = super.toString();

        output += "Student Info:\nStudent ID: " + this.stu_id + " || " 
        + "GPA: " +  + this.gpa + " || "  
        + "Grade: " + this.grade + "\n\n";
        return output;
    }

}