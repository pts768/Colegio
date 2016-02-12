package com.example.pablo.colegio;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class infoProfe extends AppCompatActivity {

    ListView listainfoprofesor;
    lineaAdapterInfoProfesor adaptadorinfoprofesor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_profe);
        setTitle("Información Profesor");
        listainfoprofesor = (ListView)findViewById(R.id.lstinfoprofe);
        adaptadorinfoprofesor = new lineaAdapterInfoProfesor(this);
        listainfoprofesor.setAdapter(adaptadorinfoprofesor);
        listainfoprofesor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                creardialogo((Mensaje)adaptadorinfoprofesor.getItem(position));
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
