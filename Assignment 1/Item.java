import java.text.*;
//Item by William Mentzer

public class Item {
    // You will need to add more instance variables
    private String name;
    private int bulkQuantity;
    private double price;
    private double bulkPrice;
    private NumberFormat formatter;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, double price, int bulkQuantity, double bulkPrice) {
        this.bulkPrice = bulkPrice;
        this.price = price;
        this.bulkQuantity = bulkQuantity;
        this.name = name;

    }

    public double priceFor(int quantity) throws IllegalArgumentException{
        double totalPriceFor = 0;
        while ( quantity >= bulkQuantity ) {
            totalPriceFor += bulkQuantity * this.bulkPrice;
            quantity -= bulkQuantity;
        }
        totalPriceFor += quantity * price;
        return totalPriceFor;
        
    }

    public String toString() {
        String itemListing;
        itemListing = name + ", $" + price;
        if (bulkQuantity > 0){
            itemListing += " (" + bulkQuantity + " for $" + bulkPrice + ")"; 
        }
        return itemListing;
    }
}
