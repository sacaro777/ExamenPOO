/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.User;

import java.util.Date;

public abstract class User {

    private static int counter = 0;
    private int id;
    private String name;
    private String email;
    private Date registrationDate;

    public User(String name, String email) {
        this.id = ++counter;
        this.name = name;
        this.email = email;
        this.registrationDate = new Date();
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

    public Date getRegistrationDate() {
        return registrationDate;
    }
}
