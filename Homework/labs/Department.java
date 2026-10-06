// CSCI185
// Nicholas Tankiang
// M3: Integration of Inheritance and Composition Lab

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

    public static void main(String[] args) {
        //Also write a main method that will use one of constructors to create two Department objects. 
        // Your main method should print out the details of these two Departments 
        // (each department with at least 5 students and 3 teachers).

        Teacher[] sample_teachers_1 = new Teacher[3];
        sample_teachers_1[0] = new Teacher("Paracelcus", 306, "666-66-6666", false, "6666666", 100, 666);
        sample_teachers_1[1] = new Teacher("Scathach", 9999, "666-66-6666", true, "6666666", 100, 666);
        sample_teachers_1[2] = new Teacher("Keynes Melloi II", 38, "666-66-6666", false, "6666666", 100, 666);

        Teacher[] sample_teachers_2 = new Teacher[3];
        sample_teachers_1[0] = new Teacher("Waver Velvet", 31, "666-66-6666", true, "6666666", 100, 666);
        sample_teachers_1[1] = new Teacher("Angra", 99, "666-66-6666", true, "6666666", 100, 666);
        sample_teachers_1[2] = new Teacher("Olga Marie", 28, "666-66-6666", true, "6666666", 100, 666);

        Student[] sample_students_1 = new Student[5];
        sample_students_1[0] = new Student("mmm", 26, "123-45-6666", true, "1112233", 3.98, "Senior");
        sample_students_1[1] = new Student("fffff", 26, "123-45-6666", true, "1112233", 3.98, "Senior");
        sample_students_1[2] = new Student("vvmmvmvv", 26, "123-45-6666", true, "1112233", 3.98, "Senior");
        sample_students_1[3] = new Student("Sheldon Cooper", 26, "123-45-6666", true, "1112233", 3.98, "Senior");
        sample_students_1[4] = new Student("Sheldon Cooper", 26, "123-45-6666", true, "1112233", 3.98, "Senior");

        Student[] sample_students_2 = new Student[5];
        sample_students_1[0] = new Student("Gray", 20, "123-45-6666", true, "1112233", 3.98, "Senior");
        sample_students_1[1] = new Student("Flat Escardos", 23, "123-45-6666", true, "1112233", 3.98, "Senior");
        sample_students_1[2] = new Student("Svin Glascheit", 23, "123-45-6666", true, "1112233", 3.98, "Senior");
        sample_students_1[3] = new Student("Caules Forvedge", 23, "123-45-6666", true, "1112233", 3.98, "Senior");
        sample_students_1[4] = new Student("Yvette L. Lehrman", 22, "123-45-6666", true, "1112233", 3.98, "Senior");

        Department d1 = new Department("Department of General Fundamentals", 5, sample_teachers_1, sample_students_1);
        Department d2 = new Department("Department of Modern Magecraft Theory", 1, sample_teachers_2, sample_students_2);

        d1.toString();
        d2.toString();
    }

}