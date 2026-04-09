/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.User;

import core.MarketHub.Product;
import core.MarketHub.Store;
import java.time.LocalDate;

/**
 *
 * @author sacaro
 */
public class Seller extends User {

    private Store store;

    public Seller(String name, String email) {
        super(name, email);
    }

    public Seller(int i, String henry_Taylor, String henrytaylorexamplecom, LocalDate of) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Store getStore() {
        return store;
    }

    public Store createStore(String storeName) {
        this.store = new Store(storeName, this);
        return store;
    }

    public Product addProductToStore(String name, String description, float price, String category){
        int stock = 0;

    Product p = new Product(name, description, price, category, stock);
    store.addProduct (p);
    return p ;
}}
