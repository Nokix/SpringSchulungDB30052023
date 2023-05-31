package gmbh.conteco.SpringSchulungDB30052023.aop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
class ShoppingCartTest {

    @Autowired
    ShoppingCart shoppingCart;

    @Test
    public void testAddItem0() {
        shoppingCart.addItem(new Item("Cola", 100L));
        assertEquals(1L, shoppingCart.getCount());
        assertEquals(100L, shoppingCart.getPrice());
    }

    @Test
    public void testAddItem1() {
        shoppingCart.addItem(new Item("Cola", 100L));
        shoppingCart.addItem(new Item("Cola", 100L));
        assertEquals(2L, shoppingCart.getCount());
        assertEquals(200L, shoppingCart.getPrice());
    }

    @Test
    public void testRemoveItem0() {
        Item item = new Item("Cola", 100L);
        shoppingCart.addItem(item);
        shoppingCart.removeItem(item);
        assertEquals(0L, shoppingCart.getCount());
        assertEquals(0L, shoppingCart.getPrice());
    }
}