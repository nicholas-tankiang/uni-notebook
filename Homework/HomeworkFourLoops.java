import java.util.Scanner;

public class HomeworkFourLoops{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Problem 1 setup
        System.out.println("1: ENTER WORD");
        String userInputOne = input.nextLine();
        problemOneWhile(userInputOne);
        problemOneDoWhile();

        // Problem 2 
        problemTwo();

        // Problem 3
        problemThree();

        // Problem 4 setup
        System.out.println("4: ENTER SOME POSITIVE NUMBER N");
        int userInputFour = input.nextInt();
        problemFour(userInputFour);

        // Problem 5 setup
        System.out.println("5: ENTER SOME POSITIVE NUMBER N");
        int userInputFive = input.nextInt();
        problemFive(userInputFive);

        // Problem 6
        problemSix();
    }

    public static void problemOneWhile(String userInput){
    /*
    Q4.1: 
        Write a fragment of code that will read words from the keyboard until the word is entered. 
        For each word except done, report whether its first character is equal to its last character. 
        For the required loop, use a
        a. while statement
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Problem One - While : START");

        // while word is not "done"
        while (!userInput.equals("done")){
            // If input first char equals last char of input
            if (userInput.charAt(0) == (userInput.charAt(userInput.length() - 1))){
                System.out.println("Char equals last char");
            } else {
                System.out.println("First char does not equal last char");
            }
            // get next input
            userInput = input.nextLine();
        }
    }

    public static void problemOneDoWhile(){
        // Q4.1 cont.
        // b. do-while statement
        Scanner input = new Scanner(System.in);
        String userInput;
        System.out.println("Problem One - Do While : START");
        System.out.println("1 CONT: ENTER WORD");

        do {
            userInput = input.nextLine();
            if (userInput.charAt(0) == (userInput.charAt(userInput.length() - 1))){
                System.out.println("Char equals last char");
            } else {
                System.out.println("First char does not equal last char");
            }
        } while (!userInput.equals("done"));
    }

    public static void problemTwo(){
    /*
    Q4.2: 
        Develop an algorithm for computing the month-by-month balance in your savings account. 
        You can make one transaction - a deposit or a withdrawal - each month. 
        Interest is added to the account at the beginning of each month. 
        The monthly interest rate is the yearly percentage rate divided by 12.
    */
        System.out.println("Problem Two : START");

        Scanner input = new Scanner(System.in);

        // set annual rate by user
        System.out.println("ENTER ANNUAL PERCENT RATE");
        double annualPercentRate = input.nextDouble();
        // assume percent input
        double monthlyRate = (annualPercentRate / 100) / 12;

        double balance = 0;

        enum Months{
            January, February, March, April, May, June, July, August, September, October, November, December
        }
        Months[] months = Months.values();

        for (int i = 0; i < 12; i++){
            balance += balance * monthlyRate;

            System.out.println("Please enter amount for " + months[i] +
            ". Positive for deposit, negative for withdrawal.");
            double amount = input.nextDouble();

            balance += amount;
            
            System.out.println(months[i] + " balance is... " + balance);
        }
        
        System.out.println("Standing balance is... " + balance);
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
        System.out.println("Problem THREE : START");

        int i = 0;
        int j = 0;
        int s = 0;
        int t = 1;
        while (i < 10) { 
            s += i;
            j = i;
            
            while (j > 0) { 
                t *= (j - i);
                j--;
            }
            s *= t;
            System.out.println("T is " + t);

            i++;
        }
        System.out.println("S is " + s);
    }

    public static void problemFour(int n){
        //Q4.6 Write a for statement to compute the sum 1 + 22 + 32 + 42 + 52 + ... + n^2.
        System.out.println("Problem FOUR : START");

        int sum = 0;
        System.out.println("LOOP START: SUM IS: " + sum);

        for (int i = 1; i <= n*n; i++) {
            sum += i * i;
            System.out.println("Current sum is: " + sum);
        }

        System.out.println("LOOP FINISH");
    }

    public static void problemFive(int n){
        // Q4.7 Repeat the previous question but use the comma operator and omit the for-statement’s body.
        System.out.println("Problem FIVE : START");

        int sum = 0;
        System.out.println("LOOP START: SUM IS: " + sum);

        for (int i = 1; i <= n * n; sum += i * i, i++) ;

        System.out.println("LOOP FINISH. SUM IS: " + sum);
    }

    public static void problemSix(){
    //Q4.12 Define an enumeration for each of the months of the year. 
        //Use a for-each statement to display each month.
        System.out.println("Problem SIX : START");

        enum Months{
            January, February, March, April, May, June, July, August, September, October, November, December
        }

        for (Months m : Months.values()) {
            System.out.println(m);
        }
    }

    /*
    problemSeven: 
    What does the following fragment of code display? 
    What do you think the programmer intended the code to do, and how would you fix it?

    A: It seems that the intention of this chunk of code is to take the product of all numbers from
    0 to the value provided by max using a loop. The issue occurs in the first loop as the product variable,
    which was originally 1, is multiplied by the start of the loop, 0, resulting in the only variable holding
    the value to be set to 0. This is a problem because every succeeding loop, i is multiplied by 0, erasing
    the value completely. 

    To fix this issue, the programmer can simply add the result of each loop back into product instead of setting
    it to a new value. So, instead of:

    product = product * i

    Do:

    product = product + (product * i)

    By adding, we no longer have to deal with issues from multiplying product by 0.
    */

    /*
    problemEight:
    Q4.19 What does the following fragment of code display? 
    What do you think the programmer intended the code to do, and how would you fix it?

    A: The programmer's intention seems to be similar to the previous problem, but with the addition of 
    also tracking a "product" variable, that is the product of product's value multiplied by iterator i,
    within the loop. So at i = 1, the sum will be 0 + 1, and product will be 1 * 1.

    The issue is that, ignoring the lack of a space between int and product, the for loop lacks braces.
    This is a problem because the loop is executing more than a single statement, therefore it needs braces.
    To fix this, we would add braces to the statement like so:

    for (int i = i; i <= max; i++) {
        sum = sum + i;
        product = product * i;
    }
    System.out.println("PRINT TEXT...")

    */
}