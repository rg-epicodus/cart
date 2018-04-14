package models;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class ShoppingCartTest {
    private ShoppingCart shoppingCart;

    @Before
    public void setUp() throws Exception {
        shoppingCart = new ShoppingCart();
    }

    @After
    public void tearDown() throws Exception {
        shoppingCart = null;
    }

}