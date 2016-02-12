package com.example.pablo.colegio;

import java.io.Serializable;

/**
 * Created by pablo on 06/02/2016.
 */
public class Nino implements Serializable{

    private int id;
    private String email;
    private String nombre;
    private String Profesor;
    private String Padre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return Profesor;
    }

    public void setProfesor(String profesor) {
        Profesor = profesor;
    }

    public String getPadre() {
        return Padre;
    }

    public void setPadre(String padre) {
        Padre = padre;
    }
}