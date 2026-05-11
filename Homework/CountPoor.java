// 3. Write a program in a class CountPoor that counts the number of families that are considered poor. 
// Write and use a class Family that has the attributes
// • income—a double value that is the income for the family
// • size—the number of people in the family and the following methods:
// • Family(income, size)—a constructor that sets the attributes
// • isPoor(housingCost, foodCost)—a method that returns true if housingCost + foodCost * size is 
// greater than half the family income (foodCost is the
// average food cost for an individual, while housingCost is for the family)
// • toString—a method that returns a string containing the information about
// the family The program should read an integer k from the keyboard and then create an array of 
// size k whose base type is Family. It should then create k objects of type Family and put them in 
// the array, reading the income and size for each family from the keyboard. 
// After reading an average housing cost and average food cost from the keyboard, 
// it should display the families that are poor.
import java.util.Scanner;

public class CountPoor{
    public static void main(String[] args) {
        System.out.println("How many families?");
        Scanner input = new Scanner(System.in);
        // family count
        int k = input.nextInt();

        Family [] data = new Family[k];

        System.out.println("Income, size for each family: ");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Family " + i);
            double in = input.nextDouble();
            int size = input.nextInt();
            // assign inputs as new family to data array index
            data[i] = new Family(in, size);
        }

        // Get avg cost for housing/food
        System.out.println("Enter avg cost for housing/food");
        double housingCost = input.nextDouble();
        double foodCost = input.nextDouble();

        // Count and display families considered poor
        System.out.println("Display families considered poor");
        int count = 0;
        for (int i = 0; i < k; i++) {
            if(data[i].isPoor(housingCost, foodCost)){
                System.out.println(data[i] + " is considered poor");
                count++;
            }
        }

        System.out.println(count + " families are considered poor");
    }

}