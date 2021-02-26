package com.gorka_hernandez.memorygame;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Puntuaciones extends RealmObject{

    private String nombreUsuario;
    private int puntuacion;

    public Puntuaciones(){

    }

    public Puntuaciones(String nombre,int puntos){
        this.nombreUsuario=nombre;
        this.puntuacion=puntos;

    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setNombreUsuario(String nombre) {
        this.nombreUsuario = nombre;
    }

    public void setPuntuacion(int puntos) {
        this.puntuacion = puntos;
    }
}
