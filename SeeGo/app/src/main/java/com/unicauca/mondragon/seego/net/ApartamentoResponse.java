package com.unicauca.mondragon.seego.net;

import com.unicauca.mondragon.seego.models.Apartamento;
import com.unicauca.mondragon.seego.models.Comentario;

import java.util.List;

/**
 * Created by Asus on 22/06/2017.
 */

public class ApartamentoResponse extends SimpleResponse {
    List<Apartamento> apartamentos;
    List<Comentario> comentarios;

    public ApartamentoResponse(boolean success, List<Apartamento> apartamentos, List<Comentario> comentarios) {
        super(success);
        this.apartamentos = apartamentos;
        this.comentarios = comentarios;
    }
}
