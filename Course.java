public class Course{
    /* The basic feature of a course */
    public String courseName;
    private String courseNumber;
    public String instructorName;
    // apply copy constructor to student array using for loop
    private Student[] listStudents;

    //class invariance? 

    /* Construct a course object (TWO constructors) */
    // full loaded + copy constructor

    public Course(String courseName, String courseNumber, String instructorName, Student[] listStudents){
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.instructorName = instructorName;

        this.listStudents = new Student[listStudents.length];
        for (int i = 0; i < listStudents.length; i++) {
            this.listStudents[i] = listStudents[i];
        }
    }

    public Course(Course c){
        if (isValidInput(c)){
            this.courseName = c.courseName;
            this.courseNumber = c.courseNumber;
            this.instructorName = c.instructorName;

            this.listStudents = new Student[c.listStudents.length];
            for (int i = 0; i < c.listStudents.length; i++) {
                this.listStudents[i] = c.listStudents[i];
            }
        }
    }

    private boolean isValidInput(Course c){
        if (c == null 
        || (c.getCouseName().equals(""))
        || c.getCourseNumber().equals("")
        || c.getInstructorName().equals("")
        // double check that this works
        || c.listStudents.length == 0)
        {
            System.out.println("Invalid input, exiting...");
            System.exit(0);
        }
        return true;
    }

    /* Accessors and mutators (one pair per each feature) */
    public String getCouseName(){
        return this.courseName;
    }

    public String getCourseNumber(){
        return this.courseNumber;
    }

    public String getInstructorName(){
        return this.instructorName;
    }

    public Student[] getStudentsList(){
        return this.listStudents;
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
                this.listStudents[i] = studentList[i];
            }
    }

    /* toString method */
    public String toString(){
        String output = "";

        output += 
          "Course Name: " + this.getCouseName() + " || " 
        + "Course Number: " + this.getCourseNumber() + " || " 
        + "Instructor Name: " + this.getInstructorName() + " || " 
        + "List of Students: \n" +  
        for (int i = 0; i < this.listStudents.length; i++) {
            System.out.println(this.listStudents[i]);
        }
        ;

        return output;
    }

}