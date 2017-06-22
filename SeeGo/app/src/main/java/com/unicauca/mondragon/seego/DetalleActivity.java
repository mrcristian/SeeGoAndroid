package com.unicauca.mondragon.seego;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.unicauca.mondragon.seego.adapters.ComentarioAdapter;
import com.unicauca.mondragon.seego.databinding.ActivityDetalleBinding;
import com.unicauca.mondragon.seego.fragments.CommentFragment;
import com.unicauca.mondragon.seego.models.Apartamento;
import com.unicauca.mondragon.seego.util.Data;

public class DetalleActivity extends AppCompatActivity  {

    ActivityDetalleBinding binding;
    ComentarioAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detalle);
        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adapter = new ComentarioAdapter(getLayoutInflater(), Data.getComentarios());
        putFragment(R.id.container2, CommentFragment.instance());


        Apartamento apartamento = Data.getApartamento(0);
        binding.setApartamento(apartamento);
/*        RecyclerView v = (RecyclerView) findViewById(R.id.reciclerComment);
        v.setAdapter(adapter);

        setContentView(R.layout.activity_detalle);*/
    }
    public void putFragment(int container, Fragment fragment){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(container,fragment);
        ft.commit();
    }
}
