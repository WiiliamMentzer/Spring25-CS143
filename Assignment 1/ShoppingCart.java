// Stuart Reges
// 1/19/00
//
//ShoppingCart by William Mentzer
import java.util.*;

public class ShoppingCart {

    private ArrayList<ItemOrder> itemOrder;
    public static final double DISCOUNT_PERCENT = 0.9;
    private boolean discounted;

    public ShoppingCart() {
        this.itemOrder = new ArrayList<ItemOrder>();
    }

    public void add(ItemOrder next) {
        this.itemOrder.add(next);
    }

    public void setDiscount(boolean discount) {
        if(discount){
            this.discounted = discount;
        }
    }

    public double getTotal() {
        double totalPrice = 0;
        for (int i=0; i < itemOrder.size(); i++){
            totalPrice += itemOrder.get(i).getPrice();
        }
        if(discounted){
            totalPrice *= .9;
        }
        return totalPrice;
    }
}
