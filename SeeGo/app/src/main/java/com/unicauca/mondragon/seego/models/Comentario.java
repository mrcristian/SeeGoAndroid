package com.unicauca.mondragon.seego.models;

/**
 * Created by Asus on 20/06/2017.
 */

public class Comentario {

    private String productor,descripcion,fecha;

    public Comentario(String productor, String descripcion, String fecha) {
        this.productor = productor;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
