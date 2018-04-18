import models.ShoppingCart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

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
                System.out.println("A - Add item to cart");
                System.out.println("R - Remove item from cart");
                System.out.println("V - View cart");
                System.out.println("P - Sort cart by price (NYI)");
                System.out.println("N - Sort cart by name");
                System.out.println("D - Remove all items from cart");
                System.out.println("C - Checkout and Pay (NYI)");
                System.out.println("Exit");

                String navChoice = bufferedReader.readLine();
                if (navChoice.equalsIgnoreCase("V")) {
                    System.out.println("Viewing Cart");
                    System.out.println("Your cart currently has " + shoppingCart.getTotalItemsInCart() + " items in the cart");
                    System.out.println("The items in your cart are:");
                    System.out.println("******************************************");
                    System.out.println("Total bread in your cart: " + Collections.frequency(shoppingCart.getItemsInCart(), "bread"));
                    System.out.println("Total tomatoes in your cart: " + Collections.frequency(shoppingCart.getItemsInCart(), "tomato"));
                    System.out.println("Total milk in your cart: " + Collections.frequency(shoppingCart.getItemsInCart(), "milk"));
                    System.out.println("Total eggs in your cart: " + Collections.frequency(shoppingCart.getItemsInCart(), "eggs"));
                    System.out.println("Total brussel sprouts in your cart: " + Collections.frequency(shoppingCart.getItemsInCart(), "brussel sprouts"));
                    System.out.println("Total yogurt in your cart: " + Collections.frequency(shoppingCart.getItemsInCart(), "yogurt"));
                    System.out.println("******************************************");
                    System.out.println("The total of the items in your cart is: ");
                    System.out.printf("$%.2f", shoppingCart.checkout());
                    System.out.println("\n" + "******************************************");

                } else if (navChoice.equalsIgnoreCase("A")) {
                    System.out.println("What item would you like to add to your cart?");
                    System.out.println("The choices are Bread, Tomato, Milk, Eggs, Brussel Sprouts, Yogurt");
                    String foodChoice = bufferedReader.readLine().toLowerCase();
                    if (foodChoice.equalsIgnoreCase("bread") || foodChoice.equalsIgnoreCase("tomato") || foodChoice.equalsIgnoreCase("milk") || foodChoice.equalsIgnoreCase("eggs") || foodChoice.equalsIgnoreCase("brussel sprouts") || foodChoice.equalsIgnoreCase("yogurt")) {
                        System.out.println("How many of " + foodChoice + " do you want?");
                        int foodQuantityChoice = Integer.parseInt(bufferedReader.readLine());
                        shoppingCart.addQuantity(foodQuantityChoice, foodChoice);
                        System.out.println("You have added " + foodQuantityChoice + " " + foodChoice + " to your cart.");
                        System.out.println("Your cart currently has " + shoppingCart.getTotalItemsInCart() + " items.");
                    } else {
                        System.out.println("Invalid input, try again");
                    }
                } else if (navChoice.equalsIgnoreCase("R")) {
                    System.out.println("What item would you like to remove from your cart?");
                    String removeFood = bufferedReader.readLine().toLowerCase();
                    System.out.println("How many of " + removeFood + " do you want to remove from cart?");
                    int removeQuantity = Integer.parseInt(bufferedReader.readLine());
                    shoppingCart.removeFoodType(removeQuantity, removeFood);
                    System.out.println("You have removed " + removeQuantity + " " + removeFood + " from your cart.");

                } else if (navChoice.equalsIgnoreCase("P")) {
                    System.out.println("Sorting by price is currently not yet implemented, our apologies.");

                } else if (navChoice.equalsIgnoreCase("N")) {
                    System.out.println("The items in your cart are: " + shoppingCart.getItemsInCart());
                    System.out.println("Now sorting cart by name, a-z");
                    System.out.println("The items in your cart are: " + shoppingCart.sortAscending());

                } else if (navChoice.equalsIgnoreCase("D")) {
                    System.out.println("Removing all items from cart, are you sure? (y / n)");
                    String removeAllItems = bufferedReader.readLine().toLowerCase();
                    if (removeAllItems.equals("y")) {
                        shoppingCart.removeAllItems();
                        System.out.println("Cart now empty");
                    } else {
                        System.out.println("Nothing removed");
                    }

                } else if (navChoice.equalsIgnoreCase("C")) {
                    System.out.println("Heading to checkout to pay, are you sure? (y / n)");
                    System.out.println("We apologize but checkout is currently not supported, please enjoy your free groceries!");

                } else if (navChoice.equalsIgnoreCase("Exit")) {
                    System.out.println("Thank you for shopping at Grocery Store.");
                    System.out.println("Have a great day!");
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
