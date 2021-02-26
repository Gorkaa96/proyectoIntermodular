package com.gorka_hernandez.memorygame.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.gorka_hernandez.memorygame.CreditosActivity;
import com.gorka_hernandez.memorygame.LevelActivity;
import com.gorka_hernandez.memorygame.PuntuacionesActivity;
import com.gorka_hernandez.memorygame.R;

import io.realm.Realm;

public class StartFragment extends Fragment {

    TextView title;
    Button btnJugar;
    Button btnPuntuaciones;
    Button btnCreditos;


    public StartFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_start, container, false);

        title = (TextView) view.findViewById(R.id.startTitle);
        btnJugar = (Button) view.findViewById(R.id.btnFacil);
        btnPuntuaciones = (Button) view.findViewById(R.id.btnMedio);
        btnCreditos = (Button) view.findViewById(R.id.btnDificil);;

        btnJugar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(),LevelActivity.class);
                startActivity(in);
            }
        });

        btnPuntuaciones.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), PuntuacionesActivity.class);
                startActivity(in);
            }
        });

        btnCreditos.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), CreditosActivity.class);
                startActivity(in);
            }
        });


        // Inflate the layout for this fragment
        return view;
    }


}