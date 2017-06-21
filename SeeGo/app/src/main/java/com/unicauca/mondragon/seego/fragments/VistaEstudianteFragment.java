package com.unicauca.mondragon.seego.fragments;


import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.unicauca.mondragon.seego.DetalleActivity;
import com.unicauca.mondragon.seego.R;
import com.unicauca.mondragon.seego.adapters.ApartamentoAdapter;
import com.unicauca.mondragon.seego.databinding.FragmentVistaEstudianteBinding;
import com.unicauca.mondragon.seego.util.Data;

/**
 * A simple {@link Fragment} subclass.
 */
public class VistaEstudianteFragment extends Fragment implements ApartamentoAdapter.OnApartamentoListener {

    FragmentVistaEstudianteBinding binding;
    ApartamentoAdapter adapter;

    public static VistaEstudianteFragment instance(){
        return new VistaEstudianteFragment();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_vista_estudiante,container,false);
        adapter = new ApartamentoAdapter(getLayoutInflater(null),Data.getApartamentos(),this);
        binding.recycler.setAdapter(adapter);
        binding.recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }

    @Override
    public void onApartamentoClick(int position) {
        Intent intent = new Intent(getActivity(), DetalleActivity.class);
        intent.putExtra("pos",position);
        startActivity(intent);
    }
}
