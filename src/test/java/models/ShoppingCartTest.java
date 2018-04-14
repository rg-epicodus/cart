package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingCartTest {
    ShoppingCart shoppingCart;

    @Before
    public void setUp() throws Exception {
        shoppingCart = new ShoppingCart();
    }

    @After
    public void tearDown() throws Exception {
        shoppingCart = null;
    }

    @Test
    public void addOneItemToCart() {
        shoppingCart.addItems("Bread");
        assertEquals(1, shoppingCart.getTotalItemsInCart());
    }


}