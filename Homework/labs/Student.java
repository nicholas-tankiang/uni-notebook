// CSCI185
// Nicholas Tankiang
// M3: Inheritance 101 Lab

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

    //new copy const
     public Student(Student stud){
        //null check
        if (stud == null){
            System.out.println("Null teacher object");
            System.exit(0);
        }
        if (stud.getName().equals("") || stud.getAge() == 0 || stud.getSSN().equals("") || stud.getID().equals("") || stud.getGrade().equals("")) {
            System.out.println("Bad teacher object");
            System.exit(0);
        }
        super(stud.getName(), stud.getAge(), stud.getSSN(), stud.getAliveStatus());
        this.stu_id = stud.stu_id;
        this.gpa = stud.gpa;
        this.grade = stud.grade;
    }

    public String getID(){
        return this.stu_id;
    }

    public double getGPA(){
        return this.gpa;
    }

    public String getGrade(){
        return this.grade;
    }

    public void setID(String id){
        this.stu_id = id;
    }

    public void setGPA(double gpa){
        this.gpa = gpa;
    }

    public void setGrade(String grade){
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