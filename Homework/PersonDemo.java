public class PersonDemo {
    public static void main(String[] args) {

        // Write a driver program to test each of the methods,
        // including each of the four constructors and at least one true and one false
        // case for each of the test methods.

        Person homunculusOne = new Person("Gamma", 1);
        Person homunculusTwo = new Person("Apyr");
        Person homunculusThree = new Person(444);
        Person homunculusFour = new Person();

        // Test 1.1: Constructor all params 
        if (!homunculusOne.getName().equals("Gamma") ||
        homunculusOne.getAge() != 1) {
            System.out.println("ERROR 1.1: CONSTRUCTOR OR GET-RETURN");
        } else {
            System.out.println("PASS 1.1");
        }

        if (homunculusOne.getName().equals("") ||
        homunculusOne.getAge() == 0) {
            System.out.println("ERROR 1.12: CONSTRUCTOR OR GET-RETURN");
        } else {
            System.out.println("PASS (FALSE CASE) 1.12");
        }

        // Test 1.2 Constructor name param
        if (!homunculusTwo.getName().equals("Apyr") ||
        homunculusTwo.getAge() != 0){
            System.out.println("ERROR 1.2: CONSTRUCTOR OR GET-RETURN");
        } else {
            System.out.println("PASS 1.2");
        }

        if (homunculusTwo.getName().equals("")){
            System.out.println("ERROR 1.21: CONSTRUCTOR OR GET-RETURN");
        } else {
            System.out.println("PASS (FALSE CASE) 1.21");
        }

        // Test 1.3: Constructor age param
        if (homunculusThree.getAge() != 444 ||
        !homunculusThree.getName().equals("NA")){
            System.out.println("ERROR 1.3: CONSTRUCTOR OR GET-RETURN");
        } else {
            System.out.println("PASS 1.3");
        }

        if (homunculusThree.getAge() == 0){
            System.out.println("ERROR 1.31: CONSTRUCTOR OR GET-RETURN");
        } else {
            System.out.println("PASS (FALSE CASE) 1.31");
        }

        // Test 1.4: Constructor default param
        if (!homunculusFour.getName().equals("No name yet") ||
        homunculusFour.getAge() != 0) {
            System.out.println("ERROR 1.4: CONSTRUCTOR OR GET-RETURN");
            System.out.println(homunculusFour.getName() + "//" + homunculusFour.getAge());
        } else {
            System.out.println("PASS 1.4");
        }

        if (homunculusFour.getName().equals("") ||
        homunculusFour.getAge() == -1) {
            System.out.println("ERROR 1.41: CONSTRUCTOR OR GET-RETURN");
        } else {
            System.out.println("PASS (FALSE CASE) 1.41");
        }

        // Test 1.5: createToddler()
        Person testAd = Person.createAdult();
        if (testAd.getAge() != 21){
            System.out.println("ERROR 1.5: WRONG AGE");
        } else {
            System.out.println("PASS 1.5");
        }

        if (testAd.getName() == null){
            System.out.println("ERROR 1.51: BAD METHOD CALL");
        } else {
            System.out.println("PASS (FALSE CASE) 1.51");
        }

        // Test 1.6: createToddler()
        Person testTo = Person.createToddler();
        if (testTo.getAge() != 2){
            System.out.println("ERROR 1.6: WRONG AGE");
            System.out.println();
        } else {
            System.out.println("PASS 1.6");
        }

        if (testTo.getName() == null){
            System.out.println("ERROR 1.61: BAD METHOD CALL");
        } else {
            System.out.println("PASS (FALSE CASE) 1.61");
        }

        // Test 1.7: createPreschooler()
        Person testPre = Person.createPreschooler();
        if (testPre.getAge() != 5){
            System.out.println("ERROR 1.7: WRONG AGE");
        } else {
            System.out.println("PASS 1.7");
        }

        if (testPre.getName() == null){
            System.out.println("ERROR 1.71: BAD METHOD CALL");
        } else {
            System.out.println("PASS (FALSE CASE) 1.71");
        }

        // Test 1.8: createAdolescent()
        Person testAdo = Person.createAdolescent();
        if (testAdo.getAge() != 9){
            System.out.println("ERROR 1.8: WRONG AGE");
        } else {
            System.out.println("PASS 1.8");
        }

        if (testAdo.getName() == null){
            System.out.println("ERROR 1.81: BAD METHOD CALL");
        } else {
            System.out.println("PASS (FALSE CASE) 1.81");
        }

        // Test 1.9: createTeenager()
        Person testTee = Person.createTeenager();
        if (testTee.getAge() != 15){
            System.out.println("ERROR 1.9: WRONG AGE");
        } else {
            System.out.println("PASS 1.9");
        }

        if (testTee.getName() == null){
            System.out.println("ERROR 1.91: BAD METHOD CALL");
        } else {
            System.out.println("PASS (FALSE CASE) 1.91");
        }

        // Test 2.0: Set method
        homunculusFour.setAge(1);
        homunculusFour.setName("exists");
        if (homunculusFour.getAge() != 1 || 
        !homunculusFour.getName().equals("exists")){
            System.out.println("ERROR 2.0: SET ERROR");
            System.out.println(homunculusFour.getAge() + homunculusFour.getName());
        } else {
            System.out.println("PASS 2.0");
        }
    }
}