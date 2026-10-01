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
        String s = super.toString();
        s += "Student Info:\nStudent ID: " + this.stu_id;
        s += "\nGPA: " + this.gpa;
        s += "\nGrade: " + this.grade + "\n\n";
        return s;
    }
    
}