public class ItemSalesDemo{
    public static void main(String[] args) {
        // var assignments for testing
        ItemSales productOne = new ItemSales(5, 15, 3, 6, 3, 0.05);
        // productOne.totalSold = 5;
        // productOne.totalSale = 15;
        // productOne.totalDiscount = 3;
        // productOne.itemCost = 6;
        // productOne.quantityBulk = 3;
        // productOne.quantityBulkDiscount = 0.05;

        // Test register sale
        System.out.println("1: REGISTER_SALE_TEST");
        double registerSaleExpectedVal = 5.7;
        System.out.println("Val item cost: " + productOne.getItemCost() + " | Discount: " + productOne.getBulkDiscountPercent());

        productOne.registerSale(productOne.getTotalSold());
        if (productOne.getItemCost() != registerSaleExpectedVal) {
            System.out.println("FAIL, expect: " + registerSaleExpectedVal + " got: " + productOne.getItemCost());
        } else {
            System.out.println("PASS, expect: " + productOne.getItemCost());
        }

        // Test display sale
        System.out.println("2: DISPLAY_SALE_TEST");
        System.out.println("EXPECTED:\nTotalSold: 5 | TotalSales: 15.0 | TotalDiscount: 3.0");
        System.out.println("ACTUAL: ");
        productOne.displaySales();

    }
}