package com.unicauca.mondragon.seego.models;

/**
 * Created by Asus on 20/06/2017.
 */

public class Estudiante {
    private String _id,user,pass,tipo,noIdentificacion,nombre,apellido,direccion,telefono,ciudadOrigen;

    public Estudiante(String _id, String user, String pass, String tipo,
                      String noIdentificacion, String nombre, String apellido,
                      String direccion, String telefono, String ciudadOrigen) {
        this._id = _id;
        this.user = user;
        this.pass = pass;
        this.tipo = tipo;
        this.noIdentificacion = noIdentificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudadOrigen = ciudadOrigen;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNoIdentificacion() {
        return noIdentificacion;
    }

    public void setNoIdentificacion(String noIdentificacion) {
        this.noIdentificacion = noIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }
}