/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.Order;

import core.MarketHub.Element;
import core.MarketHub.Product;
import core.User.Client;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static int counter = 0;
    private int id;
    private Client client;
    private Date date;
    private Status status;
    private List<Element> products = new ArrayList<>();

    public Order(Client client) {
        this.id = ++counter;
        this.client = client;
        this.date = new Date();
        this.status = Status.PENDING;
    }

    public int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public Date getDate() {
        return date;
    }

    public Status getStatus() {
        return status;
    }

    public List<Element> getProducts() {
        return products;
    }

    public void addProduct(Product product, int quantity) {
        for (Element e : products) {
            if (e.getProduct().getId() == product.getId()) {
                e.setQuantity(e.getQuantity() + }
            products.add(new Element(product, quantity));
        }


    public boolean confirm() {
        if (status != Status.PENDING) {
            return false;
        }
        for (Element e : products) {
            if (!e.getProduct().hasStock(e.getQuantity())) {
                return false;
            }
        }
        for (Element e : products) {
            e.getProduct().reduceStock(e.getQuantity());
        }
        status = Status.SENT;
        return true;
    }

    public boolean receive() {
        if (status != Status.SENT) {
            return false;
        }
        status = Status.DELIVERED;
        return true;
    }

    public boolean cancel() {
        if (status == Status.PENDING) {
            status = Status.CANCELED;
            return true;
        }
        if (status == Status.SENT) {
            for (Element e : products) {
                e.getProduct().increaseStock(e.getQuantity());
            }
            status = Status.CANCELED;
            return true;
        }
        return false;
    }

    public float getTotal() {
        float t = 0;
        for (Element e : products) {
            t += e.getSubtotal();
        }
        return t;
    }
}
