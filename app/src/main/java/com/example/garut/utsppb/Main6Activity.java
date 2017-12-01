package com.example.garut.utsppb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    int counter;

    Button tambah, kurang, eksekusii;
    TextView nilai;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        context = this;

        tambah = (Button) findViewById(R.id.max);
        kurang = (Button) findViewById(R.id.min);
        nilai = (TextView) findViewById(R.id.Nilai);
        eksekusii = (Button) findViewById(R.id.eksekusi);

        nilai.setText("" + counter);

        tambah.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                counter++;
                nilai.setText("" + counter);
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                counter--;
                nilai.setText("" + counter);
            }
        });

        eksekusii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Anda akan melakukan Olahraga Lari dengan Waktu : " + nilai.getText()+  " jam".toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
