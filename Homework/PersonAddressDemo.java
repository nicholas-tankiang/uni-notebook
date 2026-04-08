    public static void main(String[] args) {
        // Testing var assignments via constructor
        PersonAddress humanOne = new PersonAddress("James", "May", "james.may@hotmail.com", "01377 241241");
        PersonAddress humanTwo = new PersonAddress("John", "Hammond", "jham@gmail.com", "0141-420-4050");

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


        
        
    }