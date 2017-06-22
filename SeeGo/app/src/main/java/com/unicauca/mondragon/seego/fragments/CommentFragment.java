package com.unicauca.mondragon.seego.fragments;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.unicauca.mondragon.seego.R;
import com.unicauca.mondragon.seego.adapters.ComentarioAdapter;
import com.unicauca.mondragon.seego.databinding.FragmentCommentBinding;
import com.unicauca.mondragon.seego.util.Data;

import java.security.PublicKey;

/**
 * A simple {@link Fragment} subclass.
 */
public class CommentFragment extends Fragment {

    FragmentCommentBinding binding;
    ComentarioAdapter adapter;
    public CommentFragment() {
        // Required empty public constructor
    }

    public static CommentFragment instance(){
        return new CommentFragment();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_comment,container,false);
        //MUCHO OJO CON ESTE METODO
        if(getArguments() != null) {
            int pos = getArguments().getInt("AptoPos");
            adapter = new ComentarioAdapter(getLayoutInflater(null), Data.getComentarios(pos));
            binding.recycler2.setAdapter(adapter);
            binding.recycler2.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        return binding.getRoot();
    }

}
