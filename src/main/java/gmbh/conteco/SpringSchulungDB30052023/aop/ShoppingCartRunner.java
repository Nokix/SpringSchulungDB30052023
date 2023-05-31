package gmbh.conteco.SpringSchulungDB30052023.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Profile("aop")
public class ShoppingCartRunner implements CommandLineRunner {
    @Autowired
    ShoppingCart shoppingCart;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Willkommen im Shopping Center!");
        System.out.println(shoppingCart.checkout());

        Item item0 = new Item("Cola", 100L);
        Item item1 = new Item("Sprite", 30L);

        shoppingCart.addItem(item0);
        shoppingCart.addItem(item0);
        shoppingCart.addItem(item1);
        shoppingCart.removeItem(item0);
        System.out.println(shoppingCart.checkout());
    }
}
