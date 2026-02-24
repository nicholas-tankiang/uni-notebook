import java.util.Scanner;

public class TempConverter{
    public static void main(String[] args) {
        /*
        Write a program that allows the user to convert a temperature given in degrees 
        from either Celsius to Fahrenheit or Fahrenheit to Celsius. 
        Use the following formulas:
        Degrees_C = 5 (Degrees_F − 32) / 9
        Degrees_F = (9 (Degrees_C) / 5) + 32
        Prompt the user to enter a temperature and either a C or c for Celsius or 
        an F or f for Fahrenheit. Convert the temperature to Fahrenheit if 
        Celsius is entered, or to Celsius if Fahrenheit is entered. 
        Display the result in a readable format. If anything other than 
        C, c, F, or f is entered, print an error message and stop.
        */

       String temperatureChar = "";
       
       Scanner input = new Scanner(System.in);

       System.out.println("ENTER TEMPERATURE");
       double degrees = input.nextDouble();
       System.out.println("IN C OR F?");
       input.nextLine();
       temperatureChar = input.nextLine().toLowerCase();

       if (temperatureChar.equals("c")) {
        double Degrees_F = (degrees) * (9/5) + 32;
        System.out.println(Degrees_F + " celcius");
       } else if (temperatureChar.equals("f")) {
        double Degrees_C = (degrees - 32) * 5/9;
        System.out.println(Degrees_C + " Fahrenheit");
       } else {
        System.out.println("INPUT ERROR");
       }
    }
}