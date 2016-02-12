package com.example.pablo.colegio;

import java.io.Serializable;

/**
 * Created by pablo on 06/02/2016.
 */
public class Mensaje implements Serializable{

    private int id;
    private String titulo;
    private String mensaje;
    private String Profesor;
    private String Nino;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getProfesor() {
        return Profesor;
    }

    public void setProfesor(String profesor) {
        Profesor = profesor;
    }

    public String getNino() {
        return Nino;
    }

    public void setNino(String nino) {
        Nino = nino;
    }
}