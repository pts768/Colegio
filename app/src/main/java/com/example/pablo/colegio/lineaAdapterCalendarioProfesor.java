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
public class lineaAdapterCalendarioProfesor extends BaseAdapter {


    private List<Tutoria> tutorias;

    private Context context;

    private BDHelper helper;
    public lineaAdapterCalendarioProfesor(Context context) {
        this.tutorias = new ArrayList<>();
        this.context = context;
        Tutoria tutoria1 = new Tutoria();
        Tutoria tutoria2 = new Tutoria();
        Tutoria tutoria3 = new Tutoria();
        Tutoria tutoria4 = new Tutoria();
        tutoria1.setDia("01/01");
        tutoria1.setHora("19:00");
        tutoria2.setDia("30/07");
        tutoria2.setHora("09:48");
        tutoria3.setDia("25/06");
        tutoria3.setHora("10:30");
        tutoria4.setDia("13/04");
        tutoria4.setHora("13:52");

        tutorias.add(tutoria1);
        tutorias.add(tutoria2);
        tutorias.add(tutoria3);
        tutorias.add(tutoria4);
    }

    @Override
    public int getCount() {
        return tutorias.size();
    }

    @Override
    public Object getItem(int position) {
        return tutorias.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.linea_profesor_calendario, null);
        }
        TextView txtdiaprofesor = (TextView) convertView.findViewById(R.id.txtdiaprofesor);
        TextView txthoraprofesor = (TextView) convertView.findViewById(R.id.txthoraprofesor);
        Tutoria t = (Tutoria) getItem(position);
        txtdiaprofesor.setText(t.getDia());
        txthoraprofesor.setText(t.getHora());

        return convertView;

    }

}
