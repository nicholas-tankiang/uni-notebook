public class Student{
    private String name;
    private String stu_id;
    private double gpa;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setId(String stu_id){
        this.stu_id = stu_id;
    }

    public String getId(){
        return this.stu_id;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public double getGpa(){
        return this.gpa;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public Student(String name, String stu_id, double gpa, int age){
        this.name = name;
        this.stu_id = stu_id;
        this.gpa = gpa;
        this.age = age;
    }

    public Student(){

    }

    //add copy constructor
    public Student(Student s){
        this.name = s.name;
        this.stu_id = s.stu_id;
        this.gpa = s.gpa;
        this.age = s.age;
    }

    public String toString(){
        String output = "";

        output += 
        this.getName() + " name // " +
        this.getId() + " id // " + 
        this.getGpa() + " gpa // " + 
        this.getAge() + " age"
        ;

        return output;
    }
}