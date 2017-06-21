package com.unicauca.mondragon.seego.util;

import com.unicauca.mondragon.seego.models.Apartamento;
import com.unicauca.mondragon.seego.models.Comentario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 20/06/2017.
 */

public class Data {
    private static List<Apartamento> apartamentos;
    private static List<Comentario> comentarios;

    public static List<Apartamento> getApartamentos(){
        comentarios = new ArrayList<>();
        comentarios.add(new Comentario("Pedro","Hola","Ayer"));
        comentarios.add(new Comentario("Maria","Hola","Hoy"));
        if(apartamentos == null){
            apartamentos = new ArrayList<>();
            apartamentos.add(new Apartamento("2020","3213213112",
                    "pablonuevo@gmail.com",700000,
                    "58ee2d16107a970011ec553d","7",
                    "Cra 2","Comoda para pareja",
                    "si","no",
                    "si","si",
                    "si","http://www.3torress.com/img/blog/como-ahorrar-espacios-en-apartamentos.jpg",
                    2,comentarios));
            apartamentos.add(new Apartamento("2020","3213213112",
                    "pablonuevo@gmail.com",700000,
                    "58ee2d16107a970011ec553d","7",
                    "Cra 2","Comoda para pareja",
                    "si","no",
                    "si","si",
                    "si","http://www.3torress.com/img/blog/como-ahorrar-espacios-en-apartamentos.jpg",
                    4,comentarios));
        }
        return apartamentos;
    }

}
