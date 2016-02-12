package com.example.pablo.colegio;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ProfesorMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesor_main);
        setTitle("Profesor");
        MiListener listener = new MiListener();
        Button btchattprofe = (Button)findViewById(R.id.btnChattprofe);
        Button btlistenerprofe = (Button)findViewById(R.id.btninfoprofe);
        Button btcalendariorofe = (Button)findViewById(R.id.btnCalendarioProfe);

        btchattprofe.setOnClickListener(listener);
        btlistenerprofe.setOnClickListener(listener);
        btcalendariorofe.setOnClickListener(listener);
    }

    private class MiListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.btnChattprofe) {
                Intent intentactivity = new Intent(ProfesorMain.this, chattProfe.class);
                startActivity(intentactivity);

            } else {
                if (v.getId() == R.id.btninfoprofe) {
                    Intent intentactivity = new Intent(ProfesorMain.this, infoProfe.class);
                    startActivity(intentactivity);

                } else {
                    if (v.getId() == R.id.btnCalendarioProfe) {
                        Intent intentactivity = new Intent(ProfesorMain.this, calendarioProfe.class);
                        startActivity(intentactivity);
                    }

                }
            }
        }
    }
}
