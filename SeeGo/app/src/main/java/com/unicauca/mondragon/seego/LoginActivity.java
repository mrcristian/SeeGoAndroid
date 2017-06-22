package com.unicauca.mondragon.seego;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.unicauca.mondragon.seego.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        binding.setHandler(this);
    }
    public void goToHome(){
//        Log.d("OJO----",binding.txtUsuario.getText().toString());
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }
    public void goToRegistro(){
        Intent intent = new Intent(this,RegistroActivity.class);
        startActivity(intent);
    }
}
