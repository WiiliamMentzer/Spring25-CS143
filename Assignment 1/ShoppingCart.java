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
        //Honestly have no idea whats happening here and why shopping cart isnt resetting the price when adding the object,
        //there was only a "this should repace any previous order", well yes i know that but i dont know why it isnt working, would have appreciated a note on this part
        if(next.equals(itemOrder.contains(next))){
            this.itemOrder.remove(next);
        }
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
