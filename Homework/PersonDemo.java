public class PersonDemo {
    public static void main(String[] args) {

        Person homunculusOne = new Person("Gamma Theta", 1);
        Person homunculusTwo = new Person("Apyr");
        Person homunculusThree = new Person(444);

        // Test 1.1: Constructor all params 
        if (!homunculusOne.getName().equals("Gamma Theta") ||
        homunculusOne.getAge() != 1) {
            System.out.println("ERROR 1.1: CONSTRUCTION OR GET-RETURN");
        } else {
            System.out.println("PASS 1.1");
        }

        // Test 1.2 Constructor name param
        if (!homunculusTwo.getName().equals("Apyr")){
            System.out.println("ERROR 1.2: CONSTRUCTION OR GET-RETURN");
        } else {
            System.out.println("PASS 1.2");
        }

        // Test 1.3: Constructor age param
        if (homunculusThree.getAge() != 444){
            System.out.println("ERROR 1.3: CONSTRUCTION OR GET-RETURN");
        } else {
            System.out.println("PASS 1.3");
        }

        // Test 1.4: Constructor default param
    }
}