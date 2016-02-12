package com.example.pablo.colegio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PadreMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padre_main);
        setTitle("Padre");
        MiListener listener = new MiListener();
        Button btchattpadre = (Button)findViewById(R.id.btnChattpadre);
        Button btlistenerpadre = (Button)findViewById(R.id.btninfopadre);
        Button btcalendariopadre = (Button)findViewById(R.id.btnCalendarioPadre);

        btchattpadre.setOnClickListener(listener);
        btlistenerpadre.setOnClickListener(listener);
        btcalendariopadre.setOnClickListener(listener);
    }

    private class MiListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.btnChattpadre) {
                Intent intentactivity = new Intent(PadreMain.this, chattPadre.class);
                startActivity(intentactivity);

            } else {
                if (v.getId() == R.id.btninfopadre) {
                    Intent intentactivity = new Intent(PadreMain.this, infoPadre.class);
                    startActivity(intentactivity);

                } else {
                    if (v.getId() == R.id.btnCalendarioPadre) {
                        Intent intentactivity = new Intent(PadreMain.this, calendarioPadre.class);
                        startActivity(intentactivity);
                    }

                }
            }
        }
    }
}



