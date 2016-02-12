package com.example.pablo.colegio;

import java.io.Serializable;

/**
 * Created by pablo on 05/02/2016.
 */
public class Tutoria implements Serializable {

    private String dia;
    private String hora;

    public String getDia() {return dia;}

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }



}
