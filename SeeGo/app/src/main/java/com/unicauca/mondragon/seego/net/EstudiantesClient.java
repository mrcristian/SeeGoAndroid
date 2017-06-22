package com.unicauca.mondragon.seego.net;

import com.unicauca.mondragon.seego.models.Estudiante;
import com.unicauca.mondragon.seego.models.Usuario;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Asus on 22/06/2017.
 */

public interface EstudiantesClient {

    @POST("estudiantes/registrar")
    Call<RegistroResponse> registrar(@Body Estudiante estudiante);

    @POST("estudiantes/login")
    Call<LoginResponse> login(@Body Usuario usuario);



}
