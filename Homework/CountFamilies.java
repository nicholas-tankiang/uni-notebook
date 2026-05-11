// 2. Write a program in a class CountFamiles that counts the number of families 
// whose income is below a certain value. Read an integer k from the keyboard and 
// then create an array of double values of size k. Read k values representing 
// family income from the keyboard and place them into the array. Find the maximum income 
// among these values. Then count the families that make less than 10 percent of this maximum income. 
// Display this count and the incomes of these families.
import java.util.Scanner;

public class CountFamilies{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double maxIncome = 0;

        System.out.println("Enter no of family units ()");
        int familyNo = input.nextInt();
        double [] familyUnit = new double[familyNo];

        System.out.println("Enter family's income for " + familyNo +" units");
        for (int i = 0; i < familyUnit.length; i++){
            familyUnit[i] = input.nextDouble();
            if (familyUnit[i] > maxIncome) {
                maxIncome = familyUnit[i];
            }
        }

        System.out.println("Max income: " + maxIncome);
        double maxIncomeTenPercent = maxIncome * 0.1;

        int countBelowMaxTen = 0;
        for (int i = 0; i < familyUnit.length; i++){
            if (familyUnit[i] < maxIncomeTenPercent){
                System.out.println("Family " + (i+1) + " income: " + familyUnit[i] + " is below 10% of max income");
                countBelowMaxTen++;
            }
        }
        System.out.println("Number of families below 10% of max income: " + countBelowMaxTen);
    }
}