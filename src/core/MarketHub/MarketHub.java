/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.MarketHub;

import core.User.User;
import java.util.ArrayList;

/**
 *
 * @author sacaro
 */
public class MarketHub {
    private ArrayList <User> users;
    private ArrayList <Store> stores;

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Store> getStores() {
        return stores;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void setStores(ArrayList<Store> stores) {
        this.stores = stores;
    }

    public MarketHub(ArrayList<User> users, ArrayList<Store> stores) {
        this.users = new ArrayList <>();;
        this.stores = new ArrayList <>();;
    }
    
    
}
