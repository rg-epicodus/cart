package models;


import java.math.BigDecimal;

public class GroceryProduct {
    public String name;
    public String unitOfMeasurement;
    public int quantity;
    public double price;

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
}
