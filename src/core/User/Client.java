/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.User;

import core.Order.Order;
import java.time.LocalDate;

/**
 *
 * @author sacaro
 */
public class Client extends User {
    private Order order;

    public Client(int id, String name, String email, LocalDate RegristationDate) {
        super(id, name, email, RegristationDate);
    }

    public Order getOrder() {
        return order;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getRegristationDate() {
        return RegristationDate;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRegristationDate(LocalDate RegristationDate) {
        this.RegristationDate = RegristationDate;
    }
    
    
}
