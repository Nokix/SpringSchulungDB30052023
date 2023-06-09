package gmbh.conteco.SpringSchulungDB30052023.aop;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@Getter
public class ShoppingCart {
    private HashMap<Item, Long> cart = new HashMap<>();

    private long price = 0L;
    private long count = 0L;

    @TimeMe
    public Item addItem(Item item) {
        Long amount = cart.getOrDefault(item, 0L);
        cart.put(item, amount + 1);
        return item;
    }

    // Remove a single item from the cart. Not all of this type.
    public Item removeItem(Item item) {
        Long amount = cart.getOrDefault(item, 0L);
        if (amount <= 1) {
            cart.remove(item);
        } else {
            cart.put(item, amount - 1);
        }
        return item;
    }

    public void removeAll() {
        cart.clear();
    }

    public void updatePrice() {
        this.price = cart.entrySet().stream()
                .mapToLong(entry -> entry.getKey().getPrice() * entry.getValue())
                .sum();
    }

    public void updateCount() {
        this.count = cart.values().stream().mapToLong(Long::longValue).sum();
    }

    public String checkout() {
        return "Your price is " + price
                +"\nYou have "+ count+ " items.";
    }
}
