package models;



public class GroceryProduct {
    private String name;
    private String unitOfMeasurement;
    private int quantity;
    private double price;

    public GroceryProduct(String name, String unitOfMeasurement, int quantity, double price) {
        this.name = name;
        this.unitOfMeasurement = unitOfMeasurement;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void printTotalItemPrice() {
        double totalItemCost = (getPrice() * getQuantity());
        System.out.println(getName() + ": " + getQuantity() + " @ $" + getPrice() + " = $" + totalItemCost);
    }

    public void printName() {

    }
}
