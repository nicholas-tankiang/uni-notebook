    public static void main(String[] args) {
        // Testing var assignments via constructor
        PersonAddress humanOne = new PersonAddress("James", "May", "james.may@hotmail.com", "01377 241241");
        PersonAddress humanTwo = new PersonAddress("John", "Hammond", "jham@gmail.com", "0141-420-4050");
        PersonAddress humanThree = new PersonAddress("James", "May", "jamesmay_alt@outlook.com", "01377 241241");

        // Test getter methods
        System.out.println("1: GETTER_RETURNS");
        if (
            humanOne.getFirstName().equals("James") &&
            humanOne.getLastName().equals("May") &&
            humanOne.getEmail().equals("james.may@hotmail.com") &&
            humanOne.getTele().equals("01377241241") &&
            humanTwo.getTele().equals("01414204050"))
            {
                System.out.println("PASS 1");
            } else {
                System.out.println("FAIL 1");
            }
        
        // Test setter methods

        // Test same name method
        // EXPECTED VALUE: FALSE
        System.out.println("3: SAMENAME_METHOD");
        if (humanOne.sameNameTest(humanTwo)){
            System.out.println("PASS 3");
        } else {
            System.out.println("FAIL 3");
        }

        System.out.println("3.1:");
        if (humanOne.sameNameTest(humanThree)){
            System.out.println("PASS 3.1");
        } else {
            System.out.println("FAIL 3.1");
        }

    }