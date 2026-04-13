public class PersonDemo {
    public static void main(String[] args) {

        Person homunculusOne = new Person("Gamma Theta", 1);
        
        // Test 1.1: Constructor all params 
        if (!homunculusOne.getName().equals("Gamma Theta") ||
        homunculusOne.getAge() != 1) {
            System.out.println("ERROR 1.1: CONSTRUCTION OR GET-RETURN");
        } else {
            System.out.println("PASS 1.1");
        }
    }
}