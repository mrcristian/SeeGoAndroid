package com.unicauca.mondragon.seego;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.unicauca.mondragon.seego.databinding.ActivityRegistroBinding;
import com.unicauca.mondragon.seego.models.Estudiante;
import com.unicauca.mondragon.seego.net.EstudiantesClient;
import com.unicauca.mondragon.seego.net.RegistroResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegistroActivity extends AppCompatActivity implements Callback<RegistroResponse> {

    ActivityRegistroBinding binding;
    EstudiantesClient cliente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_registro);
        binding.setHandler(this);
        cliente = ((App)getApplication()).retrofit.create(EstudiantesClient.class);
    }
    public void goToLogin(){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
    public void aceptarRegistro(){
        Estudiante estudiante = new Estudiante();
        estudiante.setUser(binding.txtUsuario.getText().toString());
        estudiante.setPass(binding.txtContrasenia.getText().toString());
        estudiante.setNombre(binding.txtNombre.getText().toString());
        estudiante.setApellido(binding.txtApellido.getText().toString());
        estudiante.setNoIdentificacion(binding.txtIdentificacion.getText().toString());
        estudiante.setTelefono(binding.txtTelefono.getText().toString());
        estudiante.setDireccion(binding.txtDireccion.getText().toString());
        estudiante.setCiudadOrigen(binding.txtCiudad.getText().toString());
        estudiante.setTipo("user");

        Call<RegistroResponse> request = cliente.registrar(estudiante);
        request.enqueue(this);

        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public void onResponse(Call<RegistroResponse> call, Response<RegistroResponse> response) {
        if(response.isSuccessful()){
            RegistroResponse registroResponse = response.body();
            if(registroResponse.isExists()){
                Toast.makeText(this, R.string.RegistroExitoso, Toast.LENGTH_SHORT).show();
                finish();
            }else
            {
                Toast.makeText(this, R.string.UsuarioInvalido,Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(this, R.string.errorRegistroUsuario,Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onFailure(Call<RegistroResponse> call, Throwable t) {
        Toast.makeText(this, R.string.errorServidor,Toast.LENGTH_SHORT).show();
    }
}
