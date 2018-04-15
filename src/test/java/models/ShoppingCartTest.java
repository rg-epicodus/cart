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

    @Test
    public void addFiveItemsToCart() {
        shoppingCart.addItems("Bread");
        shoppingCart.addItems("Milk");
        shoppingCart.addItems("Eggs");
        shoppingCart.addItems("Steak");
        shoppingCart.addItems("Butter");
        assertEquals(5, shoppingCart.getTotalItemsInCart());
    }

    @Test
    public void addSameItemsToCart() {
        shoppingCart.addItems("Bread");
        shoppingCart.addItems("Bread");
        shoppingCart.addItems("Bread");
        assertEquals(3, shoppingCart.getTotalItemsInCart());
    }

    @Test
    public void checkForItemInCart() {
        shoppingCart.addItems("Milk");
        assertEquals(1, shoppingCart.getTotalItemsInCart());
        assertEquals(true, shoppingCart.doesContain("Milk"));

    }

}