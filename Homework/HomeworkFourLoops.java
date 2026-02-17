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
    */
        boolean isSameChar = true;

        while (isSameChar){
            // If input first char equals last char of input
            if (userInput.charAt(0) == (userInput.charAt(userInput.length() - 1))){
                System.out.println("Match found");
                break;
            }
            System.out.println("First char does not equal last char, try again...");
        }
    }

    public static void problemOneDoWhile(String userInput){
        // Q4.1 cont.
        // b. do-while statement
        boolean isSameChar = true;

        do {
            if (userInput.charAt(0) == (userInput.charAt(userInput.length() - 1))){
                System.out.println("Match found");
                break;
            }
        } while (isSameChar);
    }

    public static void problemTwo(){
    /*
    Q4.2: 
        Develop an algorithm for computing the month-by-month balance in your savings account. 
        You can make one transaction - a deposit or a withdrawal - each month. 
        Interest is added to the account at the beginning of each month. 
        The monthly interest rate is the yearly percentage rate divided by 12.
    */
        //PROMPT DEPOSIT
        //PROMPT WITHDRAWAL
        //ADD INTERESTE
        //BALANCE = CURRENT BALANCE + INTEREST RATE 
        //INTEREST RATE = YEARLY PERCENTAGE RATE / 12
        Scanner input = new Scanner(System.in);
        double annualPercentRate = 0;
        double interestAmount = annualPercentRate / 12;

        double balance = 0;
        System.out.println("Please enter current month deposit.");
        double deposit = input.nextDouble();
        System.out.println("Please enter current month withdrawal.");
        double withdrawal = input.nextDouble();

        balance += interestAmount;
        System.out.println("Current month balance is... " + balance);
    }

    public static void problemThree(){
    //Q4.5. Convert the following code so that it uses nested while statements instead of for statements:
    /*
        int s = 0;
        int t = 1;
        for (int i = 0; i < 10; i++) {
            s = s + i;
            for (int j = i; j > 0; j--) {
                t = t * (j - i);
            }
            s = s * t;
            System.out.println("T is " + t);
        }
        System.out.println("S is " + s);
    }
    */
        int s = 0;
        int t = 1;
        int index = 0;
        while (true) { 
            s += index;
        }
    }
}