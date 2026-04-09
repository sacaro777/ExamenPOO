/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.User;

import core.MarketHub.Store;
import java.time.LocalDate;

/**
 *
 * @author sacaro
 */
public class Seller extends User{
    private Store store;

    public Seller(int id, String name, String email, LocalDate RegristationDate) {
        super(id, name, email, RegristationDate);
    }

    public Store getStore() {
        return store;
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

    public void setStore(Store store) {
        this.store = store;
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
