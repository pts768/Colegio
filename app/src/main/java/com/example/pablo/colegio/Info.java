package com.example.pablo.colegio;

import java.io.Serializable;

/**
 * Created by pablo on 06/02/2016.
 */
public class Info implements Serializable {

    private String asunto;

    public String getAsunto() {return asunto;}

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }


}