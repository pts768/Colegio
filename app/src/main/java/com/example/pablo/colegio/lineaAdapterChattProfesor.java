package com.example.pablo.colegio;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.pablo.colegio.bd.BDHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pablo on 05/02/2016.
 */
public class lineaAdapterChattProfesor extends BaseAdapter {


    private List<Mensaje> mensajes;

    private Context context;

    private BDHelper helper;
    public lineaAdapterChattProfesor(Context context) {
        this.mensajes = new ArrayList<>();
        this.context = context;
        Mensaje mensaje1 = new Mensaje();
        Mensaje mensaje2 = new Mensaje();
        Mensaje mensaje3 = new Mensaje();
        Mensaje mensaje4 = new Mensaje();
        mensaje1.setTitulo("Problemas");
        mensaje2.setTitulo("Asistencia");
        mensaje3.setTitulo("Peleas");
        mensaje4.setTitulo("Deberes");
        mensaje1.setMensaje("hola");
        mensaje2.setMensaje("hola");
        mensaje3.setMensaje("hola");
        mensaje4.setMensaje("hola");

        mensajes.add(mensaje1);
        mensajes.add(mensaje2);
        mensajes.add(mensaje3);
        mensajes.add(mensaje4);
    }

    @Override
    public int getCount() {
        return mensajes.size();
    }

    @Override
    public Object getItem(int position) {
        return mensajes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.linea_profesor_chatt, null);
        }
        TextView txttituloprofesor = (TextView) convertView.findViewById(R.id.txttituloprofesor);
        Mensaje t = (Mensaje) getItem(position);
        txttituloprofesor.setText(t.getTitulo());

        return convertView;

    }

}
