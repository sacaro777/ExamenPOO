/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.MarketHub;

import core.User.Seller;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author sacaro
 */
public class Store {
    private String name;
    private LocalDate creationDate;
    private ArrayList <Product> products;
    private Seller owner;

    public String getName() {
        return name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Seller getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void setOwner(Seller owner) {
        this.owner = owner;
    }

    public Store(String name, LocalDate creationDate, ArrayList<Product> products, Seller owner) {
        this.name = name;
        this.creationDate = creationDate;
        this.products = new ArrayList <>();
        this.owner = owner;
    }
    
    
}
