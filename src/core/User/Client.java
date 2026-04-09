/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.User;

import core.Order.Order;
import core.Order.Status;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client extends User {

    private List<Order> orders = new ArrayList<>();

    public Client(String name, String email) {
        super(name, email);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public Order createOrder() {
        Order o = new Order(this);
        orders.add(o);
        return o;
    }

    public Order getOrderById(int id) {
        for (Order o : orders) {
            if (o.getId() == id) {
                return o;
            }
        }
        return null;
    }

    public Order getOrderByIndex(int i) {
        return (i >= 0 && i < orders.size()) ? orders.get(i) : null;
    }

    public List<Order> getOrdersByStatus(Status status) {
        List<Order> result = new ArrayList<>();
        for (Order o : orders) {
            if (o.getStatus() == status) {
                result.add(o);
            }
        }
        return result;
    }

    public float getTotalSpent() {
        float t = 0;
        for (Order o : orders) {
            if (o.getStatus() == Status.SENT || o.getStatus() == Status.DELIVERED) {
                t += o.getTotal();
            }
        }
        return t;
    }
}

