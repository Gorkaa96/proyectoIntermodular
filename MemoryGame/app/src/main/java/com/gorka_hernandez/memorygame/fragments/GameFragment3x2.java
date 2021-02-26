package com.gorka_hernandez.memorygame.fragments;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
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
import com.gorka_hernandez.memorygame.RecyclerDataAdapter;
import com.gorka_hernandez.memorygame.StartActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import io.realm.Realm;

public class GameFragment3x2 extends Fragment {

    Puntuaciones punt;
    TextView nombreUsuario;
    TextView lblnombreUsuario;
    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;
    ImageButton imageButton6;
    Chronometer crono;
    Realm realm;
    ArrayList<ImageButton> butonsList = new ArrayList<ImageButton>();
    ArrayList<ImageButton> butonsListAcertadas = new ArrayList<ImageButton>();
    int clicadas=0;
    int acertadas=0;

    public GameFragment3x2() {
        // Required empty public constructor
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_game3x2, container, false);

        lblnombreUsuario = view.findViewById(R.id.lblnombre);
        nombreUsuario = view.findViewById(R.id.nombreusuario);
        imageButton1 = view.findViewById(R.id.imageButton);
        imageButton2 = view.findViewById(R.id.imageButton2);
        imageButton3 = view.findViewById(R.id.imageButton3);
        imageButton4 = view.findViewById(R.id.imageButton4);
        imageButton5 = view.findViewById(R.id.imageButton5);
        imageButton6 = view.findViewById(R.id.imageButton6);

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
                    imageButton1.setBackgroundResource(R.drawable.icons8_duck_96);
                    butonsList.add(imageButton1);
                    clicadas += 1;
                }else if(butonsList.get(0)==imageButton1){
                    imageButton1.setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                    clicadas =0;
                    butonsList.clear();
                }else{
                    imageButton1.setBackgroundResource(R.drawable.icons8_duck_96);
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
                    imageButton2.setBackgroundResource(R.drawable.icons8_european_dragon_96);
                    butonsList.add(imageButton2);
                    clicadas += 1;
                }else if(butonsList.get(0)==imageButton2){
                    imageButton2.setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                    clicadas =0;
                    butonsList.clear();
                }else{
                    imageButton2.setBackgroundResource(R.drawable.icons8_european_dragon_96);
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
                    imageButton3.setBackgroundResource(R.drawable.icons8_pig_96);
                    butonsList.add(imageButton3);
                    clicadas += 1;
                }else if(butonsList.get(0)==imageButton3){
                    imageButton3.setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                    clicadas =0;
                    butonsList.clear();
                }else{
                    imageButton3.setBackgroundResource(R.drawable.icons8_pig_96);
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
                    imageButton4.setBackgroundResource(R.drawable.icons8_pig_96);
                    butonsList.add(imageButton4);
                    clicadas += 1;
                }else if(butonsList.get(0)==imageButton4){
                    imageButton4.setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                    clicadas =0;
                    butonsList.clear();
                }else{
                    imageButton4.setBackgroundResource(R.drawable.icons8_pig_96);
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
                    imageButton5.setBackgroundResource(R.drawable.icons8_duck_96);
                    butonsList.add(imageButton5);
                    clicadas += 1;
                }else if(butonsList.get(0)==imageButton5){
                    imageButton5.setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                    clicadas =0;
                    butonsList.clear();
                }else{
                    imageButton5.setBackgroundResource(R.drawable.icons8_duck_96);
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
                    imageButton6.setBackgroundResource(R.drawable.icons8_european_dragon_96);
                    butonsList.add(imageButton6);
                    clicadas += 1;
                }else if(butonsList.get(0)==imageButton6){
                    imageButton6.setBackgroundResource(R.drawable.depositphotos_53310845_stock_illustration_question_mark_sign_icon_help);
                    clicadas =0;
                    butonsList.clear();
                }else{
                    imageButton6.setBackgroundResource(R.drawable.icons8_european_dragon_96);
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
                if((butonsList.get(0).getTag().toString().equals(imageButton1.getTag().toString()) && butonsList.get(1).getTag().toString().equals(imageButton5.getTag().toString()))||(butonsList.get(0).getTag().toString().equals(imageButton5.getTag().toString())  && butonsList.get(1).getTag().toString().equals(imageButton1.getTag().toString()) )){
                    imageButton1.setEnabled(false);
                    imageButton5.setEnabled(false);
                    imageButton2.setEnabled(true);
                    imageButton3.setEnabled(true);
                    imageButton4.setEnabled(true);
                    imageButton6.setEnabled(true);
                    butonsListAcertadas.add(imageButton1);
                    butonsListAcertadas.add(imageButton5);
                }
            if((butonsList.get(0).getTag().toString().equals(imageButton2.getTag().toString()) && butonsList.get(1).getTag().toString().equals(imageButton6.getTag().toString()))||(butonsList.get(0).getTag().toString().equals(imageButton6.getTag().toString())  && butonsList.get(1).getTag().toString().equals(imageButton2.getTag().toString()) )){
                imageButton1.setEnabled(true);
                imageButton5.setEnabled(true);
                imageButton2.setEnabled(false);
                imageButton3.setEnabled(true);
                imageButton4.setEnabled(true);
                imageButton6.setEnabled(false);
                butonsListAcertadas.add(imageButton2);
                butonsListAcertadas.add(imageButton6);
            }
            if((butonsList.get(0).getTag().toString().equals(imageButton3.getTag().toString()) && butonsList.get(1).getTag().toString().equals(imageButton4.getTag().toString()))||(butonsList.get(0).getTag().toString().equals(imageButton4.getTag().toString())  && butonsList.get(1).getTag().toString().equals(imageButton3.getTag().toString()) )){
                imageButton1.setEnabled(true);
                imageButton5.setEnabled(true);
                imageButton2.setEnabled(true);
                imageButton3.setEnabled(false);
                imageButton4.setEnabled(false);
                imageButton6.setEnabled(true);
                butonsListAcertadas.add(imageButton3);
                butonsListAcertadas.add(imageButton4);
            }
            acertadas+=1;
            butonsList.clear();
            if(acertadas==3){
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
                int puntuacion = 3000 - segundos;
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
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton3.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton3.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton4.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton4.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton5.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton5.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton6.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton6.getTag().toString()))){
                            imageButton1.setEnabled(false);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
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
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton3.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton3.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton4.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton4.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton5.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton5.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton6.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton6.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
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
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton2.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton2.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton4.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton4.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton5.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton5.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton6.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton6.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
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
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton2.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton2.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton3.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton3.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton5.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton5.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton6.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton6.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
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
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton2.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton2.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton3.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton3.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton4.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton4.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(true);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton6.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton6.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(false);
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
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton2.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton2.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(false);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton3.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton3.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(false);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton4.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton4.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(false);
                            imageButton5.setEnabled(true);
                            imageButton6.setEnabled(false);
                        }
                        if(butonsList.get(1).getTag().toString().equals(imageButton5.getTag().toString())&(butonsListAcertadas.get(i+1).getTag().toString().equals(imageButton5.getTag().toString()))){
                            imageButton1.setEnabled(true);
                            imageButton2.setEnabled(true);
                            imageButton3.setEnabled(true);
                            imageButton4.setEnabled(true);
                            imageButton5.setEnabled(false);
                            imageButton6.setEnabled(false);
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