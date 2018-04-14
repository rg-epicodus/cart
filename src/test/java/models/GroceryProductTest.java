package models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GroceryProductTest {
    private GroceryProduct groceryProduct;

    @Before
    public void setUp() throws Exception {
        groceryProduct = new GroceryProduct("Tomato", "Each", 10, 1.99);
    }

    @Test
    public void newItemIsntantiatesCorrectly_true() {
        assertEquals(true, groceryProduct instanceof GroceryProduct);
    }

    @Test
    public void getNameOfItemCorrectly_true() {
        assertEquals("Tomato", groceryProduct.getName());
    }

    @Test
    public void getUnitOfMeasurementOfItemCorrectly_true() {
        assertEquals("Each", groceryProduct.getUnitOfMeasurement());
    }

    @Test
    public void getQuantityOfItemCorrectly_true() {
        assertEquals(10, groceryProduct.getQuantity());
    }

    @Test
    public void getPriceOfItemCorrectly_true() {
        assertTrue(groceryProduct.getPrice() - 1.99 == 0);
    }

}