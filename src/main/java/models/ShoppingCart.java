package models;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private ArrayList<String> groceryProducts;
    double total;

    //initialize an arraylist that contains our grocery items
    public ShoppingCart() {
        groceryProducts = new ArrayList<String>();
    }

    public void addItems(String groceryProduct) {
        groceryProducts.add(groceryProduct);
    }

    public void removeItems(String groceryProduct) {
        groceryProducts.remove(groceryProduct);
    }

    public int getTotalItemsInCart() {
        return groceryProducts.size();
    }

    public void getTotalPriceOfItemsInCart() {
        total = 0;
        System.out.println(total);
    }

}
