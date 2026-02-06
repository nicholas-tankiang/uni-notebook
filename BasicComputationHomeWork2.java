import java.util.Scanner;

public class BasicComputationHomeWork2{
    public static void main(String[] args) {
        // Instructions: See method implementation beneath Main for non-scanner related answers

        //1.1) Use Scanner to read a floating-point value x.
        Scanner keyboard = new Scanner(System.in);
        float input_1, input_2, input_3;
        // Prompt input
        System.out.println("Enter valid number for problem one.");
        input_1 = keyboard.nextFloat();
        // Call on method problemOne using user input, floating-point value x
        problemOne(input_1);
       
        //2.1) 1. Use Scanner to read a floating-point value x.
        System.out.println("Enter valid number for problem two.");
        input_2 = keyboard.nextFloat();
        problemTwo(input_2);

        //3.1) Use Scanner to read a floating-point value x.
        System.out.println("Enter valid number for problem three.");
        input_3 = keyboard.nextFloat();
        problemThree(input_3);
        // Note to self: because of how nextInt works, the "input stream" stops right before 
        // nextInt's "\n", so calling nextLine() receieves a blank \n string and fails.
        // Line below moves buffer past \n.
        keyboard.nextLine();

        //7 - Input setup
        System.out.println("Enter string for problem seven.");
        String input_4 = keyboard.nextLine();
        problemSeven(input_4);

        //8 - Input setup
        System.out.println("Enter string for problem eight.");
        String input_5 = keyboard.nextLine();
        problemEight(input_5);

        //9 - Method call
        problemNine();
    }

    public static void problemOne(float input_1){
        // Note: Will not execute with invalid input
        /*
        1. Write a program that demonstrates the approximate nature of floating-point values by
        performing the following tasks:
        */
       
        //1.2) Compute 1.0 / x and store the result in y.
        float y = 1 / input_1;
        //1.3) Display x, y, and the product of x and y.
        float product_1 = input_1 * y;
        System.out.println("The value of x is: " + input_1 + " || The value of y is: " + y + " || The product of x and y is: " + product_1);
        //1.4) Subtract 1 from the product of x and y and display the result.
        System.out.println("(X * Y) minus 1 is: " + (product_1 - 1));
        // Try your program with values of x that range from 2e-11 to 2e11. What can you conclude?
        /*
        A: Because it's a float instead of an int, 2e-11 and 2e11 are valid ranges for this program. 
        A float is the correct type for this problem.
        */
    }

    public static void problemTwo(float input_2){
        // Note: Will not execute with invalid input
        /*
        2. Write a program that demonstrates type casting of double values by performing the
        following tasks:
        */

       //2.2) Type cast x to an int value and store the result in y.
       int y = (int)input_2;
       //2.3) Display x and y clearly labeled.
       System.out.println("The value of x is: " + input_2 + " || The value of y is: " + y);
       //2.4) Type cast x to a byte value and store the result in z.
       byte z = (byte)input_2;
       //2.5) Display x and z clearly labeled.
       System.out.println("The value of x is: " + input_2 + " || The value of z is: " + z);
        /*        
        Try your program with positive and negative values of x that range in magnitude from 2e-
        11 to 2e11. What can you conclude?
        */
       y = (int)2e-11;
       z = (byte)2e-11;
       System.out.println("At low end for 2e-11... Int cast is : " + y + " || Byte cast is: " + z);
       y = (int)2e11;
       z = (byte)2e11;
       System.out.println("At high end for 2e11... Int cast is : " + y + " || Byte cast is: " + z);
        /*
        A: The int cast for 2e-11 is 0, and the byte cast for it is also 0, they've been rounded down completely.
        The int cast for 2e11 is rounded to max int value 2147483647, while the byte cast is only -1. 
        I can conclude that bad type casting results in unexpected faulty data loss on abnormal number ranges.
        */
    }

    public static void problemThree(float input_3){
        // Note: Will not execute with invalid input
        /*
        3. Write a program that demonstrates the operator % by performing the following tasks:
        */

        //3.2) Compute x % 2.0 and store the result in y.
        double y = input_3 % 2.0;
        //3.3) Display x and y clearly labeled.
        System.out.println("The value of x is: " + input_3 + " || The value of y is: " + y);
        //3.4) Type cast x to an int value and store the result in z.
        int z = (int)input_3;
        //3.5) Display x, z, and z % 2 clearly labeled.
        System.out.println("x%2 value: " + (input_3%2) + " || z value: " + z + " || z%2 value: " + (y%2));
        /*
        Try your program with positive and negative values of x. What implications do your results have 
        for deciding whether a negative integer is odd?
        */
        // Note: Using y as the input placeholder from this point
        y = 123;
        System.out.println("Positive value " + y + "%2 is: " + (y%2));
        y = -10;
        System.out.println("Negative even value " + y + "%2 is: " + (y%2));
        y = -11;
        System.out.println("Negative odd value " + y + "%2 is: " + (y%2));
        /*  
        A: Negative values by mod 2 will still provide the expected ranges as their positive equivalents.
        -10%2 has a remainder of "-0.0", and -11%2 has an expected remainder of "-1.0".
        To determine whether (most) integers are even or odd, the result of %2 should be 0.
        */
    }

