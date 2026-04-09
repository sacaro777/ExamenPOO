/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.MarketHub;

/**
 *
 * @author sacaro
 */
public class Product {
    private String name;
    private String description;
    private double price;
    private String category;
    private int inventoryQuantity;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setInventoryQuantity(int inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public Product(String name, String description, double price, String category, int inventoryQuantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.inventoryQuantity = inventoryQuantity;
    }
    
    
}
