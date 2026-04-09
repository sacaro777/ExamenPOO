/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.MarketHub;

import core.User.Seller;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Store {

    private static int counter = 0;
    private int id;
    private String name;
    private Date creationDate;
    private Seller owner;
    private List<Product> products = new ArrayList<>();

    public Store(String name, Seller owner) {
        this.id = ++counter;
        this.name = name;
        this.creationDate = new Date();
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Seller getOwner() {
        return owner;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public Product getProductById(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public Product getProductByIndex(int i) {
        return (i >= 0 && i < products.size()) ? products.get(i) : null;
    }
}
