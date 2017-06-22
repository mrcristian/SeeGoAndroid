package com.unicauca.mondragon.seego.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.unicauca.mondragon.seego.R;
import com.unicauca.mondragon.seego.databinding.TemplateCommentBinding;
import com.unicauca.mondragon.seego.models.Comentario;

import java.util.List;

/**
 * Created by Asus on 21/06/2017.
 */

public class ComentarioAdapter extends RecyclerView.Adapter<ComentarioAdapter.ComentarioHolder> {

    List<Comentario> data;
    LayoutInflater inflater;

    public ComentarioAdapter(LayoutInflater inflater, List<Comentario> data ) {

        this.data = data;
        this.inflater = inflater;
    }

    @Override
    public ComentarioAdapter.ComentarioHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.template_comment,parent,false);
        return new ComentarioAdapter.ComentarioHolder(v);
    }

    @Override
    public void onBindViewHolder(ComentarioAdapter.ComentarioHolder holder, int position) {
        //holder.binding.setComentario(data.get(position));
        holder.binding.setComentario(data.get(position));
        holder.binding.card.setTag(position);
    }
    @Override
    public int getItemCount() {
        return data.size();
    }



    public interface OnComentarioListener{
        void onComentarioClick(int position);
    }

    static class ComentarioHolder extends RecyclerView.ViewHolder{
        TemplateCommentBinding binding;
        public ComentarioHolder(View itemView){
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }

}
