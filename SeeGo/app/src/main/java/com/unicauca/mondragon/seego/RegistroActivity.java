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

public class RegistroActivity extends AppCompatActivity {

    ActivityRegistroBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_registro);
        binding.setHandler(this);
    }
    public void goToLogin(){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
    public void aceptarRegistro(){
        Toast toast = Toast.makeText(this,binding.txtNombre.getText().toString(),Toast.LENGTH_SHORT);
        toast.show();
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}
