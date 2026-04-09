/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.Order;

import core.MarketHub.Product;
import core.User.Client;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author sacaro
 */
public class Order {
    private int id;
    private Client client;
    private LocalDate date;
    private Status status;
    private ArrayList <Product> products;

    public int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public LocalDate getDate() {
        return date;
    }

    public Status getStatus() {
        return status;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Order(int id, Client client, LocalDate date, Status status, ArrayList<Product> products) {
        this.id = id;
        this.client = client;
        this.date = date;
        this.status = status;
        this.products = new ArrayList <>();
    }

    
}
