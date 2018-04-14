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

}