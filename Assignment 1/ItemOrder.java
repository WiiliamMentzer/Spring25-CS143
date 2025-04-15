//ItemOrder by William Mentzer
public class ItemOrder {
    private Item item;
    private int quantity;

    public ItemOrder(Item item, int quantity) {
        this.quantity = quantity;
        this.item = item;
    }

    public double getPrice() {
        double priceOf = this.item.priceFor(this.quantity);

        return priceOf;
    }

    public Item getItem() {
        return this.item;
    }
}
