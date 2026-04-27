public class Family{
    private double income;
    private int size;

    public Family(double income, int size){
        this.income = income;
        this.size = size;
    }

    public boolean isPoor(double housingCost, double foodCost){
        return housingCost + foodCost * this.size > (0.5 * this.income));
    }

    public String toString(){
        return "Family of " + size + " with income of " + income;
    }
}