package gmbh.conteco.SpringSchulungDB30052023.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order
public class ShoppingCartRunner implements CommandLineRunner {
    @Autowired
    ShoppingCart shoppingCart;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Willkommen im Shopping Center!");
        System.out.println(shoppingCart.checkout());
    }
}
