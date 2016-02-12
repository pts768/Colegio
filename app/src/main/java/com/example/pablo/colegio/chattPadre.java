package com.example.pablo.colegio;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class chattPadre extends AppCompatActivity {

    ListView listachattpadre;
    lineaAdapterInfoPadre adaptadorchattpadre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatt_padre);
        setTitle("Chatt Padre");
        listachattpadre = (ListView)findViewById(R.id.lstchattpadre);
        adaptadorchattpadre = new lineaAdapterInfoPadre(this);
        listachattpadre.setAdapter(adaptadorchattpadre);
        listachattpadre.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                creardialogo((Mensaje) adaptadorchattpadre.getItem(position));
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

