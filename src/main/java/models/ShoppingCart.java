package models;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private ArrayList<GroceryProduct> groceryProducts;
    double total;

    //initialize an arraylist that contains our grocery items
    public ShoppingCart() {
        groceryProducts = new ArrayList<GroceryProduct>();
    }

    public void addItems(GroceryProduct groceryProduct) {
        groceryProducts.add(groceryProduct);
    }

    public void removeItems(GroceryProduct groceryProduct) {
        groceryProducts.remove(groceryProduct);
    }

    public void getTotalItemsInCart() {
        System.out.println(groceryProducts.size());
    }

    public void getTotalPriceOfItemsInCart() {
        total = 0;
        System.out.println(total);
    }

}
