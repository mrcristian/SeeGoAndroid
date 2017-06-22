package com.unicauca.mondragon.seego;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.unicauca.mondragon.seego.databinding.ActivityHomeBinding;
import com.unicauca.mondragon.seego.fragments.VistaEstudianteFragment;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        putFragment(R.id.container, VistaEstudianteFragment.instance());
        binding = DataBindingUtil.setContentView(this,R.layout.activity_home);

    }


    public void putFragment(int container, Fragment fragment){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(container,fragment);
        ft.commit();
    }
}
