package com.unicauca.mondragon.seego;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.unicauca.mondragon.seego.databinding.ActivityLoginBinding;
import com.unicauca.mondragon.seego.models.Estudiante;
import com.unicauca.mondragon.seego.models.Usuario;
import com.unicauca.mondragon.seego.net.EstudiantesClient;
import com.unicauca.mondragon.seego.net.LoginResponse;
import com.unicauca.mondragon.seego.net.SimpleResponse;
import com.unicauca.mondragon.seego.util.Preferencias;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity implements Callback<LoginResponse> {

    ActivityLoginBinding binding;
    EstudiantesClient client;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        preferences = getSharedPreferences(Preferencias.PREFERENCE_NAME, MODE_PRIVATE);
        boolean logged =  preferences.getBoolean(Preferencias.KEY_LOGGED, false);
        if(logged){
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
            return;
        }


        binding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        binding.setHandler(this);
        client = ((App)getApplication()).retrofit.create(EstudiantesClient.class);

    }
    public void goToHome(){
        Usuario usuario = new Usuario();
        usuario.setUser(binding.txtUsuario.getText().toString());
        usuario.setPass(binding.txtPassword.getText().toString());
        Call<LoginResponse> request = client.login(usuario);
        request.enqueue(this);
    }
    public void goToRegistro(){
        Intent intent = new Intent(this,RegistroActivity.class);
        startActivity(intent);
    }

    @Override
    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
        if(response.isSuccessful()){
            LoginResponse loginResponse = response.body();
            if(loginResponse.isSuccess()){

                String username =  binding.txtUsuario.getText().toString();
                SharedPreferences.Editor editor =  preferences.edit();
                editor.putString(Preferencias.KEY_EMAIL, username);
                editor.putBoolean(Preferencias.KEY_LOGGED, true);
                editor.apply();

                Intent intent = new Intent(this,HomeActivity.class);
                startActivity(intent);
            }
            else{
                Toast.makeText(this, R.string.invalidoPassContra,Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(this, R.string.datoNoEncontrado,Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onFailure(Call<LoginResponse> call, Throwable t) {

    }
}
