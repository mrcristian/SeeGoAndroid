package com.unicauca.mondragon.seego.net;

import com.unicauca.mondragon.seego.models.Apartamento;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Asus on 22/06/2017.
 */

public interface ApartamentoClient {
    @POST("apartamentos/consultarDisponibles")
    Call<List<Apartamento>> disponibles();
}
