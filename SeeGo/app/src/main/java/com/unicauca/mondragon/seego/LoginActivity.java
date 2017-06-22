package com.unicauca.mondragon.seego;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.unicauca.mondragon.seego.databinding.ActivityLoginBinding;
import com.unicauca.mondragon.seego.models.Estudiante;
import com.unicauca.mondragon.seego.models.Usuario;
import com.unicauca.mondragon.seego.net.EstudiantesClient;
import com.unicauca.mondragon.seego.net.SimpleResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity implements Callback<SimpleResponse> {

    ActivityLoginBinding binding;
    EstudiantesClient client;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        binding.setHandler(this);
        client = ((App)getApplication()).retrofit.create(EstudiantesClient.class);

    }
    public void goToHome(){
        Usuario usuario = new Usuario();
        usuario.setUser(binding.txtUsuario.getText().toString());
        usuario.setPass(binding.txtPassword.getText().toString());
        Call<SimpleResponse> request = client.login(usuario);
        request.enqueue(this);
//        Log.d("OJO----",binding.txtUsuario.getText().toString());
        //Intent intent = new Intent(this,HomeActivity.class);
        //startActivity(intent);
    }
    public void goToRegistro(){
        Intent intent = new Intent(this,RegistroActivity.class);
        startActivity(intent);
    }


    @Override
    public void onResponse(Call<SimpleResponse> call, Response<SimpleResponse> response) {
        if(response.isSuccessful()){
            SimpleResponse simpleResponse = response.body();
            if(simpleResponse.isSuccess()){
                Intent intent = new Intent(this,HomeActivity.class);
                startActivity(intent);
            }
            else{
                Toast.makeText(this, R.string.invalidoPassContra,Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(this,"El usuario no esta registrado",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onFailure(Call<SimpleResponse> call, Throwable t) {

    }
}
