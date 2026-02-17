import java.util.Scanner;

public class HomeworkThreeFlowControl{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Problem 3 setup
        System.out.println("3: ENTER CHECK AMOUNT");
        double checkAmount = keyboard.nextDouble();
        System.out.println("3: Check amount is: " + problemThree(checkAmount));
        keyboard.nextLine();

        // Problem 5 setup
        System.out.println("5: ENTER LETTER A THROUGH F");
        String letter = keyboard.nextLine().toUpperCase();
        System.out.println("5: gradeValue's result is: " + problemFive(letter));

        // Problem 6 setup
        System.out.println("6: ENTER LETTER AND/OR SIGN, A THROUGH F");
        letter = keyboard.nextLine().toUpperCase();
        System.out.println("6 IF-ELSE: gradeValue's result is: " + problemSixIfElse(letter));
        System.out.println("6 NESTED SWITCH: gradeValue's result is: " + problemSixNestedSwitch(letter));

        // Problem 7 setup
        System.out.println("7: P1, ENTER R, P, OR S");
        String letterP1 = keyboard.nextLine().toLowerCase();
        System.out.println("7: P2, ENTER R, P, OR S");
        String letterP2 = keyboard.nextLine().toLowerCase();
        problemSeven(letterP1, letterP2);
    }

    /*
    problemOne:
        Consider the following fragment of code: 

        if (x > 5) 
        System.out.println("A"); 
        else if (x < 10) 
        System.out.println("B"); 
        else 
        System.out.println("C"); 

        What is displayed if x is 4; 5; 6; 9; 10; 11

        A: If x is...

        (4): 
        B
        (5): 
        B
        (6): 
        A
        B
        (9): 
        A
        B
        (10):
        A
        (11):
        A
    */

    /*
    problemTwo:
        Consider the following fragment of code: 

        if (x > 5) { 
            System.out.println("A"); 
            if (x < 10) 
            System.out.println("B"); 
        } else 
        System.out.println("C"); 

        What is displayed if x is 4; 5; 6; 9; 10; 11

        A: If x is...

        (4):
        C
        (5):
        C
        (6):
        A
        B
        (9):
        A
        B
        (10):
        A
        (11):
        A
    */

    public static double problemThree(double checkAmount) {
    /*
    problemThree:
        We would like to assess a service charge for cashing a check. 
        The service charge depends on the amount of the check. 
        If the check amount is less than $10, we will charge $1. 
        If the amount is greater than $10 but less than $100, we will charge 10 percent of the amount. 
        If the amount is greater than $100, but less than $1,000, we will charge $5 plus 5 percent of the amount. 
        If the value is over $1,000, we will charge $40 plus 1 percent of the amount. 
        Use a multibranch if-else statement in a fragment of code to compute the service charge.
    */
        double chargeAmount = 0;

        // guard clause; if negative number entered, exit method
        if (checkAmount < 0){
            System.out.println("CANNOT EVALUATE NEGATIVE NUMBER");
            return checkAmount;
        }
        if (checkAmount < 10) {
            chargeAmount = 1;
            return chargeAmount;
        } else if (checkAmount > 10 && checkAmount < 100) {
            chargeAmount = checkAmount * 0.1;
            return chargeAmount;
        } else if (checkAmount > 100 && checkAmount < 1000) {
            chargeAmount = (checkAmount * 0.05) + 5;
            return chargeAmount;
        } else if (checkAmount > 1000) {
            chargeAmount = (checkAmount * 0.01) + 40;
            return chargeAmount;
        }

        System.out.println("ERROR: Invalid input entered");
        return chargeAmount;
    }

    /*
    problemFour: 
        What is the value of each of the following Boolean expressions if x is 5, y is 10, and z is 15?

        1. (x < 5 && y > x)
        2. (x < 5 || y > x)
        3. (x > 3 || y < 10 && z == 15)
        4. (! (x > 3) && x! = z || x + y == z)

        A:
        1. false
        2. true
        3. true
        4. 
        //(!(true) AND true OR true)
        //(false OR true)
        true
    */

    public static double problemFive(String letter){
    /*
        5. Write a switch statement to convert a letter of grade into an 
        equivalent numeric value on a four-point scale. Set the value of 
        the variable gradeValue to 4.0 for an A, 3.0 for a B, 2.0 for a C, 
        1.0 for a D, and 0.0 for an F. For any other letter, 
        set the value to 0.0 and display an error message.
    */

        double gradeValue = 0;

        switch (letter){
            case "A":
                gradeValue = 4.0;
                return gradeValue;
            case "B":
                gradeValue = 3.0;
                return gradeValue;
            case "C":
                gradeValue = 2.0;
                return gradeValue;
            case "D":
                gradeValue = 1.0;
                return gradeValue;
            case "F":
                gradeValue = 0.0;
                return gradeValue;
            default:
                gradeValue = 0.0;
                System.out.println("ERROR");
                return gradeValue;
        }
    }

    /*
    problemSix:
        6. Consider the previous question but include + or − letter grades. 
        A+ is 4.25, A− is 3.75, B+ is 3.25, B− is 2.75, and so on.
        1. Why can’t we use one switch statement with no other conditionals to convert these 
        additional letter grades?

        A: 
        1) I believe that the original intent of this question was to imply that you cannot use
        a string as a condition in a switch statement, but I believe that it is currently possible in java.
        In this original case, the switch statement would be running on a Char condition to evaluate the 
        letter grades, whereas adding the +/- would have forced the switch statement to evaluate Strings instead,
        which this question presumably did not believe to be a valid condition.
    */

    public static double problemSixIfElse(String letter){
        // 2. Write a fragment of code that will do the conversion using a multibranch if-else statement.
        double gradeValue = 0;

        if (letter.equals("A+")) {
            gradeValue = 4.25;
            return gradeValue;
        } else if (letter.equals("A")) {
            gradeValue = 4.0;
            return gradeValue;
        } else if (letter.equals("A-")) {
            gradeValue = 3.75;
            return gradeValue;
        } else if (letter.equals("B+")) {
            gradeValue = 3.25;
            return gradeValue;
        } else if (letter.equals("B")) {
            gradeValue = 3.0;
            return gradeValue;
        } else if (letter.equals("B-")) {
            gradeValue = 2.75;
            return gradeValue;
        } else if (letter.equals("C+")) {
            gradeValue = 2.25;
            return gradeValue;
        } else if (letter.equals("C")) {
            gradeValue = 2.0;
            return gradeValue;
        } else if (letter.equals("C-")) {
            gradeValue = 1.75;
            return gradeValue;
        } else if (letter.equals("D+")) {
            gradeValue = 1.25;
            return gradeValue;
        } else if (letter.equals("D")) {
            gradeValue = 1.0;
            return gradeValue;
        } else if (letter.equals("D-")) {
            gradeValue = 0.75;
            return gradeValue;
        } else if (letter.equals("F+")) {
            gradeValue = 0.25;
            return gradeValue;
        } else if (letter.equals("F-")) {
            gradeValue = 0.0;
            return gradeValue;
        } 

        gradeValue = 0.0;
        System.out.println("ERROR: INVALID INPUT");
        return gradeValue;
    }

    public static double problemSixNestedSwitch(String letter){
        // 3. Write a fragment of code that will do the conversion using nested switch statements.
        double gradeValue = 0;

        // Gets base letter
        char letterPos = letter.charAt(0);
        // Must declare letterSignPos here to let variable be available to rest of method
        char letterSignPos = 0;

        // Gets sign if letter is longer than one
        if (letter.length() > 1) {
            letterSignPos = letter.charAt(1);
        }

        switch (letterPos) {
            case 'A':
                gradeValue = 4.0;
                switch (letterSignPos) {
                    case '+':
                        gradeValue = 4.25;
                        break;
                    case '-':
                        gradeValue = 3.75;
                        break;
                }
                break;
            case 'B':
                gradeValue = 4.0;
                switch (letterSignPos) {
                    case '+':
                        gradeValue = 4.25;
                        break;
                    case '-':
                        gradeValue = 3.75;
                        break;
                }
                break;
            case 'C':
                gradeValue = 4.0;
                switch (letterSignPos) {
                    case '+':
                        gradeValue = 4.25;
                        break;
                    case '-':
                        gradeValue = 3.75;
                        break;
                }
                break;
            case 'D':
                gradeValue = 4.0;
                switch (letterSignPos) {
                    case '+':
                        gradeValue = 4.25;
                        break;
                    case '-':
                        gradeValue = 3.75;
                        break;
                }
                break;
            case 'F':
                gradeValue = 4.0;
                switch (letterSignPos) {
                    case '+':
                        gradeValue = 4.25;
                        break;
                    case '-':
                        gradeValue = 3.75;
                        break;
                }
                break;
        }

        System.out.println("ERROR");
        return gradeValue;
    }

    public static void problemSeven(String letterP1, String letterP2){
        /*
        Write a program to play the rock-paper-scissor game. Each of two users types in 
        either P, R, or S. The program then announces the winner as well as the basis for 
        determining the winner: paper covers rock, rock breaks scissors, scissors cuts paper, 
        or nobody wins. Your program should allow the users to use lowercases as well as uppercase letters.
        */
        
        // concatenate inputs to serve as conditional  
        String lettersConcat = letterP1 + "-" + letterP2;
        switch (lettersConcat) {
            // p1 win conditions
            case "p-r":
            case "r-s":
            case "s-p":
                System.out.println("P1 WIN");
                break;
            // p2 win conditions
            case "p-s":
            case "r-p":
            case "s-r":
                System.out.println("P2 WIN");
                break;     
            // tie conditions
            case "p-p":
            case "r-r":
            case "s-s":
                System.out.println("TIE");
                break;
            // if unexpected input
            default:
                System.out.println("ERROR, INVALID INPUT");
        }
    }
}

/*
// IGNORE: Polymorphism class test

public class grades{
    protected static double gradeValue = 0.0;

    // change this to enum
    public static double returnGrade(String letter){ 
        switch (letter){
            case "A":
                gradeValue = 4.0;
                return gradeValue;
            case "B":
                gradeValue = 3.0;
                return gradeValue;
            case "C":
                gradeValue = 2.0;
                return gradeValue;
            case "D":
                gradeValue = 1.0;
                return gradeValue;
            case "F":
                gradeValue = 0.0;
                return gradeValue;
            default:
                gradeValue = 0.0;
                System.out.println("ERROR");
                return gradeValue;
        }
    }
}
*/