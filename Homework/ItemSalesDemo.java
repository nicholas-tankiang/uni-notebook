public class ItemSalesDemo{
    public static void main(String[] args) {
        ItemSales productOne = new ItemSales();

        // var assignments for testing
        productOne.totalSold = 5;
        productOne.totalSale = 15;
        productOne.totalDiscount = 3;
        productOne.itemCost = 6;
        productOne.quantityBulk = 3;
        productOne.quantityBulkDiscount = 0.05;

        // Test register sale
        System.out.println("1: REGISTER_SALE_TEST");
        double registerSaleExpectedVal = 5.7;
        System.out.println("Val item cost: " + productOne.itemCost + " | Discount: " + productOne.quantityBulkDiscount);

        productOne.registerSale(productOne.totalSold);
        if (productOne.itemCost != registerSaleExpectedVal) {
            System.out.println("FAIL, expect: " + registerSaleExpectedVal + " got: " + productOne.itemCost);
        } else {
            System.out.println("PASS, expect: " + productOne.itemCost);
        }

        // Test display sale
        System.out.println("2: DISPLAY_SALE_TEST");
        System.out.println("EXPECTED:\nTotalSold: 5 | TotalSales: 15.0 | TotalDiscount: 3.0");
        System.out.println("ACTUAL: ");
        productOne.displaySales();

    }
}