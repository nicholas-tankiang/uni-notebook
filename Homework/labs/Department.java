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
        // NOTE DO ARRAY NULL CHECK OR CRASH
        if (listTeachers == null || listStudents == null) {
            System.out.println("Null teacher/student object");
            System.exit(0);
        }
        this.deptName = deptName;
        this.numMajors = numMajors;

        // note to make copy constructor for prev classes
        this.listTeachers = new Teacher[listTeachers.length];
            for (int i = 0; i < listTeachers.length; i++) {
                // NULL CHECK FOR ARRAY CASE CRASH
                if (listTeachers[i] != null) {
                    this.listTeachers[i] = new Teacher(listTeachers[i]);
                }
            }

        this.listStudents = new Student[listStudents.length];
            for (int i = 0; i < listStudents.length; i++) {
                if (listStudents[i] != null) {
                    this.listStudents[i] = new Student(listStudents[i]);
                }
            }
    }

    /* Construct a department object (at least TWO constructors) */
    public Department(Department dept){
        if (dept == null) {
            System.out.println("Null dept object");
            System.exit(0);
        }

        this.deptName = dept.deptName;
        this.numMajors = dept.numMajors;

        // note to make copy constructor for prev classes
        
        if (dept.listTeachers != null) {
            this.listTeachers = new Teacher[dept.listTeachers.length];
            for (int i = 0; i < dept.listTeachers.length; i++) {
                if (dept.listTeachers[i] != null) {
                    this.listTeachers[i] = new Teacher(dept.listTeachers[i]);
                }
            }
        } else {
            // if null, then empty teacher list
            this.listTeachers = new Teacher[0];
        }

        if (dept.listStudents != null) {
            this.listStudents = new Student[dept.listStudents.length];
            for (int i = 0; i < dept.listStudents.length; i++) {
                if (dept.listStudents[i] != null) {
                    this.listStudents[i] = new Student(dept.listStudents[i]);
                }
            }
        } else {
            this.listStudents = new Student[0];
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
        sample_teachers_1[0] = new Teacher("Paracelcus", 306, "866-20-2420", false, "56000", 56000, 256);
        sample_teachers_1[1] = new Teacher("Scathach", 9999, "444-44-4444", true, "44444", 44444, 607);
        sample_teachers_1[2] = new Teacher("Keynes Melloi II", 38, "387-30-6086", false, "83256", 83256, 21);

        Teacher[] sample_teachers_2 = new Teacher[3];
        sample_teachers_2[0] = new Teacher("Waver Velvet", 31, "666-66-6666", true, "9000", 9000, 4);
        sample_teachers_2[1] = new Teacher("Angra", 99, "666-66-6666", true, "666", 666, 666);
        sample_teachers_2[2] = new Teacher("Olga Marie", 28, "873-53-0531", true, "199786", 199786, 3);

        Student[] sample_students_1 = new Student[5];
        sample_students_1[0] = new Student("Terence Owen", 26, "123-45-6666", true, "1112233", 3.98, "Senior");
        sample_students_1[1] = new Student("Maggie Shah", 26, "123-45-6666", true, "1112234", 3.98, "Soph");
        sample_students_1[2] = new Student("Zach Maxwell", 26, "123-45-6666", true, "1112235", 3.98, "Senior");
        sample_students_1[3] = new Student("Jim Gibson", 26, "123-45-6666", true, "1112236", 3.98, "Fresh");
        sample_students_1[4] = new Student("Martha Guerrero", 26, "123-45-6666", true, "1112237", 3.98, "Soph");

        Student[] sample_students_2 = new Student[5];
        sample_students_2[0] = new Student("Gray", 20, "123-45-6666", true, "1112233", 3.98, "Senior");
        sample_students_2[1] = new Student("Flat Escardos", 23, "123-45-6666", true, "1112238", 3.98, "Senior");
        sample_students_2[2] = new Student("Svin Glascheit", 23, "123-45-6666", true, "1112239", 3.98, "Fresh");
        sample_students_2[3] = new Student("Caules Forvedge", 23, "123-45-6666", true, "1112240", 3.98, "Fresh");
        sample_students_2[4] = new Student("Yvette L. Lehrman", 22, "123-45-6666", true, "1112241", 3.98, "Soph");

        Department d1 = new Department("Department of General Fundamentals", 5, sample_teachers_1, sample_students_1);
        Department d2 = new Department("Department of Modern Magecraft Theory", 1, sample_teachers_2, sample_students_2);

        System.out.println(d1.toString());
        System.out.println(d2.toString());
    }

}