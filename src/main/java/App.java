import models.GroceryProduct;
import models.ShoppingCart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean programRunning = true;
        ShoppingCart shoppingCart = new ShoppingCart();

        try {
            while (programRunning) {

                System.out.println("Welcome to the Grocery Store");
                System.out.println("Please select from the following options:");
                System.out.println("*****************************************");
                System.out.println("View cart");
                System.out.println("Add item to cart");
                System.out.println("Remove item from cart");
                System.out.println("Sort cart by price");
                System.out.println("Sort cart by name");
                System.out.println("Remove all items from cart");
                System.out.println("Checkout and Pay");
                System.out.println("Exit");

                String navChoice = bufferedReader.readLine();
                if (navChoice.equalsIgnoreCase("View Cart")) {
                    System.out.println("Viewing Cart");
                    System.out.println("Your cart currently has " + shoppingCart.getTotalItemsInCart() + " items in the cart");


                } else if (navChoice.equalsIgnoreCase("Add item to cart")) {
                    System.out.println("What item would you like to add to your cart?");
                    System.out.println("The choices are Bread, Tomato, Milk, Eggs, Brussel Sprouts, Yogurt");
                    String foodChoice = bufferedReader.readLine().toLowerCase();
                    System.out.println("How many of " + foodChoice + " do you want?");
                    int foodQuantityChoice = Integer.parseInt(bufferedReader.readLine());
                    shoppingCart.addItem(foodChoice);
                    System.out.println("You have added " + foodQuantityChoice + " " + foodChoice + " to your cart.");
                    System.out.println("Your cart currently has " + shoppingCart.getTotalItemsInCart()*foodQuantityChoice + " items.");
                    System.out.println(shoppingCart.getItemsInCart());
                    System.out.println("Your cart total is: " + shoppingCart.checkout());

                } else if (navChoice.equalsIgnoreCase("Remove item from cart")) {
                    System.out.println("What item would you like to remove from your cart?");
                    programRunning = false;

                } else if (navChoice.equalsIgnoreCase("Sort cart by price")) {
                    System.out.println("Now sorting cart by price highest to lowest:");
                    programRunning = false;

                } else if (navChoice.equalsIgnoreCase("Sort cart by name")) {
                    System.out.println("Now sorting cart by name, a-z");
                    programRunning = false;

                } else if (navChoice.equalsIgnoreCase("Remove all items from cart")) {
                    System.out.println("Removing all items from cart, are you sure? (y / n)");
                    String removeAllItems = bufferedReader.readLine().toLowerCase();
                    if (removeAllItems == "y") {
                        shoppingCart.removeAllItems();
                        System.out.println("Cart now empty");
                    } else {
                        System.out.println("Nothing removed");
                    }

                } else if (navChoice.equalsIgnoreCase("Checkout and Pay")) {
                    System.out.println("Heading to checkout to pay, are you sure? (y / n)");
                    programRunning = false;

                } else if (navChoice.equalsIgnoreCase("Exit")) {
                    System.out.println("Farewell Friend!");
                    programRunning = false;
                } else {
                    System.out.println("Invalid input, try again");
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
