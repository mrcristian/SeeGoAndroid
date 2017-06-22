package com.unicauca.mondragon.seego.net;

import com.unicauca.mondragon.seego.models.Estudiante;

/**
 * Created by Asus on 22/06/2017.
 */

public class RegistroResponse extends SimpleResponse {
    boolean exists;

    public RegistroResponse(boolean success) {
        super(success);
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }
}
