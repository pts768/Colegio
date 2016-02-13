package com.example.pablo.colegio;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PantallaInicio extends AppCompatActivity {

    private Button btProfesor;
    private Button btPadre;
    private EditText Usuario;
    private EditText Contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_principal);





        btProfesor = (Button) findViewById(R.id.btnprofesor);
        btProfesor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PantallaInicio.this);
                //builder.setMessage(R.string.Registro);
                LayoutInflater inflater = getLayoutInflater();
                View alertaNuevoContacto = inflater.inflate(R.layout.login, null);
                Usuario = (EditText) alertaNuevoContacto.findViewById(R.id.emlEmail); //EditText de activity_agenda
                Contraseña = (EditText) alertaNuevoContacto.findViewById(R.id.emlContraseña); //EditText de activity_agenga
                builder.setTitle(R.string.Usuario);
                builder.setPositiveButton(R.string.Aceptar, accionAceptar);
                builder.setNegativeButton(R.string.Cancelar, accionCancelar);
                builder.setView(alertaNuevoContacto);
                Dialog dialog = builder.create();
                dialog.show();
            }
        });
        btPadre = (Button) findViewById(R.id.btnpadre);
        btPadre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View alertaNuevoContacto = inflater.inflate(R.layout.login, null);
                Usuario = (EditText) alertaNuevoContacto.findViewById(R.id.emlEmail); //EditText de activity_agenda
                Contraseña = (EditText) alertaNuevoContacto.findViewById(R.id.emlContraseña); //EditText de activity_agenga
                AlertDialog.Builder builder = new AlertDialog.Builder(PantallaInicio.this);
                builder.setMessage(R.string.Registro);
                builder.setTitle(R.string.Usuario);
                builder.setPositiveButton(R.string.Aceptar, accionAceptar1);
                builder.setNegativeButton(R.string.Cancelar, accionCancelar);
                builder.setView(alertaNuevoContacto);
                Dialog dialog = builder.create();
                dialog.show();
            }
        });
    }

    private DialogInterface.OnClickListener accionAceptar = new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog, int id) {
            dialog.dismiss(); //Oculta el dialog
            if (!Usuario.getText().toString().equals("") && !Contraseña.getText().toString().equals("")) {
                Intent i = new Intent(PantallaInicio.this, PadreMain.class);
                startActivity(i);
            } else {
                Toast.makeText(PantallaInicio.this, R.string.Usuariovacio, Toast.LENGTH_SHORT).show();
            }
    }};

    private DialogInterface.OnClickListener accionAceptar1 = new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog, int id) {
            dialog.dismiss(); //Oculta el dialog
            if (!Usuario.getText().toString().equals("") && !Contraseña.getText().toString().equals("")) {
                Intent i = new Intent(PantallaInicio.this, PadreMain.class);
                startActivity(i);
            } else {
                Toast.makeText(PantallaInicio.this, R.string.Usuariovacio, Toast.LENGTH_SHORT).show();
            }
        }
    };

    private DialogInterface.OnClickListener accionCancelar = new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog, int id) {
            dialog.dismiss(); //Oculta el dialog
        }
    };
}

