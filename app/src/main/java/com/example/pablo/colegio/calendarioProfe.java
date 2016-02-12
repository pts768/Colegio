package com.example.pablo.colegio;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class calendarioProfe extends AppCompatActivity {

    ListView listacalendarioprofesor;
    lineaAdapterCalendarioProfesor adaptadorcalendarioprofesor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario_profe);
        setTitle("Calendario Profesor");
        listacalendarioprofesor = (ListView)findViewById(R.id.lstcalendarioprofe);
        adaptadorcalendarioprofesor = new lineaAdapterCalendarioProfesor(this);
        listacalendarioprofesor.setAdapter(adaptadorcalendarioprofesor);
        listacalendarioprofesor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                creardialogo((Tutoria) adaptadorcalendarioprofesor.getItem(position));
            }
        });
    }
    private void creardialogo(Tutoria tutoria){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(tutoria.getHora());
        builder.setTitle(tutoria.getDia());
        Dialog dialog = builder.create();
        dialog.show();
    }
}
