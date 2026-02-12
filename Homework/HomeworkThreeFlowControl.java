import java.util.Scanner;

public class HomeworkThreeFlowControl{
    // set gradeValue to global var 
    public static double gradeValue = 0.0;
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);

        /*
        5. Write a switch statement to convert a letter of grade into an 
        equivalent numeric value on a four-point scale. Set the value of 
        the variable gradeValue to 4.0 for an A, 3.0 for a B, 2.0 for a C, 
        1.0 for a D, and 0.0 for an F. For any other letter, 
        set the value to 0.0 and display an error message.
        */
       String letter = keyboard.nextLine();
       System.out.println("gradeValue's result is: " + problemFour(letter));
    }


    public static double problemFour(String letter){
        double gradeValue;

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