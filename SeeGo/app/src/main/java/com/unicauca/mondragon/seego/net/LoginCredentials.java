package com.unicauca.mondragon.seego.net;

/**
 * Created by Asus on 22/06/2017.
 */

public class LoginCredentials {
    private  String token, expiration, userName;

    public LoginCredentials(String token, String expiration, String userName) {
        this.token = token;
        this.expiration = expiration;
        this.userName = userName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
