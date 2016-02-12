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
public class lineaAdapterInfoProfesor extends BaseAdapter {


    private List<Mensaje> mensajes;

    private Context context;

    private BDHelper helper;
    public lineaAdapterInfoProfesor(Context context) {
        this.mensajes = new ArrayList<>();
        this.context = context;
        Mensaje mensaje1 = new Mensaje();
        Mensaje mensaje2 = new Mensaje();
        Mensaje mensaje3 = new Mensaje();
        Mensaje mensaje4 = new Mensaje();
        mensaje1.setTitulo("Bienvenidos");
        mensaje2.setTitulo("Tutoria");
        mensaje3.setTitulo("Excursión");
        mensaje4.setTitulo("AMPA");
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
    public int getCount() {return mensajes.size();
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
            convertView = View.inflate(context, R.layout.linea_profesor_info, null);
        }
        TextView txtasuntoprofesor = (TextView) convertView.findViewById(R.id.txtasuntoprofesor);
        Mensaje t = (Mensaje) getItem(position);
        txtasuntoprofesor.setText(t.getTitulo());

        return convertView;

    }

}
