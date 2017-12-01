package com.example.garut.utsppb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class Main2Activity extends AppCompatActivity {
    Button btnlistpesan;
    Button btnpesanmakanan;
    Button btnabout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnlistpesan = (Button) findViewById(R.id.btnlistpesan);
        btnlistpesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(i);
            }
        });
        btnabout = (Button) findViewById(R.id.btnabout);
        btnabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(Main2Activity.this, Main4Activity.class);
                Main2Activity.this.startActivity(i);
            }
        });
    }
    public void keluar (View view) {
        finish();
    }
}
