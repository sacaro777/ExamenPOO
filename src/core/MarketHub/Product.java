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

    private static int counter = 0;
    private int id;
    private String name, description, category;
    private float price;
    private int inventoryQuantity;

    public Product(String name, String description, float price, String category, int inventoryQuantity)
    this.id = ++counter;
 
    this.name  = name;
     
    this.description  = description;
     
    this.price  = price;
     
    this.category  = category;
     
    this.inventoryQuantity  = inventoryQuantity;

    int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void reduceStock(int quantity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean hasStock(int quantity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getInventoryQuantity() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void increaseStock(int quantity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    float getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
public int getId() { return id; }

public String getName() { return name; }

public float getPrice() { return price; }

public int getInventoryQuantity() { return inventoryQuantity; }

public String getCategory() { return category; }

public String getDescription() { return description; }

public boolean hasStock(int qty) { return inventoryQuantity >= qty; }

public void reduceStock(int qty) { inventoryQuantity -= qty; }

public void increaseStock(int qty) { inventoryQuantity += qty; }

}
