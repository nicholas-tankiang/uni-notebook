import java.util.Scanner;

public class SillySentences{
    public static void main(String[] args) {
        /*
        4. Write a program that asks the user to enter a favorite color, a favorite food, a favorite
        animal, and the first name of a friend or relative. The program should then print the
        following two lines, with the user’s input replacing the items in italics:
        I had a dream that Name ate a Color Animal
        and said it tasted like Food!
        For example, if the user entered blue for the color, hamburger for the food, dog for the
        animal, and Jake for the person’s name, the output would be
        I had a dream that Jake ate a blue dog
        and said it tasted like hamburger!
        Don’t forget to put the exclamation mark at the end.
        */

        Scanner keyboard = new Scanner(System.in);

        System.out.println("ENTER COLOR");
        String color = keyboard.nextLine();
        System.out.println("ENTER FOOD");
        String food = keyboard.nextLine();
        System.out.println("ENTER ANIMAL");
        String animal = keyboard.nextLine();
        System.out.println("ENTER FIRST NAME OF FRIEND/RELATIVE");
        String name = keyboard.nextLine();

        System.out.println("I had a dream that " + name + " ate a " + color + animal + "\n" +
        "and said it tasted like " + food + "!");
    }
}