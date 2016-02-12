package com.example.pablo.colegio;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class infoPadre extends AppCompatActivity {

    ListView listainfopadre;
    lineaAdapterInfoPadre adaptadorinfopadre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_padre);
        setTitle("Información Padre");
        listainfopadre = (ListView)findViewById(R.id.lstinfopadre);
        adaptadorinfopadre = new lineaAdapterInfoPadre(this);
        listainfopadre.setAdapter(adaptadorinfopadre);
        listainfopadre.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                creardialogo((Mensaje)adaptadorinfopadre.getItem(position));
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