    // 4) problemFour:
    /* 
    If u = 2, v = 3, w = 5, × = 7, and y = 11, what is the value of each of the 
    following expressions, assuming int variables?
    1. u + v * w + ×
    2. u + y % v * w + ×
    3. u++ / v + u++ * w 
    
    A: 
    4.1) u + v * w + × = (v * w) + u + x = (3 * 5) + 2 + 7 = 15 + 2 + 7 = 24
    4.2) u + y % v * w + × = (11%3)(5)+(2)+(7) = (2)5+2+7 = 10+2+7 = 19
    4.3) u++ / v + u++ * w =  (2++)/(3)+(2++)*(5) = 2/3+(2++*5) = 0 + (3*5) = 15
    */

   // 5) problemFive:
   // To do: Note to self: Should probably check logic for this just in case before submission
   /* 
   What changes to the ChangeMaker program in Listing 2.3 are necessary if it 
   also accepts coins for one dollar and half a dollar? 

   A: First, we need to declare the new variables, so declare an int dollars, int dollarsHalf.
   The original program appears to set a temporary variable, originalAmount, to hold the amount as it gets 
   divided by the largest coin factors until it reaches x < 5 (the dime amount) and provides pennies as the
   remainder.
   Following this logic, we should assign the dollar and half dollar to the top of the hierarchy.
   Thus, following "originalAmount = amount;", we should add the following lines:

   dollars = amount / 100;
   amount = amount % 100;
   dollarsHalf = amount / 50;
   amount = dollarsHalf % 50;

   *Note that because the program specifies a limit of 99, representing 99 cents, 
   the dollar would never be used.

   Next, we would need to integrate these values into the print statements. 
   Below the first printline statement, we would add the following two lines:
   System.out.println(dollars + " dollar(s)");
   System.out.println(dollarsHalf + "half dollar(s)"); 
   */

   // 6) problemSix:
   /* 
   If the int variable × contains 10, what will the following Java statements display? 
   System.out.println("Test 1" + × * 3 * 2.0); 
   System.out.println("Test 2" + × * 3 + 2.0);

   A: 
   Test 160.0
   Test 2302.0

   Given these results, explain why the following Java statement will not compile: 
   System.out.println("Test 3" + × * 3 − 2.0); 

   A: Java, following the order of operations, will compute x * 3, then concatenate string 
   "Test 3" to x3. It will error because the product is now a string, and java cannot interpret 
   the interaction of subtracting a non-integer, the string, by 2. 
   */ 

   public static void problemSeven(String input_4){
        /* 
        7) Write some Java statements that use the String methods indexOf and substring to find the 
        first word in a string. We define word to be a string of characters that does not include whitespace.
        For example, the first word of the string "Hello, my good friend!" is the string "Hello," 
        and the second word is the string "my".
        */
        // Set temp int for index, get index of first char that equals " "
        int tmpIndex = input_4.indexOf(" ");
        //TEST PRINT 
        // System.out.println(tmpIndex);

        // CASE no whitespace found, otherwise results in index out of bounds at -1
        if (tmpIndex == -1) {
            System.out.println("No spaces detected in " + input_4);
        } else {
            // Print subset of string up to tmpIndex's value
            System.out.println("First word in string: " + input_4.substring(0, tmpIndex));
        }   
    }

    public static void problemEight(String input_5){
        // Repeat the previous exercise but find the second word in the string.
        int firstIndex = input_5.indexOf(" ");

        // TEST PRINT 
        // System.out.println("FIRST INDEX:" + firstIndex);

        if (firstIndex == -1) {
            System.out.println("No spaces detected in " + input_5);
        } else {
            // Using the first index placeholder + 1 as starting point, get first whitespace
            int secondIndex = input_5.indexOf(" ", firstIndex + 1);
            // TESTING PRINT
            // System.out.println("SECOND: " + secondIndex);
            System.out.println("Second word in string: " + input_5.substring(firstIndex + 1, secondIndex));
        } 
    }

    // 9) problemNine:
   /* 
   What does the following Java statement display? 
   
   System.out.println("\"\tTest\\\\\rIt\'"); 
   
   Does replacing the r with an n make a difference in what is displayed? 

   A: It prints "It'est\\". 
   The backslash \ is interpreted as an escape character which allows you to write commands or 
   type otherwise "illegal" characters into a string like a double quotation or a backslash \. 
   */

    public static void problemNine(){
        // 10) problemTen:
        /*
        Write a single Java statement that will display the words one, two, and three, each on its own line.
        */
       System.out.println("one\ntwo\nthree");
    }
}