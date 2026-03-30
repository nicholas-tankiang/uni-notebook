// Consider a class that keeps track of the sales of an item. An object of this
// class will have the attributes
// • Number sold
// • Total sales
// • Total discounts
// • Cost per item
// • Bulk quantity
// • Bulk discount percentage
// and the following methods:
// • registerSale(n) records the sale of n items. If n is larger than the bulk
// quantity, the cost per item will be reduced by the bulk discount.
// • displaySales displays the number sold, the total sales, and total discount.

public class ItemSales{
    private int totalSold;
    private double totalSale;
    private double totalDiscount;
    private int itemCost;
    private int quantityBulk;
    private double quantityBulkDiscount;

    public void registerSale(int n){
        if (n > this.quantityBulk){
            itemCost -= quantityBulkDiscount;
        }
    }

    public void displaySales(){
        System.out.println(this.totalSold + totalSale + totalDiscount);
    }
}
