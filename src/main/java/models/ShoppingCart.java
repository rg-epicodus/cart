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

    public void addItem(String groceryProduct) {
        groceryProducts.add(groceryProduct);
    }

    public void removeItems(String groceryProduct) {
        groceryProducts.remove(groceryProduct);
    }

    public List<String> getItemsInCart() {
        return groceryProducts;
    }


    public int getTotalItemsInCart() {
        return groceryProducts.size();
    }

    public Boolean doesContain(String itemName) {
        return groceryProducts.contains(itemName);
    }

    public Double checkout() {
        double total = 0;
        for (String item : groceryProducts) {
            if (item.equals("Bread")) {
                total += 4.99;
            } else if (item.equals("Tomato")) {
                total += 1.19;
            } else if (item.equals("Milk")) {
                total += 5.99;
            } else if (item.equals("Eggs")) {
                total += 0.50;
            } else if (item.equals("Brussel Sprouts")) {
                total += 2.49;
            } else if (item.equals("Yogurt")) {
                total += 4.49;
            }
        }
            return total;
    }

    public void getTotalPriceOfItemsInCart() {
        total = 0;
        System.out.println(total);
    }

}
