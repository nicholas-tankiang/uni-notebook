// Consider a class that keeps track of the sales of an item. An object of this
// class will have the attributes
// • Number sold
// • Total sales
// • Total discounts
// • Cost per item
// • Bulk quantity
// • Bulk discount percentage

public class ItemSales{
    private int totalSold;
    private double totalSale;
    private double totalDiscount;
    private double itemCost;
    private int quantityBulk;
    private double quantityBulkDiscount;

    // ItemSales Constructor
    public ItemSales(int sold, double sales, double discounts, double cost, int bulk, double bulkDiscount){
        this.totalSold = sold;
        this.totalSale = sales;
        this.totalDiscount = discounts;
        this.itemCost = cost;
        this.quantityBulk = bulk;
        this.quantityBulkDiscount = bulkDiscount;
    }

    // Getter Methods
    public int getTotalSold(){
        return this.totalSold;
    }

    public double getItemCost(){
        return this.itemCost;
    }

    public double getBulkQuantity(){
        return this.quantityBulk;
    }

    public double getBulkDiscountPercent(){
        return this.quantityBulkDiscount;
    }

    // registerSale(n) records the sale of n items. If n is larger than the bulk
    // quantity, the cost per item will be reduced by the bulk discount.
    public void registerSale(int n){
        if (n > this.quantityBulk){
            this.itemCost *= (1 - this.quantityBulkDiscount);
            // round to one decimal to match expected values
            this.itemCost = Math.round(this.itemCost * 10.0) / 10.0;
        }
    }

    // displaySales displays the number sold, the total sales, and total discount.
    public void displaySales(){
        System.out.println("TotalSold: " + this.totalSold + " | TotalSales: " + this.totalSale + " | TotalDiscount: " + this.totalDiscount);
    }
}
