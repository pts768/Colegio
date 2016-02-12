package com.example.pablo.colegio;

import java.io.Serializable;

/**
 * Created by pablo on 06/02/2016.
 */
public class Calendario implements Serializable{

    private int id;
    private String fecha;
    private String hora;
    private String Padre;
    private String Profesor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPadre() {
        return Padre;
    }

    public void setPadre(String padre) {
        Padre = padre;
    }

    public String getProfesor() {
        return Profesor;
    }

    public void setProfesor(String profesor) {
        Profesor = profesor;
    }
}