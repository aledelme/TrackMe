package com.example.ikerlopez.trackme;

public class EndedRoute {
    private String uid;
    private String nombre;

    public EndedRoute (String uid, String nombre){
        this.uid = uid;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUid() {
        return uid;
    }
}
