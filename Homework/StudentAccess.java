public class StudentAccess{

    public static void main(String[] args) {
        //setting two student cases
        Student TestSubject_full = new Student("subject one", "001", 2.01, 1);
        Student TestSubject_default = new Student();
        Student TestSubject_third = new Student("Three", "99999", 0.01, 90);
        
        //setting fields for default constructor case
        String testName = "subject two";
        String testId = "100101010";
        double testGpa = 40.9;
        int testAge = -2;

        TestSubject_default.setName(testName);
        TestSubject_default.setId(testId);
        TestSubject_default.setGpa(testGpa);
        TestSubject_default.setAge(testAge);

        //get method test
        System.out.println(
            "Name: " + TestSubject_full.getName() + 
            "\nID: " + TestSubject_full.getId() + 
            "\nGPA: " + TestSubject_full.getGpa() + 
            "\nAge: " + TestSubject_full.getAge() 
        );

        //toString test
        System.out.println(TestSubject_full.toString());
        System.out.println(TestSubject_default.toString());
        System.out.println(TestSubject_third.toString());
    }
}