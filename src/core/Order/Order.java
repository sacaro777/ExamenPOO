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
}
