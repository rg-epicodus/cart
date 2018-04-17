package models;

import java.math.BigDecimal;
import java.text.DecimalFormat;
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

    public void addQuantity(int foodChoiceQuantity, String groceryProduct) {
        for (int i = 0; i < foodChoiceQuantity; i++) {
            this.addItem(groceryProduct);
        }
    }

    public void removeAllItems() {
        groceryProducts.removeAll(groceryProducts);
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

    public void analyzeCartArray() {

    }

    public Double checkout() {
        double total = 0.00;
        for (String item : groceryProducts) {
            if (item.equals("bread")) {
                total += 4.99;
            } else if (item.equals("tomato")) {
                total += 1.19;
            } else if (item.equals("milk")) {
                total += 5.99;
            } else if (item.equals("eggs")) {
                total += 0.50;
            } else if (item.equals("brussel sprouts")) {
                total += 2.49;
            } else if (item.equals("yogurt")) {
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
