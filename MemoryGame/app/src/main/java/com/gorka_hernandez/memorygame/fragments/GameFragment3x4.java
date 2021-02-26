package com.gorka_hernandez.memorygame.fragments;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.gorka_hernandez.memorygame.MainActivity;
import com.gorka_hernandez.memorygame.Puntuaciones;
import com.gorka_hernandez.memorygame.R;
import com.gorka_hernandez.memorygame.StartActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import io.realm.Realm;

public class GameFragment3x4 extends Fragment {

    Puntuaciones punt;
    TextView nombreUsuario;
    TextView lblnombreUsuario;
    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;
    ImageButton imageButton6;
    ImageButton imageButton7;
    ImageButton imageButton8;
    ImageButton imageButton9;
    ImageButton imageButton10;
    ImageButton imageButton11;
    ImageButton imageButton12;
    Chronometer crono;
    Realm realm;
    ArrayList<ImageButton> butonsList = new ArrayList<ImageButton>();
    ArrayList<ImageButton> butonsListAcertadas = new ArrayList<ImageButton>();
    int clicadas=0;
    int acertadas=0;

    public GameFragment3x4() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_game3x4, container, false);

        lblnombreUsuario = view.findViewById(R.id.lblnombre);
        nombreUsuario = view.findViewById(R.id.nombreusuario);
        imageButton1 = view.findViewById(R.id.imageButton);
        imageButton2 = view.findViewById(R.id.imageButton2);
        imageButton3 = view.findViewById(R.id.imageButton3);
        imageButton4 = view.findViewById(R.id.imageButton4);
        imageButton5 = view.findViewById(R.id.imageButton5);
        imageButton6 = view.findViewById(R.id.imageButton6);
        imageButton7 = view.findViewById(R.id.imageButton7);
        imageButton8 = view.findViewById(R.id.imageButton8);
        imageButton9 = view.findViewById(R.id.imageButton9);
        imageButton10 = view.findViewById(R.id.imageButton10);
        imageButton11 = view.findViewById(R.id.imageButton11);
        imageButton12 = view.findViewById(R.id.imageButton12);

        realm = Realm.getDefaultInstance();

        crono = view.findViewById(R.id.chrono);

        crono.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                crono = chronometer;
            }
        });
        crono.start();

        Handler handler = new Handler();


        imageButton1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(butonsList.size()==0){
                    imageButton1.setBackgroundResource(R.drawable.icons8_fat_dog_96);
                    butonsList.add(imageButton1);
                    clicadas += 1;
                }else if(butonsList.get(0)==imageButton1){
                    imageButton1.setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                    clicadas =0;
                    butonsList.clear();
                }else{
                    imageButton1.setBackgroundResource(R.drawable.icons8_fat_dog_96);
                    butonsList.add(imageButton1);

                    clicadas += 1;
                    if (clicadas==2){
                        clicadas=0;
                        imageButton1.setEnabled(false);
                        imageButton2.setEnabled(false);
                        imageButton3.setEnabled(false);
                        imageButton4.setEnabled(false);
                        imageButton5.setEnabled(false);
                        imageButton6.setEnabled(false);
                        imageButton7.setEnabled(false);
                        imageButton8.setEnabled(false);
                        imageButton9.setEnabled(false);
                        imageButton10.setEnabled(false);
                        imageButton11.setEnabled(false);
                        imageButton12.setEnabled(false);
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                comprobarCartas();
                            }
                        }, 1000);
                    }
                }
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(butonsList.size()==0){
                    imageButton2.setBackgroundResource(R.drawable.icons8_pig_96);
                    butonsList.add(imageButton2);
                    clicadas += 1;
                }else if(butonsList.get(0)==imageButton2){
                    imageButton2.setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                    clicadas =0;
                    butonsList.clear();
                }else{
                    imageButton2.setBackgroundResource(R.drawable.icons8_pig_96);
                    butonsList.add(imageButton2);

                    clicadas += 1;
                    if (clicadas==2){
                        clicadas=0;
                        imageButton1.setEnabled(false);
                        imageButton2.setEnabled(false);
                        imageButton3.setEnabled(false);
                        imageButton4.setEnabled(false);
                        imageButton5.setEnabled(false);
                        imageButton6.setEnabled(false);
                        imageButton7.setEnabled(false);
                        imageButton8.setEnabled(false);
                        imageButton9.setEnabled(false);
                        imageButton10.setEnabled(false);
                        imageButton11.setEnabled(false);
                        imageButton12.setEnabled(false);
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                comprobarCartas();
                            }
                        }, 1000);
                    }
                }
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(butonsList.size()==0){
                    imageButton3.setBackgroundResource(R.drawable.icons8_duck_96);
                    butonsList.add(imageButton3);
                    clicadas += 1;
                }else if(butonsList.get(0)==imageButton3){
                    imageButton3.setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                    clicadas =0;
                    butonsList.clear();
                }else{
                    imageButton3.setBackgroundResource(R.drawable.icons8_duck_96);
                    butonsList.add(imageButton3);

                    clicadas += 1;
                    if (clicadas==2){
                        clicadas=0;
                        imageButton1.setEnabled(false);
                        imageButton2.setEnabled(false);
                        imageButton3.setEnabled(false);
                        imageButton4.setEnabled(false);
                        imageButton5.setEnabled(false);
                        imageButton6.setEnabled(false);
                        imageButton7.setEnabled(false);
                        imageButton8.setEnabled(false);
                        imageButton9.setEnabled(false);
                        imageButton10.setEnabled(false);
                        imageButton11.setEnabled(false);
                        imageButton12.setEnabled(false);
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                comprobarCartas();
                            }
                        }, 1000);
                    }
                }
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(butonsList.size()==0){
                    imageButton4.setBackgroundResource(R.drawable.icons8_clown_fish_96);
                    butonsList.add(imageButton4);
                    clicadas += 1;
                }else if(butonsList.get(0)==imageButton4){
                    imageButton4.setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                    clicadas =0;
                    butonsList.clear();
                }else{
                    imageButton4.setBackgroundResource(R.drawable.icons8_clown_fish_96);
                    butonsList.add(imageButton4);

                    clicadas += 1;
                    if (clicadas==2){
                        clicadas=0;
                        imageButton1.setEnabled(false);
                        imageButton2.setEnabled(false);
                        imageButton3.setEnabled(false);
                        imageButton4.setEnabled(false);
                        imageButton5.setEnabled(false);
                        imageButton6.setEnabled(false);
                        imageButton7.setEnabled(false);
                        imageButton8.setEnabled(false);
                        imageButton9.setEnabled(false);
                        imageButton10.setEnabled(false);
                        imageButton11.setEnabled(false);
                        imageButton12.setEnabled(false);
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                comprobarCartas();
                            }
                        }, 1000);
                    }
                }
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(butonsList.size()==0){
                    imageButton5.setBackgroundResource(R.drawable.icons8_european_dragon_96);
                    butonsList.add(imageButton5);
                    clicadas += 1;
                }else if(butonsList.get(0)==imageButton5){
                    imageButton5.setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                    clicadas =0;
                    butonsList.clear();
                }else{
                    imageButton5.setBackgroundResource(R.drawable.icons8_european_dragon_96);
                    butonsList.add(imageButton5);

                    clicadas += 1;
                    if (clicadas==2){
                        clicadas=0;
                        imageButton1.setEnabled(false);
                        imageButton2.setEnabled(false);
                        imageButton3.setEnabled(false);
                        imageButton4.setEnabled(false);
                        imageButton5.setEnabled(false);
                        imageButton6.setEnabled(false);
                        imageButton7.setEnabled(false);
                        imageButton8.setEnabled(false);
                        imageButton9.setEnabled(false);
                        imageButton10.setEnabled(false);
                        imageButton11.setEnabled(false);
                        imageButton12.setEnabled(false);
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                comprobarCartas();
                            }
                        }, 1000);
                    }
                }
            }
        });
        imageButton6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(butonsList.size()==0){
                    imageButton6.setBackgroundResource(R.drawable.icons8_fat_cat_96);
                    butonsList.add(imageButton6);
                    clicadas += 1;
                }else if(butonsList.get(0)==imageButton6){
                    imageButton6.setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                    clicadas =0;
                    butonsList.clear();
                }else{
                    imageButton6.setBackgroundResource(R.drawable.icons8_fat_cat_96);
                    butonsList.add(imageButton6);

                clicadas += 1;
                if (clicadas==2){
                    clicadas=0;
                    imageButton1.setEnabled(false);
                    imageButton2.setEnabled(false);
                    imageButton3.setEnabled(false);
                    imageButton4.setEnabled(false);
                    imageButton5.setEnabled(false);
                    imageButton6.setEnabled(false);
                    imageButton7.setEnabled(false);
                    imageButton8.setEnabled(false);
                    imageButton9.setEnabled(false);
                    imageButton10.setEnabled(false);
                    imageButton11.setEnabled(false);
                    imageButton12.setEnabled(false);
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            comprobarCartas();
                        }
                    }, 1000);
                }
                }
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(butonsList.size()==0){
                    imageButton7.setBackgroundResource(R.drawable.icons8_fat_cat_96);
                    butonsList.add(imageButton7);
                    clicadas += 1;
                }else if(butonsList.get(0)==imageButton7){
                    imageButton7.setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                    clicadas =0;
                    butonsList.clear();
                }else{
                    imageButton7.setBackgroundResource(R.drawable.icons8_fat_cat_96);
                    butonsList.add(imageButton7);

                    clicadas += 1;
                    if (clicadas==2){
                        clicadas=0;
                        imageButton1.setEnabled(false);
                        imageButton2.setEnabled(false);
                        imageButton3.setEnabled(false);
                        imageButton4.setEnabled(false);
                        imageButton5.setEnabled(false);
                        imageButton6.setEnabled(false);
                        imageButton7.setEnabled(false);
                        imageButton8.setEnabled(false);
                        imageButton9.setEnabled(false);
                        imageButton10.setEnabled(false);
                        imageButton11.setEnabled(false);
                        imageButton12.setEnabled(false);
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                comprobarCartas();
                            }
                        }, 1000);
                    }
                }
            }
        });
        imageButton8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(butonsList.size()==0){
                    imageButton8.setBackgroundResource(R.drawable.icons8_clown_fish_96);
                    butonsList.add(imageButton8);
                    clicadas += 1;
                }else if(butonsList.get(0)==imageButton8){
                    imageButton8.setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                    clicadas =0;
                    butonsList.clear();
                }else{
                    imageButton8.setBackgroundResource(R.drawable.icons8_clown_fish_96);
                    butonsList.add(imageButton8);

                    clicadas += 1;
                    if (clicadas==2){
                        clicadas=0;
                        imageButton1.setEnabled(false);
                        imageButton2.setEnabled(false);
                        imageButton3.setEnabled(false);
                        imageButton4.setEnabled(false);
                        imageButton5.setEnabled(false);
                        imageButton6.setEnabled(false);
                        imageButton7.setEnabled(false);
                        imageButton8.setEnabled(false);
                        imageButton9.setEnabled(false);
                        imageButton10.setEnabled(false);
                        imageButton11.setEnabled(false);
                        imageButton12.setEnabled(false);
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                comprobarCartas();
                            }
                        }, 1000);
                    }
                }
            }
        });
        imageButton9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(butonsList.size()==0){
                    imageButton9.setBackgroundResource(R.drawable.icons8_fat_dog_96);
                    butonsList.add(imageButton9);
                    clicadas += 1;
                }else if(butonsList.get(0)==imageButton9){
                    imageButton9.setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                    clicadas =0;
                    butonsList.clear();
                }else{
                    imageButton9.setBackgroundResource(R.drawable.icons8_fat_dog_96);
                    butonsList.add(imageButton9);

                    clicadas += 1;
                    if (clicadas==2){
                        clicadas=0;
                        imageButton1.setEnabled(false);
                        imageButton2.setEnabled(false);
                        imageButton3.setEnabled(false);
                        imageButton4.setEnabled(false);
                        imageButton5.setEnabled(false);
                        imageButton6.setEnabled(false);
                        imageButton7.setEnabled(false);
                        imageButton8.setEnabled(false);
                        imageButton9.setEnabled(false);
                        imageButton10.setEnabled(false);
                        imageButton11.setEnabled(false);
                        imageButton12.setEnabled(false);
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                comprobarCartas();
                            }
                        }, 1000);
                    }
                }
            }
        });
        imageButton10.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(butonsList.size()==0){
                    imageButton10.setBackgroundResource(R.drawable.icons8_pig_96);
                    butonsList.add(imageButton10);
                    clicadas += 1;
                }else if(butonsList.get(0)==imageButton10){
                    imageButton10.setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                    clicadas =0;
                    butonsList.clear();
                }else{
                    imageButton10.setBackgroundResource(R.drawable.icons8_pig_96);
                    butonsList.add(imageButton10);

                    clicadas += 1;
                    if (clicadas==2){
                        clicadas=0;
                        imageButton1.setEnabled(false);
                        imageButton2.setEnabled(false);
                        imageButton3.setEnabled(false);
                        imageButton4.setEnabled(false);
                        imageButton5.setEnabled(false);
                        imageButton6.setEnabled(false);
                        imageButton7.setEnabled(false);
                        imageButton8.setEnabled(false);
                        imageButton9.setEnabled(false);
                        imageButton10.setEnabled(false);
                        imageButton11.setEnabled(false);
                        imageButton12.setEnabled(false);
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                comprobarCartas();
                            }
                        }, 1000);
                    }
                }
            }
        });
        imageButton11.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(butonsList.size()==0){
                    imageButton11.setBackgroundResource(R.drawable.icons8_european_dragon_96);
                    butonsList.add(imageButton11);
                    clicadas += 1;
                }else if(butonsList.get(0)==imageButton11){
                    imageButton11.setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                    clicadas =0;
                    butonsList.clear();
                }else{
                    imageButton11.setBackgroundResource(R.drawable.icons8_european_dragon_96);
                    butonsList.add(imageButton11);

                    clicadas += 1;
                    if (clicadas==2){
                        clicadas=0;
                        imageButton1.setEnabled(false);
                        imageButton2.setEnabled(false);
                        imageButton3.setEnabled(false);
                        imageButton4.setEnabled(false);
                        imageButton5.setEnabled(false);
                        imageButton6.setEnabled(false);
                        imageButton7.setEnabled(false);
                        imageButton8.setEnabled(false);
                        imageButton9.setEnabled(false);
                        imageButton10.setEnabled(false);
                        imageButton11.setEnabled(false);
                        imageButton12.setEnabled(false);
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                comprobarCartas();
                            }
                        }, 1000);
                    }
                }
            }
        });
        imageButton12.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(butonsList.size()==0){
                    imageButton12.setBackgroundResource(R.drawable.icons8_duck_96);
                    butonsList.add(imageButton12);
                    clicadas += 1;
                }else if(butonsList.get(0)==imageButton12){
                    imageButton12.setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                    clicadas =0;
                    butonsList.clear();
                }else{
                    imageButton12.setBackgroundResource(R.drawable.icons8_duck_96);
                    butonsList.add(imageButton12);

                    clicadas += 1;
                    if (clicadas==2){
                        clicadas=0;
                        imageButton1.setEnabled(false);
                        imageButton2.setEnabled(false);
                        imageButton3.setEnabled(false);
                        imageButton4.setEnabled(false);
                        imageButton5.setEnabled(false);
                        imageButton6.setEnabled(false);
                        imageButton7.setEnabled(false);
                        imageButton8.setEnabled(false);
                        imageButton9.setEnabled(false);
                        imageButton10.setEnabled(false);
                        imageButton11.setEnabled(false);
                        imageButton12.setEnabled(false);
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                comprobarCartas();
                            }
                        }, 1000);
                    }
                }
            }
        });



        // Inflate the layout for this fragment
        return view;
    }

    public void comprobarCartas(){
        if(butonsList.get(0).getTag().toString().equals(butonsList.get(1).getTag().toString())){
                if((butonsList.get(0).getTag().toString().equals(imageButton1.getTag().toString()) && butonsList.get(1).getTag().toString().equals(imageButton9.getTag().toString()))||(butonsList.get(0).getTag().toString().equals(imageButton9.getTag().toString())  && butonsList.get(1).getTag().toString().equals(imageButton1.getTag().toString()) )){
                    imageButton1.setEnabled(false);
                    imageButton9.setEnabled(false);
                    imageButton2.setEnabled(true);
                    imageButton3.setEnabled(true);
                    imageButton4.setEnabled(true);
                    imageButton5.setEnabled(true);
                    imageButton6.setEnabled(true);
                    imageButton7.setEnabled(true);
                    imageButton8.setEnabled(true);
                    imageButton10.setEnabled(true);
                    imageButton11.setEnabled(true);
                    imageButton12.setEnabled(true);
                    butonsListAcertadas.add(imageButton1);
                    butonsListAcertadas.add(imageButton9);
                }
            if((butonsList.get(0).getTag().toString().equals(imageButton2.getTag().toString()) && butonsList.get(1).getTag().toString().equals(imageButton10.getTag().toString()))||(butonsList.get(0).getTag().toString().equals(imageButton10.getTag().toString())  && butonsList.get(1).getTag().toString().equals(imageButton2.getTag().toString()) )){
                imageButton1.setEnabled(true);
                imageButton2.setEnabled(false);
                imageButton3.setEnabled(true);
                imageButton4.setEnabled(true);
                imageButton5.setEnabled(true);
                imageButton6.setEnabled(true);
                imageButton7.setEnabled(true);
                imageButton8.setEnabled(true);
                imageButton9.setEnabled(true);
                imageButton10.setEnabled(false);
                imageButton11.setEnabled(true);
                imageButton12.setEnabled(true);
                butonsListAcertadas.add(imageButton2);
                butonsListAcertadas.add(imageButton10);
            }
            if((butonsList.get(0).getTag().toString().equals(imageButton3.getTag().toString()) && butonsList.get(1).getTag().toString().equals(imageButton12.getTag().toString()))||(butonsList.get(0).getTag().toString().equals(imageButton12.getTag().toString())  && butonsList.get(1).getTag().toString().equals(imageButton3.getTag().toString()) )){
                imageButton1.setEnabled(true);
                imageButton2.setEnabled(true);
                imageButton3.setEnabled(false);
                imageButton4.setEnabled(true);
                imageButton5.setEnabled(true);
                imageButton6.setEnabled(true);
                imageButton7.setEnabled(true);
                imageButton8.setEnabled(true);
                imageButton9.setEnabled(true);
                imageButton10.setEnabled(true);
                imageButton11.setEnabled(true);
                imageButton12.setEnabled(false);
                butonsListAcertadas.add(imageButton3);
                butonsListAcertadas.add(imageButton12);
            }
            if((butonsList.get(0).getTag().toString().equals(imageButton4.getTag().toString()) && butonsList.get(1).getTag().toString().equals(imageButton8.getTag().toString()))||(butonsList.get(0).getTag().toString().equals(imageButton8.getTag().toString())  && butonsList.get(1).getTag().toString().equals(imageButton4.getTag().toString()) )){
                imageButton1.setEnabled(true);
                imageButton2.setEnabled(true);
                imageButton3.setEnabled(true);
                imageButton4.setEnabled(false);
                imageButton5.setEnabled(true);
                imageButton6.setEnabled(true);
                imageButton7.setEnabled(true);
                imageButton8.setEnabled(false);
                imageButton9.setEnabled(true);
                imageButton10.setEnabled(true);
                imageButton11.setEnabled(true);
                imageButton12.setEnabled(true);
                butonsListAcertadas.add(imageButton4);
                butonsListAcertadas.add(imageButton8);
            }
            if((butonsList.get(0).getTag().toString().equals(imageButton5.getTag().toString()) && butonsList.get(1).getTag().toString().equals(imageButton11.getTag().toString()))||(butonsList.get(0).getTag().toString().equals(imageButton11.getTag().toString())  && butonsList.get(1).getTag().toString().equals(imageButton5.getTag().toString()) )){
                imageButton1.setEnabled(true);
                imageButton2.setEnabled(true);
                imageButton3.setEnabled(true);
                imageButton4.setEnabled(true);
                imageButton5.setEnabled(false);
                imageButton6.setEnabled(true);
                imageButton7.setEnabled(true);
                imageButton8.setEnabled(true);
                imageButton9.setEnabled(true);
                imageButton10.setEnabled(true);
                imageButton11.setEnabled(false);
                imageButton12.setEnabled(true);
                butonsListAcertadas.add(imageButton5);
                butonsListAcertadas.add(imageButton11);
            }
            if((butonsList.get(0).getTag().toString().equals(imageButton6.getTag().toString()) && butonsList.get(1).getTag().toString().equals(imageButton7.getTag().toString()))||(butonsList.get(0).getTag().toString().equals(imageButton7.getTag().toString())  && butonsList.get(1).getTag().toString().equals(imageButton6.getTag().toString()) )){
                imageButton1.setEnabled(true);
                imageButton2.setEnabled(true);
                imageButton3.setEnabled(true);
                imageButton4.setEnabled(true);
                imageButton5.setEnabled(true);
                imageButton6.setEnabled(false);
                imageButton7.setEnabled(false);
                imageButton8.setEnabled(true);
                imageButton9.setEnabled(true);
                imageButton10.setEnabled(true);
                imageButton11.setEnabled(true);
                imageButton12.setEnabled(true);
                butonsListAcertadas.add(imageButton6);
                butonsListAcertadas.add(imageButton7);
            }
            acertadas+=1;
            butonsList.clear();
            if(acertadas==6){
                crono.stop();
                AlertDialog.Builder alert = new AlertDialog.Builder(getContext());
                alert.setTitle(R.string.txtGanado);
                int segundos = 0;
                String chronoText = crono.getText().toString();
                String array[] = chronoText.split(":");
                if (array.length == 2) {
                    segundos = Integer.parseInt(array[0]) * 60 * 1000
                            + Integer.parseInt(array[1]) * 1000;

                    segundos = segundos /1000;
                } else if (array.length == 3) {
                    segundos = Integer.parseInt(array[0]) * 60 * 60 * 1000
                            + Integer.parseInt(array[1]) * 60 * 1000
                            + Integer.parseInt(array[2]) * 1000;

                    segundos = segundos /1000;
                }
                int puntuacion = 5000 - segundos;
                alert.setMessage(getResources().getString(R.string.txtTiemp)+" "+crono.getContentDescription().toString()+"\n"+getResources().getString(R.string.txtPuntuacion)+" "+Integer.toString(puntuacion));
                punt = new Puntuaciones(nombreUsuario.getText().toString(),puntuacion);
                volleyPost(punt);
                alert.setPositiveButton(R.string.txtVuolverMenu,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int which) {
                                Intent in =new Intent(getContext(), StartActivity.class);
                                startActivity(in);
                            }
                        });
                alert.show();
            };
        }else {
            if(butonsListAcertadas.size()>0){
                for(int i=0;i<butonsListAcertadas.size();i++){
                    if(butonsList.get(0).getTag().toString().equals(imageButton1.getTag().toString())&(butonsListAcertadas.get(i).getTag().toString().equals(imageButton1.getTag().toString()))){
                        if(butonsList.get(1).getTag().toString().equals(imageButton2.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton2.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton3.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton3.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton4.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton4.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton5.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton5.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton6.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton6.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton7.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton7.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton8.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton8.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton9.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton9.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton10.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton10.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton11.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton11.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton12.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton12.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(false);
                        }
                    }

                    if(butonsList.get(0).getTag().toString().equals(imageButton2.getTag().toString())&(butonsListAcertadas.get(i).getTag().toString().equals(imageButton2.getTag().toString()))){
                        if(butonsList.get(1).getTag().toString().equals(imageButton1.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton1.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton3.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton3.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton4.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton4.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton5.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton5.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton6.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton6.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton7.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton7.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton8.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton8.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton9.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton9.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton10.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton10.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton11.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton11.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(true);
                        }
                    }

                    if(butonsList.get(0).getTag().toString().equals(imageButton3.getTag().toString())&(butonsListAcertadas.get(i).getTag().toString().equals(imageButton3.getTag().toString()))){
                        if(butonsList.get(1).getTag().toString().equals(imageButton1.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton1.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton2.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton2.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton4.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton4.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton5.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton5.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton6.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton6.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton7.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton7.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton8.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton8.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton9.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton9.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton10.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton10.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton11.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton11.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton12.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton12.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(false);
                        }
                    }

                    if(butonsList.get(0).getTag().toString().equals(imageButton4.getTag().toString())&(butonsListAcertadas.get(i).getTag().toString().equals(imageButton4.getTag().toString()))){
                        if(butonsList.get(1).getTag().toString().equals(imageButton1.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton1.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton2.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton2.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton3.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton3.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton5.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton5.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton6.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton6.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton7.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton7.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton8.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton8.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton9.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton9.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton10.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton10.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);;
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton11.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton11.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton12.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton12.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(false);
                        }
                    }

                    if(butonsList.get(0).getTag().toString().equals(imageButton5.getTag().toString())&(butonsListAcertadas.get(i).getTag().toString().equals(imageButton5.getTag().toString()))){
                        if(butonsList.get(1).getTag().toString().equals(imageButton1.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton1.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton2.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton2.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton3.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton3.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton4.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton4.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton6.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton6.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton7.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton7.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton8.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton8.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton9.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton9.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton10.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton10.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton11.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton11.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton12.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton12.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(false);
                        }
                    }

                    if(butonsList.get(0).getTag().toString().equals(imageButton6.getTag().toString())&(butonsListAcertadas.get(i).getTag().toString().equals(imageButton6.getTag().toString()))){
                        if(butonsList.get(1).getTag().toString().equals(imageButton1.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton1.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton2.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton2.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton3.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton3.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton4.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton4.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton5.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton5.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton7.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton7.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton8.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton8.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton9.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton9.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton10.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton10.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton11.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton11.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton12.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton12.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(false);
                        }
                    }
                    if(butonsList.get(0).getTag().toString().equals(imageButton7.getTag().toString())&(butonsListAcertadas.get(i).getTag().toString().equals(imageButton7.getTag().toString()))){
                        if(butonsList.get(1).getTag().toString().equals(imageButton1.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton1.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton2.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton2.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton3.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton3.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton4.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton4.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton5.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton5.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton6.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton6.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton8.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton8.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton9.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton9.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton10.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton10.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton11.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton11.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton12.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton12.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(false);
                        }
                    }
                    if(butonsList.get(0).getTag().toString().equals(imageButton8.getTag().toString())&(butonsListAcertadas.get(i).getTag().toString().equals(imageButton8.getTag().toString()))){
                        if(butonsList.get(1).getTag().toString().equals(imageButton1.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton1.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton2.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton2.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton3.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton3.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton4.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton4.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton5.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton5.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton6.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton6.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton7.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton7.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton9.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton9.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton10.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton10.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton11.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton11.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton12.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton12.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(false);
                        }
                    }
                    if(butonsList.get(0).getTag().toString().equals(imageButton9.getTag().toString())&(butonsListAcertadas.get(i).getTag().toString().equals(imageButton9.getTag().toString()))){
                        if(butonsList.get(1).getTag().toString().equals(imageButton1.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton1.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton2.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton2.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton3.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton3.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton4.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton4.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton5.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton5.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton6.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton6.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton7.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton7.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton8.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton8.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton10.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton10.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton11.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton11.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton12.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton12.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(false);
                        }
                    }
                    if(butonsList.get(0).getTag().toString().equals(imageButton10.getTag().toString())&(butonsListAcertadas.get(i).getTag().toString().equals(imageButton10.getTag().toString()))){
                        if(butonsList.get(1).getTag().toString().equals(imageButton1.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton1.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton2.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton2.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton3.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton3.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton4.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton4.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton5.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton5.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton6.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton6.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton7.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton7.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton8.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton8.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton9.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton9.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton11.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton11.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton12.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton12.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(false);
                        }
                    }
                    if(butonsList.get(0).getTag().toString().equals(imageButton11.getTag().toString())&(butonsListAcertadas.get(i).getTag().toString().equals(imageButton11.getTag().toString()))){
                        if(butonsList.get(1).getTag().toString().equals(imageButton1.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton1.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton2.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton2.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton3.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton3.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton4.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton4.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton5.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton5.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton6.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton6.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton7.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton7.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton8.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton8.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton9.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton9.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton10.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton10.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton12.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton12.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(false);
                        }
                    }
                    if(butonsList.get(0).getTag().toString().equals(imageButton12.getTag().toString())&(butonsListAcertadas.get(i).getTag().toString().equals(imageButton12.getTag().toString()))){
                        if(butonsList.get(1).getTag().toString().equals(imageButton1.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton1.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(false);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton2.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton2.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(false);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton3.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton3.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(false);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton4.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton4.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(false);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton5.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton5.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(false);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton6.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton6.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(false);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton7.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton7.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(false);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(false);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton8.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton8.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(false);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(false);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton9.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton9.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(false);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(false);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton10.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton10.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(false);
                            imageButton11.setEnabled(true);
                            imageButton12.setEnabled(false);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton11.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton11.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                            imageButton7.setEnabled(true);
                            imageButton8.setEnabled(true);
                            imageButton9.setEnabled(true);
                            imageButton10.setEnabled(true);
                            imageButton11.setEnabled(false);
                            imageButton12.setEnabled(false);
                        }
                    }

                    butonsList.get(0).setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                    butonsList.get(1).setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                    imageButton1.setEnabled(true);
                    imageButton5.setEnabled(true);
                    imageButton2.setEnabled(true);
                    imageButton3.setEnabled(true);
                    imageButton4.setEnabled(true);
                    imageButton6.setEnabled(true);
                    imageButton7.setEnabled(true);
                    imageButton8.setEnabled(true);
                    imageButton9.setEnabled(true);
                    imageButton10.setEnabled(true);
                    imageButton11.setEnabled(true);
                    imageButton12.setEnabled(true);
                    for(int x=0;x<butonsListAcertadas.size();x++){
                        if(imageButton1==butonsListAcertadas.get(x)){
                            imageButton1.setEnabled(false);
                        }
                        if(imageButton2==butonsListAcertadas.get(x)){
                            imageButton2.setEnabled(false);
                        }
                        if(imageButton3==butonsListAcertadas.get(x)){
                            imageButton3.setEnabled(false);
                        }
                        if(imageButton4==butonsListAcertadas.get(x)){
                            imageButton4.setEnabled(false);
                        }
                        if(imageButton5==butonsListAcertadas.get(x)){
                            imageButton5.setEnabled(false);
                        }
                        if(imageButton6==butonsListAcertadas.get(x)){
                            imageButton6.setEnabled(false);
                        }
                        if(imageButton7==butonsListAcertadas.get(x)){
                            imageButton7.setEnabled(false);
                        }
                        if(imageButton8==butonsListAcertadas.get(x)){
                            imageButton8.setEnabled(false);
                        }
                        if(imageButton8==butonsListAcertadas.get(x)){
                            imageButton8.setEnabled(false);
                        }
                        if(imageButton10==butonsListAcertadas.get(x)){
                            imageButton10.setEnabled(false);
                        }
                        if(imageButton11==butonsListAcertadas.get(x)){
                            imageButton11.setEnabled(false);
                        }
                        if(imageButton12==butonsListAcertadas.get(x)){
                            imageButton12.setEnabled(false);
                        }
                    }
                }
                butonsList.clear();
            }else{
                butonsList.get(0).setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                butonsList.get(1).setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                butonsList.clear();
                imageButton1.setEnabled(true);
                imageButton5.setEnabled(true);
                imageButton2.setEnabled(true);
                imageButton3.setEnabled(true);
                imageButton4.setEnabled(true);
                imageButton6.setEnabled(true);
                imageButton7.setEnabled(true);
                imageButton8.setEnabled(true);
                imageButton9.setEnabled(true);
                imageButton10.setEnabled(true);
                imageButton11.setEnabled(true);
                imageButton12.setEnabled(true);
            }

        }
    }

    public void renderData(String text){
        nombreUsuario.setText(text);
    }

    public void volleyPost(Puntuaciones puntos){
        //String postUrl = "http://192.168.43.204:8080/players";
        //String postUrl = "http://172.30.35.222:8080/players";
        //String postUrl = "http://192.168.2.137:8080/players";
        String postUrl = "https://memory-game-gorka.herokuapp.com/players";
        RequestQueue requestQueue = Volley.newRequestQueue(getContext());

        JSONObject postData = new JSONObject();
        try {
            postData.put("username", puntos.getNombreUsuario());
            postData.put("score", puntos.getPuntuacion());

        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, postUrl, postData, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });

        requestQueue.add(jsonObjectRequest);

    }
}