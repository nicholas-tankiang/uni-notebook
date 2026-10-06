public class Department{

    /* The basic feature of a department */
    private String deptName;
    private int numMajors;
    // note must maintain privacy for arrays
    private Teacher[] listTeachers; //inherits from Person class
    private Student[] listStudents; //inherits from Person class

    public Department(String deptName, int numMajors, Teacher[] listTeachers, Student[] listStudents){
        this.deptName = deptName;
        this.numMajors = numMajors;

        // note to make copy constructor for prev classes
        this.listTeachers = new Teacher[listTeachers.length];
            for (int i = 0; i < listTeachers.length; i++) {
                this.listTeachers[i] = new Teacher(listTeachers[i]);
            }

        this.listStudents = new Student[listStudents.length];
            for (int i = 0; i < listStudents.length; i++) {
                this.listStudents[i] = new Student(listStudents[i]);
            }
    }

    /* Construct a department object (at least TWO constructors) */
    public Department(Department dept){
        this.deptName = dept.deptName;
        this.numMajors = dept.numMajors;

        // note to make copy constructor for prev classes
        
        this.listTeachers = new Teacher[dept.listTeachers.length];
            for (int i = 0; i < dept.listTeachers.length; i++) {
                this.listTeachers[i] = new Teacher(dept.listTeachers[i]);
            }

        this.listStudents = new Student[dept.listStudents.length];
            for (int i = 0; i < dept.listStudents.length; i++) {
                this.listStudents[i] = new Student(dept.listStudents[i]);
            }
    }

    /* Accessors and mutators (one pair per each feature) */
    public String getDepartmentName(){
        return this.deptName;
    }

    public int getNumMajors(){
        return this.numMajors;
    }

    public Teacher[] getListTeachers(){
        Teacher[] tmpListTeacher = new Teacher[this.listTeachers.length];
        for (int i = 0; i < this.listTeachers.length; i++) {
            tmpListTeacher[i] = new Teacher(this.listTeachers[i]);
        }
        return tmpListTeacher;
    }

    public Student[] getListStudents(){
        Student[] tmpListStudent = new Student[this.listStudents.length];
        for (int i = 0; i < this.listStudents.length; i++) {
            tmpListStudent[i] = new Student(this.listStudents[i]);
        }
        return tmpListStudent;
    }

    /* toString method */
    public String toString(){
        String output = "";

        output += 
          "Department: " + this.getDepartmentName() + " || " 
        + "Majors Count: " + this.getNumMajors() + " || " 
        + "Teachers: \n";
        for (int i = 0; i < this.listTeachers.length; i++) {
            output += this.listTeachers[i].toString()
            + "\n";
        }
        output += "Students: \n";
        for (int i = 0; i < this.listStudents.length; i++) {
            output += this.listStudents[i].toString()
            + "\n";
        }

        return output;
    }

}