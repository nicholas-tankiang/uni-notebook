import java.util.Scanner;

public class HomeworkFourLoops{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Problem 1 setup
        System.out.println("1: ENTER WORD");
        String userInput = input.nextLine();
        problemOneWhile(userInput);
        problemOneDoWhile(userInput);
    }

    /*
    

    Q4.2: Develop an algorithm for computing the month-by-month balance in your savings account. 
    You can make one transaction - a deposit or a withdrawal - each month. 
    Interest is added to the account at the beginning of each month. 
    The monthly interest rate is the yearly percentage rate divided by 12.

    Q4.5. Convert the following code so that it uses nested while statements instead of for statements:

    Q4.6 Write a for statement to compute the sum 1 + 22 + 32 + 42 + 52 + ... + n2.

    Q4.7 Repeat the previous question but use the comma operator and omit the for-statement’s body.
    */

    public static void problemOneWhile(String userInput){
    /*
    Q4.1: 
        Write a fragment of code that will read words from the keyboard until the word is entered. 
        For each word except done, report whether its first character is equal to its last character. 
        For the required loop, use a
        a. while statement
        b. do-while statement
    */
        boolean noMatch = true;

        while (noMatch){
            // If input first char equals last char of input
            if (userInput.charAt(0) == (userInput.charAt(userInput.length() - 1))){
                System.out.println("Match found");
                break;
            }
            System.out.println("First char does not equal last char, try again...");
        }
    }

    public static void problemOneDoWhile(String userInput){
        
    }
}