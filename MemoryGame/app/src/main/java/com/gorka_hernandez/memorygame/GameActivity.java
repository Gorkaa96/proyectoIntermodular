package com.gorka_hernandez.memorygame;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.gorka_hernandez.memorygame.fragments.GameFragment3x2;
import com.gorka_hernandez.memorygame.fragments.GameFragment3x4;
import com.gorka_hernandez.memorygame.fragments.GameFragment3x6;

public class GameActivity extends AppCompatActivity {

    private String data;
    private String numfil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Toast.makeText(this,R.string.lblCargaJuego, Toast.LENGTH_LONG).show();

        if (getIntent().getExtras()!=null){
            Bundle bundle = getIntent().getExtras();
            data = bundle.getString("text");
            numfil = bundle.getString("text2");
        }
        FragmentManager fm =getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(numfil.equals("2")){
            Fragment gameFragment3x4 =fm.findFragmentById(R.id.gameFragment3x4);
            Fragment gameFragment3x6 =fm.findFragmentById(R.id.gameFragment3x6);
            ft.hide(gameFragment3x4);
            ft.hide(gameFragment3x6);
            ft.commit();
            GameFragment3x2 gameFragment3x2 = (GameFragment3x2) getSupportFragmentManager().findFragmentById(R.id.gameFragment3x2);
            gameFragment3x2.renderData(data);
        }
        if(numfil.equals("4")){
            Fragment gameFragment3x2 =fm.findFragmentById(R.id.gameFragment3x2);
            Fragment gameFragment3x6 =fm.findFragmentById(R.id.gameFragment3x6);
            ft.hide(gameFragment3x2);
            ft.hide(gameFragment3x6);
            ft.commit();
            GameFragment3x4 gameFragment3x4 = (GameFragment3x4) getSupportFragmentManager().findFragmentById(R.id.gameFragment3x4);
            gameFragment3x4.renderData(data);
        }
        if(numfil.equals("6")){
            Fragment gameFragment3x2 =fm.findFragmentById(R.id.gameFragment3x2);
            Fragment gameFragment3x4 =fm.findFragmentById(R.id.gameFragment3x4);
            ft.hide(gameFragment3x2);
            ft.hide(gameFragment3x4);
            ft.commit();
            GameFragment3x6 gameFragment3x6 = (GameFragment3x6) getSupportFragmentManager().findFragmentById(R.id.gameFragment3x6);
            gameFragment3x6.renderData(data);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: //hago un case por si en un futuro agrego mas opciones
                Log.i("ActionBar", "Atrás!");
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
