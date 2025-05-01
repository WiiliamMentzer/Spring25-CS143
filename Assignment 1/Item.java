import java.text.*;
//Item by William Mentzer

public class Item {
    // You will need to add more instance variables
    private String name;
    private int bulkQuantity;
    private double price;
    private double bulkPrice;
    private NumberFormat formatter;

    public Item(String name, double price) throws IllegalArgumentException {
        if ( price < 0) {
            throw new IllegalArgumentException("value must be positive and greater than 0");
        } else {
            this.name = name;
            this.price = price;
        }
    }

    public Item(String name, double price, int bulkQuantity, double bulkPrice) throws IllegalArgumentException {
        if (price < 0 || bulkQuantity < 0 || bulkPrice < 0) {
            throw new IllegalArgumentException("value must be positive and greater than 0");
        } else {
            this.bulkPrice = bulkPrice;
            this.price = price;
            this.bulkQuantity = bulkQuantity;
            this.name = name;
        }
    }

    public double priceFor(int quantity) throws IllegalArgumentException {
        double totalPriceFor = 0;
        if ( quantity < 0) {
            throw new IllegalArgumentException("value must be positive and greater than 0");
        } else {
            /*
            There is apparently an infinite loop here,
            i dont know why its triggering if bulk price doesnt exist bulkprice and bulk quantity cant live without one another
            since its made in the same constuctor and should throw an illegal exception if the contructor for bulk isnt done right.
            Regardless if bulk quantity isnt a value greater than 1
            I just have it shut itself down and default back to totalPriceFor for quantity times price just incase
            */
            while ( quantity >= bulkQuantity  && bulkPrice > 0) {
                totalPriceFor += this.bulkPrice;
                quantity -= bulkQuantity;
            }
        }
        totalPriceFor += quantity * price;
        return totalPriceFor;
        
    }

    public String toString() {
        //Why does numberformat even need to be here, it feels like it was thrown in here for some artificial point deductions
        String itemListing;
        this.formatter = NumberFormat.getCurrencyInstance();
        itemListing = name + " " + formatter.format(price);
        if (bulkQuantity > 0){
            itemListing += " (" + bulkQuantity + " for $" + bulkPrice + ")"; 
        }
        return itemListing;
    }

    public Boolean equals(Item itemCheck){
        //this one is really vague asking us to just copy everything from the textbook
        //Nowhere on the assignment is it telling me to return anything
        this.name.equals(itemCheck.name);
        this.price = itemCheck.price;
        if(itemCheck.bulkQuantity > 0 && bulkPrice > 0){
            this.bulkPrice = itemCheck.bulkPrice;
            this.bulkQuantity = itemCheck.bulkQuantity;
        }
        return true;
    }
}
