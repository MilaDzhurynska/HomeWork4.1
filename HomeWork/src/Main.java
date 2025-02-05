public class Main {

 private static final String CURRENCY = "EUR";

    public static void main(String[] args) {

        int orderNumber = 1;
        String productName = " smartfone";
        int pieces = 15;
        float price = 810.227f;
        int daysNumber = 5;
        float totalSales = pieces * price; // Сума продажів товару дорівнює добутку кількості (шт) та ціни
        float salesByDay =  totalSales / daysNumber; //Середньоденна сума продажів дорівнює результату від поділу загальної суми продажів на кількість днів проведення торгівлі

        System.out.println("Product No " + orderNumber + ":" + productName + ",");
        System.out.println("total sales for " + daysNumber + " days is " + CURRENCY + " " + (totalSales) + ",");
        System.out.println("sales by day is " + CURRENCY + " " + salesByDay + ".");

        // product No 2

        orderNumber = 2;
        productName = " laptop";
        pieces = 5;
        price = 2097.37f;
        daysNumber = 7;
        totalSales = pieces * price;
        salesByDay =  totalSales / daysNumber;

        System.out.println("Product No " + orderNumber + ":" + productName + ",");
        System.out.println("total sales for " + daysNumber + " days is "  + CURRENCY + " " + totalSales + ",");
        System.out.println("sales by day is "  + CURRENCY + " " + salesByDay + ".");

    }
}
