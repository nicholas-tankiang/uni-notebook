// 4. Write a program in a class FlowerCounter that computes the cost of flowers sold at a flower stand. 
// Five kinds of flowers—petunia, pansy, rose, violet, and carnation— are stocked and cost, 
// respectively, 50¢, 75¢, $1.50, 50¢, and 80¢ per flower. Create an array of strings that 
// holds the names of these flowers. Create another array that holds the cost of each corresponding flower. 
// Your program should read the name of a flower and the quantity desired by a customer. 
// Locate the flower in the name array and use that index to find the cost per stem in the cost array. 
// Compute and print the total cost of the sale.
import java.util.Scanner;

public class FlowerCounter{
    public static void main(String[] args) {
        String [] flowerNames = {"petunia", "pansy", "rose", "violet", "carnation"};
        double [] flowerPrice = {0.5, 0.75, 1.5, 0.5, 0.8};

        Scanner input = new Scanner(System.in);
        System.out.println("What flower?");
        String flower = input.next();

        //get index of input
        int flowerIndex = -1;
        for (int i = 0; i < flowerNames.length; i++) {
            if(flowerNames[i].equals(flower)){
                flowerIndex = i;
                break;
            }
        }

        if(flowerIndex == -1){
            System.out.println(flower + " not sold");
        } else {
            System.out.println("Quantity?");
            int number = input.nextInt();
            System.out.println("Cost is $" + number * flowerPrice[flowerIndex]);
        }
    }
}