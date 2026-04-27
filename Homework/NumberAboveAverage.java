// 1. Write a program in a class NumberAboveAverage that counts the number of days that the 
// temperature is above average. Read ten temperatures from the keyboard and place them in an array. 
// Compute the average temperature and then count and display the number of days on which the 
// temperature was above average.
import java.util.Scanner;

public class NumberAboveAverage{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] temps = new double[10];
        double avg = 0;

        System.out.println("Enter 10 temperatures, one line for each temp");
        for (int i = 0; i < temps.length; i++){
            temps[i] = input.nextDouble();
            avg += temps[i];
        }

        avg /= temps.length;
        System.out.println("Average is " + avg);

        int aboveAvg = 0;
        for (int i = 0; i < temps.length; i++){
            if (temps[i] > avg){
                aboveAvg++;
                System.out.println("Day " + (i+1) + " is above average");
            }
        }

        System.out.println("There are " + aboveAvg +" days above average");
    }

}