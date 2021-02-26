package com.gorka_hernandez.memorygame;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.gorka_hernandez.memorygame.fragments.GameFragment3x2;
import com.gorka_hernandez.memorygame.fragments.GameFragment3x4;
import com.gorka_hernandez.memorygame.fragments.GameFragment3x6;
import com.gorka_hernandez.memorygame.fragments.LevelFragment;

public class LevelActivity extends AppCompatActivity implements LevelFragment.DataListener{

    boolean isMultiPanel;
    private String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        setMultiPanel();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public void sendData(String data,String numfilas) {
        if (isMultiPanel){
            FragmentManager fm =getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            if(numfilas.equals("2")){
                Fragment gameFragment3x4 =fm.findFragmentById(R.id.gameFragment3x4);
                Fragment gameFragment3x6 =fm.findFragmentById(R.id.gameFragment3x6);
                ft.hide(gameFragment3x4);
                ft.hide(gameFragment3x6);
                ft.commit();
                GameFragment3x2 gameFragment = (GameFragment3x2) getSupportFragmentManager().findFragmentById(R.id.gameFragment3x2);
                gameFragment.renderData(data);
            }
            if(numfilas.equals("4")){
                Fragment gameFragment3x2 =fm.findFragmentById(R.id.gameFragment3x2);
                Fragment gameFragment3x6 =fm.findFragmentById(R.id.gameFragment3x6);
                ft.hide(gameFragment3x2);
                ft.hide(gameFragment3x6);
                ft.commit();
                GameFragment3x4 gameFragment = (GameFragment3x4) getSupportFragmentManager().findFragmentById(R.id.gameFragment3x4);
                gameFragment.renderData(data);
            }
            if(numfilas.equals("6")){
                Fragment gameFragment3x2 =fm.findFragmentById(R.id.gameFragment3x2);
                Fragment gameFragment3x4 =fm.findFragmentById(R.id.gameFragment3x4);
                ft.hide(gameFragment3x2);
                ft.hide(gameFragment3x4);
                ft.commit();
                GameFragment3x6 gameFragment = (GameFragment3x6) getSupportFragmentManager().findFragmentById(R.id.gameFragment3x6);
                gameFragment.renderData(data);
            }

        }else {
            Intent intent = new Intent(this,GameActivity.class);
            intent.putExtra("text",data);
            intent.putExtra("text2",numfilas);
            startActivity(intent);
        }
    }

    private void setMultiPanel(){
        isMultiPanel = (getSupportFragmentManager().findFragmentById(R.id.gameFragment3x2)!=null);
    }
}
