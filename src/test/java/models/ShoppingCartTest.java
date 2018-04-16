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
        shoppingCart.addItem("Bread");
        assertEquals(1, shoppingCart.getTotalItemsInCart());
    }

    @Test
    public void addFiveItemsToCart() {
        shoppingCart.addItem("Bread");
        shoppingCart.addItem("Milk");
        shoppingCart.addItem("Eggs");
        shoppingCart.addItem("Steak");
        shoppingCart.addItem("Butter");
        System.out.println(shoppingCart.getItemsInCart());
        assertEquals(5, shoppingCart.getTotalItemsInCart());
    }

    @Test
    public void addSameItemsToCart() {
        shoppingCart.addItem("Bread");
        shoppingCart.addItem("Bread");
        shoppingCart.addItem("Bread");
        System.out.println(shoppingCart.getItemsInCart());
        assertEquals(3, shoppingCart.getTotalItemsInCart());
    }

    @Test
    public void checkForItemInCart() {
        shoppingCart.addItem("Milk");
        System.out.println(shoppingCart.getItemsInCart());
        assertEquals(1, shoppingCart.getTotalItemsInCart());
        assertEquals(true, shoppingCart.doesContain("Milk"));
    }

    @Test
    public void doesPriceMatchItemsInCart() {
        shoppingCart.addItem("Bread");
        System.out.println(shoppingCart.getItemsInCart());
        System.out.println(shoppingCart.checkout());
        assertEquals(true, shoppingCart.checkout().equals(4.99));
    }


}