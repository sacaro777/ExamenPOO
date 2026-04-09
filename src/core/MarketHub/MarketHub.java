/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.MarketHub;

import core.Order.Order;
import core.Order.Status;
import core.User.Client;
import core.User.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarketHub {

    private List<User> users = new ArrayList<>();
    private List<Store> stores = new ArrayList<>();

    public void addUser(User u) {
        users.add(u);
    }

    public void addStore(Store s) {
        stores.add(s);
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Store> getStores() {
        return stores;
    }

    public User getUserById(int id) {
        for (User u : users) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    public User getUserByIndex(int i) {
        return (i >= 0 && i < users.size()) ? users.get(i) : null;
    }

    public Store getStoreById(int id) {
        for (Store s : stores) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public Store getStoreByIndex(int i) {
        return (i >= 0 && i < stores.size()) ? stores.get(i) : null;
    }

    public void printStoresSummary() {
        System.out.println("===== STORES SUMMARY =====");
        for (Store s : stores) {
            System.out.println("Store: " + s.getName());
            System.out.println(" Owner: " + s.getOwner().getName() + " | " + s.getOwner().getEmail());
            System.out.println(" Created: " + s.getCreationDate());
            for (Product p : s.getProducts()) {
                System.out.println(" - " + p.getName() + " stock: " + p.getInventoryQuantity());
            }
        }
    }

    public void printOrdersSummaryByClient() {
        System.out.println("===== ORDERS BY CLIENT =====");
        for (User u : users) {
            if (!(u instanceof Client)) {
                continue;
            }
            Client c = (Client) u;
            System.out.println("Client: " + c.getName());
            for (Status s : Status.values()) {
                List<Order> list = c.getOrdersByStatus(s);
                float total = 0;
                for (Order o : list) {
                    total += o.getTotal();
                }
                System.out.printf(" Orders", Order o, s, list.size(), total);
            }
        }
    }

    public void printTopRevenueProduct() {
        Map<Integer, Float> revenue = new HashMap<>();
        Map<Integer, String> names = new HashMap<>();
        for (User u : users) {
            if (!(u instanceof Client)) {
                continue;
            }
            for (Order o : ((Client) u).getOrders()) {
                if (o.getStatus() != Status.SENT && o.getStatus() != Status.DELIVERED) {
                    continue;
                }
                for (Element e : o.getProducts()) {
                    int pid = e.getProduct().getId();
                    revenue.put(pid, revenue.getOrDefault(pid, 0f) + e.getSubtotal());
                    names.put(pid, e.getProduct().getName());
                }
            }
        }
        int topId = -1;
        float top = -1;
        for (Map.Entry<Integer, Float> entry : revenue.entrySet()) {
            if (entry.getValue() > top) {
                top = entry.getValue();
                topId = entry.getKey();
            }
        }
        System.out.println("===== TOP REVENUE PRODUCT =====");
        if (topId == -1) {
            System.out.println("No data.");
        } else {
            System.out.printf("Product: %s | Revenue: $%.2f%n", names.get(topId), top);
        }
    }

    public void printTopSpendingClient() {
        Client top = null;
        float max = -1;
        for (User u : users) {
            if (!(u instanceof Client)) {
                continue;
            }
            float spent = ((Client) u).getTotalSpent();
            if (spent > max) {
                max = spent;
                top = (Client) u;
            }
        }
        System.out.println("===== TOP SPENDING CLIENT =====");
        if (top == null) {
            System.out.println("No data.");
        } else {
            System.out.printf("Client: %s | Spent: ", top, top.getName(), max);
        }
    
    }
    }
