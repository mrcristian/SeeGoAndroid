package com.unicauca.mondragon.seego.fragments;


import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.unicauca.mondragon.seego.App;
import com.unicauca.mondragon.seego.DetalleActivity;
import com.unicauca.mondragon.seego.HomeActivity;
import com.unicauca.mondragon.seego.R;
import com.unicauca.mondragon.seego.adapters.ApartamentoAdapter;
import com.unicauca.mondragon.seego.databinding.FragmentVistaEstudianteBinding;
import com.unicauca.mondragon.seego.models.Apartamento;
import com.unicauca.mondragon.seego.net.ApartamentoClient;
import com.unicauca.mondragon.seego.net.ApartamentoResponse;
import com.unicauca.mondragon.seego.net.LoginResponse;
import com.unicauca.mondragon.seego.util.Data;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class VistaEstudianteFragment extends Fragment implements ApartamentoAdapter.OnApartamentoListener, Callback<List<Apartamento>> {

    FragmentVistaEstudianteBinding binding;
    ApartamentoAdapter adapter;
    ApartamentoClient client;
    List<Apartamento> apartamentos;

    public static VistaEstudianteFragment instance(){
        return new VistaEstudianteFragment();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_vista_estudiante,container,false);
        client = ((App)getActivity().getApplication()).retrofit.create(ApartamentoClient.class);




        adapter = new ApartamentoAdapter(getLayoutInflater(null),Data.getApartamentos(),this);
        binding.recycler.setAdapter(adapter);
        binding.recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }

    @Override
    public void onResume() {
        super.onResume();
        loadData();

    }

    private void loadData() {
        Call<List<Apartamento>> request = client.disponibles();
        request.enqueue(this);

    }

    @Override
    public void onApartamentoClick(int position) {
        Intent intent = new Intent(getActivity(), DetalleActivity.class);
        intent.putExtra("pos",position);
        startActivity(intent);
    }

    @Override
    public void onResponse(Call<List<Apartamento>> call, Response<List<Apartamento>> response) {
        if(response.isSuccessful()){
            List<Apartamento> data = response.body();
            adapter.setData(data);
            Data.setApartamentos(data);
        }
        else{
            //Toast.makeText(this, R.string.datoNoEncontrado,Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onFailure(Call<List<Apartamento>> call, Throwable t) {

    }
}
