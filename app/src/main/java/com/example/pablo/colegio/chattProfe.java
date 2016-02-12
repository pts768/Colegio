package com.example.pablo.colegio;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class chattProfe extends AppCompatActivity {

    ListView listachattprofesor;
    lineaAdapterChattProfesor adaptadorchattprofesor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatt_profe);
        setTitle("Chatt Profesor");
        listachattprofesor = (ListView)findViewById(R.id.lstchattprofe);
        adaptadorchattprofesor = new lineaAdapterChattProfesor(this);
        listachattprofesor.setAdapter(adaptadorchattprofesor);
        listachattprofesor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                creardialogo((Mensaje) adaptadorchattprofesor.getItem(position));
            }
        });
    }
    private void creardialogo(Mensaje mensaje){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(mensaje.getMensaje());
        builder.setTitle(mensaje.getTitulo());
        Dialog dialog = builder.create();
        dialog.show();
    }
}
