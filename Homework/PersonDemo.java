public class PersonDemo {
    public static void main(String[] args) {

        // Write a driver program to test each of the methods,
        // including each of the four constructors and at least one true and one false
        // case for each of the test methods.

        Person homunculusOne = new Person("Gamma Theta", 1);
        Person homunculusTwo = new Person("Apyr");
        Person homunculusThree = new Person(444);
        Person homunculusFour = new Person();

        // Test 1.1: Constructor all params 
        if (!homunculusOne.getName().equals("Gamma Theta") ||
        homunculusOne.getAge() != 1) {
            System.out.println("ERROR 1.1: CONSTRUCTOR OR GET-RETURN");
        } else {
            System.out.println("PASS 1.1");
        }

        // Test 1.2 Constructor name param
        if (!homunculusTwo.getName().equals("Apyr")){
            System.out.println("ERROR 1.2: CONSTRUCTOR OR GET-RETURN");
        } else {
            System.out.println("PASS 1.2");
        }

        // Test 1.3: Constructor age param
        if (homunculusThree.getAge() != 444){
            System.out.println("ERROR 1.3: CONSTRUCTOR OR GET-RETURN");
        } else {
            System.out.println("PASS 1.3");
        }

        // Test 1.4: Constructor default param
        if (!homunculusFour.getName().equals("No name") ||
        homunculusOne.getAge() != 0) {
            System.out.println("ERROR 1.4: CONSTRUCTOR OR GET-RETURN");
        } else {
            System.out.println("PASS 1.4");
        }
    }
}