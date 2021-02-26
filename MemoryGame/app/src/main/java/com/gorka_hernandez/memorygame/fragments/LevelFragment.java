package com.gorka_hernandez.memorygame.fragments;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.gorka_hernandez.memorygame.LevelActivity;
import com.gorka_hernandez.memorygame.MainActivity;
import com.gorka_hernandez.memorygame.R;

public class LevelFragment extends Fragment {

    TextView title;
    Button btnFacil;
    Button btnMedio;
    Button btnDificil;
    private DataListener callback;

    public LevelFragment() {
        // Required empty public constructor
    }

    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        try {
            callback = (DataListener) context;
        }catch (Exception e){
            throw new ClassCastException(context.toString() + "should implement DataListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_level, container, false);

        title = (TextView) view.findViewById(R.id.startTitle);
        btnFacil = (Button) view.findViewById(R.id.btnFacil);
        btnMedio = (Button) view.findViewById(R.id.btnMedio);
        btnDificil = (Button) view.findViewById(R.id.btnDificil);


        btnFacil.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());

                //AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();

                // Setting Dialog Title
                alertDialog.setTitle(R.string.lblNombreUsuario);

                // Setting Dialog Message
                alertDialog.setMessage(R.string.lblIntroduceNombre);
                final EditText input = new EditText(getContext());


                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_WORDS);

                alertDialog.setView(input);

                // Setting Positive "Yes" Button
                alertDialog.setPositiveButton(R.string.btnJugar,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int which) {
                                // Write your code here to execute after dialog
                                if(input.length()==0||input.getText().toString().trim().length()==0){
                                    Toast.makeText(getContext(),R.string.lblErrorIntroduceNombre, Toast.LENGTH_SHORT).show();
                                }else{
                                    callback.sendData(input.getText().toString(),"2");
                                }
                            }
                        });
                // Setting Negative "NO" Button
                alertDialog.setNegativeButton(R.string.btnCancelar,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // Write your code here to execute after dialog
                                dialog.cancel();
                            }
                        });

                // closed

                // Showing Alert Message
                alertDialog.show();

            }
        });

        btnMedio.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());

                //AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();

                // Setting Dialog Title
                alertDialog.setTitle(R.string.lblNombreUsuario);

                // Setting Dialog Message
                alertDialog.setMessage(R.string.lblIntroduceNombre);
                final EditText input = new EditText(getContext());


                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_WORDS);

                alertDialog.setView(input);

                // Setting Positive "Yes" Button
                alertDialog.setPositiveButton(R.string.btnJugar,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int which) {
                                // Write your code here to execute after dialog
                                if(input.length()==0||input.getText().toString().trim().length()==0){
                                    Toast.makeText(getContext(),R.string.lblErrorIntroduceNombre, Toast.LENGTH_SHORT).show();
                                }else{
                                    callback.sendData(input.getText().toString(),"4");
                                }
                            }
                        });
                // Setting Negative "NO" Button
                alertDialog.setNegativeButton(R.string.btnCancelar,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // Write your code here to execute after dialog
                                dialog.cancel();
                            }
                        });

                // closed

                // Showing Alert Message
                alertDialog.show();

            }
        });

        btnDificil.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());

                //AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();

                // Setting Dialog Title
                alertDialog.setTitle(R.string.lblNombreUsuario);

                // Setting Dialog Message
                alertDialog.setMessage(R.string.lblIntroduceNombre);
                final EditText input = new EditText(getContext());


                input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_WORDS);

                alertDialog.setView(input);

                // Setting Positive "Yes" Button
                alertDialog.setPositiveButton(R.string.btnJugar,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int which) {
                                // Write your code here to execute after dialog
                                if(input.length()==0||input.getText().toString().trim().length()==0){
                                    Toast.makeText(getContext(),R.string.lblErrorIntroduceNombre, Toast.LENGTH_SHORT).show();
                                }else{
                                    callback.sendData(input.getText().toString(),"6");
                                }
                            }
                        });
                // Setting Negative "NO" Button
                alertDialog.setNegativeButton(R.string.btnCancelar,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // Write your code here to execute after dialog
                                dialog.cancel();
                            }
                        });

                // closed

                // Showing Alert Message
                alertDialog.show();

            }
        });


        // Inflate the layout for this fragment
        return view;
    }


    public interface DataListener {
        public void sendData(String data,String numFilas);
    }
}
