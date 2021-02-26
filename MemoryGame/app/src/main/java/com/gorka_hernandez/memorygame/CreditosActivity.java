package com.gorka_hernandez.memorygame;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class CreditosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

}
