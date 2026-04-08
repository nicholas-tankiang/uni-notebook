    public static void main(String[] args) {
        // Testing var assignments via constructor
        PersonAddress humanOne = new PersonAddress("James", "May", "james.may@hotmail.com", "01377241241");
        PersonAddress humanTwo = new PersonAddress("John", "Hammond", "jham@gmail.com", "01414204050");
        PersonAddress humanThree = new PersonAddress("James", "May", "jamesmay_alt@outlook.com", "01377241241");

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
                System.out.println(
                    humanOne.getFirstName() + " | " + 
                    humanOne.getLastName() + " | " +
                    humanOne.getEmail() + " | " + 
                    humanOne.getTele() + " | " + 
                    humanTwo.getTele()
                    );
            }
        
        // Test setter methods
        System.out.println("2: SETTER_METHOD");
        humanOne.setEmail("jamesmay_new@gmail.com");
        if (humanOne.getEmail().equals("jamesmay_new@gmail.com")){
            System.out.println("PASS 2");
        } else {
            System.out.println("FAIL 2");
            System.out.println(humanOne.getEmail());
        }

        System.out.println("2.1:");
        humanOne.setEmail("white space @gmail.com");
        if (humanOne.getEmail().equals("whitespace@gmail.com")){
            System.out.println("PASS 2.1");
        } else {
            System.out.println("FAIL 2.1");
            System.out.println(humanOne.getEmail());
        }

        System.out.println("2.2:");
        humanOne.setTele("0300-0-23");
        if (humanOne.getTele().equals("0300023")){
            System.out.println("PASS 2.2");
        } else {
            System.out.println("FAIL 2.2");
            System.out.println(humanOne.getTele());
        }

        // Test same name method
        System.out.println("3: SAMENAME_RETURNS");
        // EXPECTED VALUE: FALSE
        if (humanOne.sameNameTest(humanTwo) == false){
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