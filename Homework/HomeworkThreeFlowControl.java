import java.util.Scanner;

public class HomeworkThreeFlowControl{
    // set gradeValue to global var 
    public static double gradeValue = 0.0;
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);

        // Problem 5 setup
        String letter = keyboard.nextLine();
        System.out.println("gradeValue's result is: " + problemFive(letter));
    }


    public static double problemFive(String letter){
        /*
        5. Write a switch statement to convert a letter of grade into an 
        equivalent numeric value on a four-point scale. Set the value of 
        the variable gradeValue to 4.0 for an A, 3.0 for a B, 2.0 for a C, 
        1.0 for a D, and 0.0 for an F. For any other letter, 
        set the value to 0.0 and display an error message.
        */

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

    public static double problemSix(String letter){
        /*
        Consider the previous question but include + or − letter grades. A+ is 4.25, A− is 3.75, 
        B+ is 3.25, B− is 2.75, and so on.
        1. Why can’t we use one switch statement with no other conditionals to convert these additional letter grades?
        2. Write a fragment of code that will do the conversion using a multibranch if-else statement.
        3. Write a fragment of code that will do the conversion using nested switch statements.

        A: 
        1) 
        */

        //2

    }

    public static double problemSeven(String letter){
    /*
    Write a program to play the rock-paper-scissor game. Each of two users types in 
    either P, R, or S. The program then announces the winner as well as the basis for 
    determining the winner: paper covers rock, rock breaks scissors, scissors cuts paper, 
    or nobody wins. Your program should allow the users to use lowercases as well as uppercase letters.
    */
    
    }

class grades{
    protected static double gradeValue = 0.0;

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
   

