package com.unicauca.mondragon.seego.net;

import com.unicauca.mondragon.seego.models.Estudiante;

/**
 * Created by Asus on 22/06/2017.
 */

public class SimpleResponse {
    boolean success;
    //Object user;

    public SimpleResponse(boolean success) {
        this.success = success;
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
