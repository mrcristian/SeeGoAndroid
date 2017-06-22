package com.unicauca.mondragon.seego.util;

import com.unicauca.mondragon.seego.models.Apartamento;
import com.unicauca.mondragon.seego.models.Comentario;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Retrofit;

/**
 * Created by Asus on 20/06/2017.
 */

public class Data {
    //region Datos en piedra
    private static List<Apartamento> apartamentos;
    private static List<Comentario> comentarios;

    public static List<Apartamento> getApartamentos() {
        return (apartamentos != null) ? apartamentos
                : new ArrayList<Apartamento>();
    }

    public static Apartamento getApartamento(int pos) {
        if (apartamentos != null && pos < apartamentos.size()) {
            return apartamentos.get(pos);
        }
        return null;
    }
    public static void setApartamentos(List<Apartamento> data) {
        apartamentos = data;
    }

    public static List<Comentario> getComentarios() {
        return new ArrayList<Comentario>();
    }

    public static List<Comentario> getComentarios(int pos) {
        if(apartamentos.get(pos) != null)
        {
            return apartamentos.get(pos).getComentarios();
        }
        return new ArrayList<Comentario>();
    }


}
