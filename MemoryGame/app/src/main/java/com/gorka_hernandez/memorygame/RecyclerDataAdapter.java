package com.gorka_hernandez.memorygame;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RecyclerDataAdapter extends RecyclerView.Adapter<com.gorka_hernandez.memorygame.RecyclerDataAdapter.RecyclerDataHolder>
                                implements View.OnClickListener {

    private List<Puntuaciones> listaPuntuaciones;
    private View.OnClickListener listener;


    public RecyclerDataAdapter(List<Puntuaciones> listaPuntos) {
        this.listaPuntuaciones = listaPuntos;
    }

    @NonNull
    @Override
    public RecyclerDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null, false);
        view.setOnClickListener(this);
        return new RecyclerDataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerDataHolder holder, int position) {
        holder.assignData(listaPuntuaciones.get(position));
    }

    @Override
    public int getItemCount() {

        return listaPuntuaciones.size();
    }

    public void setOnClickListener(View.OnClickListener listener){

        this.listener=listener;
    }
    @Override
    public void onClick(View view) {
        if (listener != null){
            listener.onClick(view);
        }
    }


    public class RecyclerDataHolder extends RecyclerView.ViewHolder {

        TextView puntuacion;


        public RecyclerDataHolder(@NonNull View itemView) {
            super(itemView);
            puntuacion = (TextView) itemView.findViewById(R.id.textView);

        }

        public void assignData(Puntuaciones puntos) {
            puntuacion.setText(puntos.getNombreUsuario()+": "+puntos.getPuntuacion());
        }
        
    }
}
