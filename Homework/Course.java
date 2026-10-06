// CSCI185
// Nicholas Tankiang
// M2: Composition Lab

public class Course{
    private String courseName;
    private String courseNumber;
    private String instructorName;
    // apply copy constructor to student array using for loop
    private Student[] listStudents;

    //class invariance? 

    public Course(String courseName, String courseNumber, String instructorName, Student[] listStudents){
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.instructorName = instructorName;

        this.listStudents = new Student[listStudents.length];
        for (int i = 0; i < listStudents.length; i++) {
            this.listStudents[i] = new Student(listStudents[i]);
        }
    }

    public Course(Course c){
        if (isValidInput(c)){
            this.courseName = c.courseName;
            this.courseNumber = c.courseNumber;
            this.instructorName = c.instructorName;

            this.listStudents = new Student[c.listStudents.length];
            for (int i = 0; i < c.listStudents.length; i++) {
                this.listStudents[i] = new Student(c.listStudents[i]);
            }
        }
    }

    private boolean isValidInput(Course c){
        if (c == null 
        || (c.getCourseName().equals(""))
        || c.getCourseNumber().equals("")
        || c.getInstructorName().equals("")
        || c.listStudents.length == 0)
        {
            System.out.println("Invalid input, exiting...");
            System.exit(0);
        }
        return true;
    }

    /* Accessors and mutators (one pair per each feature) */
    public String getCourseName(){
        return this.courseName;
    }

    public String getCourseNumber(){
        return this.courseNumber;
    }

    public String getInstructorName(){
        return this.instructorName;
    }

    //mutable, return copy
    public Student[] getStudentsList(){
        Student[] tempList = new Student[this.listStudents.length];
        for (int i = 0; i < tempList.length; i++) {
            tempList[i] = new Student(this.listStudents[i]);
        }
        return tempList;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public void setCourseNumber(String courseNumber){
        this.courseNumber = courseNumber;
    }

    public void setInstructorName(String instructorName){
        this.instructorName = instructorName;
    }

    // create new array
    public void setStudentList(Student[] studentList){
        this.listStudents = new Student[studentList.length];
            for (int i = 0; i < studentList.length; i++) {
                this.listStudents[i] = new Student(studentList[i]);
            }
    }

    /* toString method */
    public String toString(){
        String output = "";

        output += 
          "Course Name: " + this.getCourseName() + " || " 
        + "Course Number: " + this.getCourseNumber() + " || " 
        + "Instructor Name: " + this.getInstructorName() + " || " 
        + "List of Students: \n";
        for (int i = 0; i < this.listStudents.length; i++) {
            output += "Name: " + this.listStudents[i].getName() 
            + "ID: " +  this.listStudents[i].getId() 
            + "GPA: " +  this.listStudents[i].getGpa()
            + "Age: " +  this.listStudents[i].getAge()
            + "\n";
        }

        return output;
    }

    public static void main(String[] args) {
        // setup for student list
        Student[] sample_01_array = new Student[3];
        sample_01_array[0] = new Student("Ext-01", "001", 2.01, 1);
        sample_01_array[1] = new Student("iphone 98", "002", 1.80, 18);
        sample_01_array[2] = new Student("Henry", "003", 3.02, 1409);

        Course sample_01 = new Course("Dynastacism", "001", "Phillip II", sample_01_array);
        System.out.println(sample_01.toString());

        Course sample_02 = new Course(sample_01);
        String tmpCourseName = "Mysticism";
        sample_02.setCourseName(tmpCourseName);
        System.out.println(sample_02.toString());
    }

}