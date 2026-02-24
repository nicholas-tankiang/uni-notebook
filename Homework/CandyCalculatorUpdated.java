import java.util.Scanner;

public class CandyCalculatorUpdated{
    public static void main(String[] args) {
        /*
        Repeat the calorie counting program described in Project 1 #8. 
        This time ask the user to input the string “M” if the user is a man and “W” if the user is a woman.
        Use only the male formula to calculate calories if “M” is entered and use only the 
        female formula to calculate calories if “W” is entered. 
        Output the number of chocolate bars to consume as before.
        */
        enum Sex {
            m, f
        }

        Scanner input = new Scanner(System.in);

        final int chocCal = 230;

        System.out.println("ENTER WEIGHT (POUNDS)");
        double weight = input.nextDouble();
        System.out.println("ENTER HEIGHT (INCHES)");
        double height = input.nextDouble();
        System.out.println("ENTER AGE (YEARS)");
        int age = input.nextInt();
        // Clear empty buffer
        input.nextLine();
        System.out.println("ENTER M OR F");
        String inputGender = input.nextLine();

        Sex gender = Sex.valueOf(inputGender.toLowerCase());

        switch (gender) {
            case f:
                double femBMR= 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
                double femChocNo = femBMR / chocCal;
                System.out.println("femBMR result: " + femBMR);
                System.out.println(femChocNo + " chocolates");
                break;
            case m:
                double malBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
                double malChocNo = malBMR / chocCal;
                System.out.println("malBMR result: " + malBMR);
                System.out.println(malChocNo + " chocolates");
                break;
        }
    }
}
