public class ProfessorAccess{

    public static void main(String[] args) {
        // three professor objects using fully loaded const.
        Professor Ishmael = new Professor("Ishmael", "Literature", 1.21e2, 12);
        Professor Gregor = new Professor("Gregor Samsa", "Biology", 1, 100);
        // test case for bad input (negative salary)
        Professor Debt = new Professor("Nameless", "NA", -100, 10);

        // copy of above prof objects to copy const.
        Professor Ishmael_clone = new Professor(Ishmael);
        Professor Gregor_clone = new Professor(Gregor);
        Professor Debt_clone = new Professor(Debt);

        // tests only print on fail
        // accessor test
        String name_test = "Ishmael";
        if (!Ishmael.getName().equals(name_test)) {
            System.out.println("Test 1 FAIL");
        }
        String dept_test = "Biology";
        if (!Gregor.getDepartment().equals(dept_test)) {
            System.out.println("Test 2 FAIL");
        }
        double salary_test = 1.21e2;
        if (Ishmael.getAnnualSalary() != salary_test) {
            System.out.println("Test 3 FAIL");
        }
        int year_test = 100;
        if (Gregor.getYearInProfession() != year_test){
            System.out.println("Test 4 FAIL");
        }

        // mutator test
        Debt_clone.setName("Named");
        if (!Debt_clone.getName().equals("Named")) {
            System.out.println("Test 5 FAIL");
        }
        Debt_clone.setDepartment("Alchemy");
        if (!Debt_clone.getDepartment().equals("Alchemy")){
            System.out.println("Test 6 FAIL");
        }
        double tmpDbl = -10000.01;
        Debt_clone.setAnnualSalary(tmpDbl);
        if (Debt_clone.getAnnualSalary() != (tmpDbl)){
            System.out.println("Test 7 FAIL");
        }
        int tmpInt = 12;
        Debt_clone.setYearInProfession(tmpInt);
        if (Debt_clone.getYearInProfession() != (tmpInt)){
            System.out.println("Test 8 FAIL");
        }

        // tostring test
        System.out.println(
            Ishmael.toString() + "\n"
            + Gregor.toString() + "\n"
            + Debt.toString() + "\n"
            + Ishmael_clone.toString() + "\n"
            + Gregor_clone.toString() + "\n"
            + Debt_clone.toString());
    }
}