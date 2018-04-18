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
                System.out.println("V - View cart");
                System.out.println("A - Add item to cart");
                System.out.println("R - Remove item from cart");
                System.out.println("P - Sort cart by price");
                System.out.println("N - Sort cart by name");
                System.out.println("D - Remove all items from cart");
                System.out.println("C - Checkout and Pay");
                System.out.println("Exit");

                String navChoice = bufferedReader.readLine();
                if (navChoice.equalsIgnoreCase("V")) {
                    System.out.println("Viewing Cart");
                    System.out.println("Your cart currently has " + shoppingCart.getTotalItemsInCart() + " items in the cart");
                    System.out.println("The items in your cart are: " + shoppingCart.getItemsInCart());
                    System.out.println("The total of the items in your cart is: ");
                    System.out.printf("%n$%.2f", shoppingCart.checkout());
                    System.out.println("\n" + "******************************************");


                } else if (navChoice.equalsIgnoreCase("A")) {
                    System.out.println("What item would you like to add to your cart?");
                    System.out.println("The choices are Bread, Tomato, Milk, Eggs, Brussel Sprouts, Yogurt");
                    String foodChoice = bufferedReader.readLine().toLowerCase();
                    System.out.println("How many of " + foodChoice + " do you want?");
                    int foodQuantityChoice = Integer.parseInt(bufferedReader.readLine());
                    shoppingCart.addQuantity(foodQuantityChoice, foodChoice);
                    System.out.println("You have added " + foodQuantityChoice + " " + foodChoice + " to your cart.");
                    System.out.println("Your cart currently has " + shoppingCart.getTotalItemsInCart() + " items.");

                } else if (navChoice.equalsIgnoreCase("R")) {
                    System.out.println("What item would you like to remove from your cart?");
                    String removeFood = bufferedReader.readLine().toLowerCase();
                    System.out.println("How many of " + removeFood + " do you want to remove from cart?");
                    int removeQuantity = Integer.parseInt(bufferedReader.readLine());
                    shoppingCart.removeFoodType(removeQuantity, removeFood);
                    System.out.println("You have removed " + removeQuantity + " " + removeFood + " from your cart.");


                } else if (navChoice.equalsIgnoreCase("P")) {
                    System.out.println("Now sorting cart by price highest to lowest:");
                    programRunning = false;

                } else if (navChoice.equalsIgnoreCase("N")) {
                    System.out.println("Now sorting cart by name, a-z");
                    programRunning = false;

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
