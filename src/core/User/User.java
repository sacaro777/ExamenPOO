/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.User;

import java.time.LocalDate;

/**
 *
 * @author sacaro
 */
public abstract class User {
    protected int id;
    protected String name;
    protected String email;
    protected LocalDate RegristationDate;

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

    public User(int id, String name, String email, LocalDate RegristationDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.RegristationDate = RegristationDate;
    }
    
    
}
