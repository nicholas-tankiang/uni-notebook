import java.util.Scanner;

public class lab3{
    public static double gradeValue = 0.0;
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);
        int input1 = keyboard.nextInt();
        int input2 = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("ENTER YES OR NO");
        String input3 = keyboard.nextLine();


        System.out.println(problemOne(input1));
        System.out.println("Value of x is: " + problemTwo(input2));
        System.out.println("Problem three result: " + problemThree(input3));

        String input4 = keyboard.nextLine();
        problemFour(input4);

        
    }

    public static boolean problemOne(int input){
        boolean isTrue = 0 < input && input < 100;
            return isTrue;
    }

    public static int problemTwo(int x){
        switch (x % 2){
            case (0):
                x /= 2;
                break;
            case (1):
                x *= 3;
                x += 1;
                break;
        }
        return x;
    }

    public static boolean problemThree(String input){
        if (input == "yes" || input == "y"){
            return true;
        } else {
            return false;
        }
    }

    /*
    7. What is the value of each of the following boolean expressions if x is 5, y
    is 10, and z is 15?
    a. (x < 5 && y > x)
    b. (x < 5 || y > x)
    c. (x > 3 || y < 10 && z == 15)
    d. (!(x > 3) && x != z || x + y == z)

    A:
    false
    B: 
    true
    C: 
    true
    D: 
    true
    */

    public static double problemFour(String Letter){
        switch (Letter){
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