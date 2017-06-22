package com.unicauca.mondragon.seego.net;

import com.unicauca.mondragon.seego.models.Estudiante;

/**
 * Created by Asus on 22/06/2017.
 */

public class LoginResponse extends SimpleResponse {
    Estudiante user;

    public LoginResponse(boolean success,Estudiante user) {
        super(success);
        this.user = user;
    }

    public Estudiante getUser() {
        return user;
    }

    public void setUser(Estudiante user) {
        this.user = user;
    }
}
