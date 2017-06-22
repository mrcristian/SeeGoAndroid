package com.unicauca.mondragon.seego.net;

import com.unicauca.mondragon.seego.models.Estudiante;

/**
 * Created by Asus on 22/06/2017.
 */

public class RegistroResponse extends SimpleResponse {
    String message;

    public RegistroResponse(boolean success,String message) {
        super(success);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
