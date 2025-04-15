import java.util.*;
//Catalog by William Mentzer

public class Catalog {

    private ArrayList<Item> items;
    private String name;

    public Catalog(String name) {
        this.name = name;
    }

    public void add(Item next) {
        this.items.add(next);
    }

    public int size() {
        int listSize = this.items.size();
        return listSize;
    }

    public Item get(int index) {
        Item gotItem = this.items.get(index);
        return gotItem;
    }

    public String getName() {
        return this.name;
    }
}
