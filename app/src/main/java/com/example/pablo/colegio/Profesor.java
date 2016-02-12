package com.example.pablo.colegio;

import java.io.Serializable;

/**
 * Created by pablo on 06/02/2016.
 */
public class Profesor implements Serializable{

    private String email;
    private String nombre;
    private String apellidos;

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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
