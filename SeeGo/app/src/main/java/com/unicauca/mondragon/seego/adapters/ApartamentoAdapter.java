package com.unicauca.mondragon.seego.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.unicauca.mondragon.seego.DetalleActivity;
import com.unicauca.mondragon.seego.R;
import com.unicauca.mondragon.seego.databinding.TemplateApartamentoBinding;
import com.unicauca.mondragon.seego.models.Apartamento;

import java.util.List;

/**
 * Created by Asus on 20/06/2017.
 */

public class ApartamentoAdapter extends RecyclerView.Adapter<ApartamentoAdapter.ApartamentoHolder> {

    OnApartamentoListener listener;
    List<Apartamento> data;
    LayoutInflater inflater;
    Activity padre;

    public ApartamentoAdapter(LayoutInflater inflater, List<Apartamento> data,OnApartamentoListener listener ) {
        this.listener = listener;
        this.data = data;
        this.inflater = inflater;
        this.padre = ((Fragment)listener).getActivity();
    }

    @Override
    public ApartamentoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.template_apartamento,parent,false);
        return new ApartamentoHolder(v);
    }

    @Override
    public void onBindViewHolder(ApartamentoHolder holder, int position) {
        holder.binding.setApartamento(data.get(position));
        holder.binding.card.setTag(position);
        holder.binding.setHandler(this);
    }
    public void clickLike(){
        Log.d("m1","Me gusta");
    }
    public void clickComment(){
        Log.d("m2","Me Comenta");
    }
    public void clickContact(int pos){
        Apartamento aux = data.get(pos);
        Toast.makeText(this.padre,"Contacte al propieatario mediate el correo: "+aux.getCorreo()+" y el telefono: "+aux.getTelefono(),Toast.LENGTH_LONG).show();
    }
    public void clickDetails(int pos){
        Intent intent = new Intent(this.padre,DetalleActivity.class);

        intent.putExtra("pos",pos);
        padre.startActivity(intent);
    }

    public void setData(List<Apartamento> apartamentos) {
        this.data = apartamentos;
        this.notifyDataSetChanged();
    }
    @Override
    public int getItemCount() {
        return data.size();
    }

    public void onItemClick(int position){
        Intent intent = new Intent(this.padre,DetalleActivity.class);

        intent.putExtra("pos",position);
        padre.startActivity(intent);
    }

    public interface OnApartamentoListener{
        void onApartamentoClick(int position);
    }

    static class ApartamentoHolder extends RecyclerView.ViewHolder{
        TemplateApartamentoBinding binding;
        public ApartamentoHolder(View itemView){
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }

}
