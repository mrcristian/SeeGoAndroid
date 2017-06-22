package com.unicauca.mondragon.seego.models;

/**
 * Created by Asus on 22/06/2017.
 */

public class User {
    String Email, Password;

    public User(String email, String password) {
        this.Email = email;
        this.Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
}
