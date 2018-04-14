import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean programRunning = true;

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
                    programRunning = false;

                } else if (navChoice.equalsIgnoreCase("Add item to cart")) {
                    System.out.println("What item would you like to add to your cart?");
                    programRunning = false;

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
                    programRunning = false;

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
