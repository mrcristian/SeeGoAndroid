package com.unicauca.mondragon.seego.models;

import java.util.List;

/**
 * Created by Asus on 20/06/2017.
 */

public class Apartamento {
    //Propieatario
    private String idPropietario,telefono,correo;
    //Detalles
    int costo;
    private String _id,size,ubicacion,descripcion,serviciosBasicos,internet,alimentacion,tv,visible,imagen;
    //Comentarios
    private int interesados;
    private List<Comentario> comentarios;

    public Apartamento(String idPropietario, String telefono, String correo,
                       int costo, String _id, String size, String ubicacion,
                       String descripcion, String serviciosBasicos, String internet,
                       String alimentacion, String tv, String visible, String imagen,
                       int interesados, List<Comentario> comentarios) {
        this.idPropietario = idPropietario;
        this.telefono = telefono;
        this.correo = correo;
        this.costo = costo;
        this._id = _id;
        this.size = size;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.serviciosBasicos = serviciosBasicos;
        this.internet = internet;
        this.alimentacion = alimentacion;
        this.tv = tv;
        this.visible = visible;
        this.imagen = imagen;
        this.interesados = interesados;
        this.comentarios = comentarios;
    }

    public String getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(String idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getServiciosBasicos() {
        return serviciosBasicos;
    }

    public void setServiciosBasicos(String serviciosBasicos) {
        this.serviciosBasicos = serviciosBasicos;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getInteresados() {
        return interesados;
    }

    public void setInteresados(int interesados) {
        this.interesados = interesados;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
}
