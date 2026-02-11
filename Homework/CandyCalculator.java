import java.util.Scanner;

public class CandyCalculator{
    public static void main(String[] args) {
        /*
        The Harris-Benedict equation estimates the number of calories your body needs to
        maintain your weight if you do no exercise.This is called your basal metabolic rate or
        BMR.
        The calories needed for a woman to maintain her weight is:
        BMR = 655 + (4.3 * weight in pounds) + (4.7 * height in inches) - (4.7 * age in years)
        The calories needed for a man to maintain his weight is:
        BMR = 66 + (6.3 * weight in pounds) + (12.9 * height in inches) - (6.8 * age in years)
        A typical chocolate bar will contain around 230 calories. Write a program that allows the
        user to input their weight in pounds, height in inches, and age in years. The program
        should then output the number of chocolate bars that should be consumed to maintain
        one’s weight for both a woman and a man of the input weight, height, and age.
        */

        Scanner keyboard = new Scanner(System.in);

        final int chocCal = 230;

        System.out.println("ENTER WEIGHT (POUNDS)");
        double weight = keyboard.nextDouble();
        System.out.println("ENTER HEIGHT (INCHES)");
        double height = keyboard.nextDouble();
        System.out.println("ENTER AGE (YEARS)");
        int age = keyboard.nextInt();

        /*
        f weight
        BMR = 655 + (4.3 * weight in pounds) + (4.7 * height in inches) - (4.7 * age in years)
        m weight
        BMR = 66 + (6.3 * weight in pounds) + (12.9 * height in inches) - (6.8 * age in years)
        */

        double femBMR= 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
        double malBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);

        //change modulo to give whole number (rounded maybe)
        double femChocNo = femBMR / chocCal;
        double malChocNo = malBMR / chocCal;

        System.out.println("femBMR result: " + femBMR);
        System.out.println("malBMR result: " + malBMR);
        System.out.println("If F: " + femChocNo + " chocolates\n" + 
        "If M: " + malChocNo + "chocolates");
    }
}