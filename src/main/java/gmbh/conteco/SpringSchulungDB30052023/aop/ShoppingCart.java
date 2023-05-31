package gmbh.conteco.SpringSchulungDB30052023.aop;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class ShoppingCart {
    private HashMap<Item, Long> cart;

    private long price;
    private long count;

    public Item addItem(Item item) {
        // add Item to hashmap

        updatePrice();
        updateCount();
        return item;
    }

    public Item removeItem(Item item) {
        // remove Item to hashmap

        updatePrice();
        updateCount();
        return item;
    }

    public void removeAll() {
        // remove

        updatePrice();
        updateCount();
    }

    public void updatePrice() {

    }

    public void updateCount() {

    }

    public String checkout() {
        return "Your price is " + price
                +"\nYou have "+ count+ " items.";
    }
}
