package com.example.garut.utsppb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        WebView browser = (WebView) findViewById(R.id.webkit);        //Use same layout and manifest of previous example
        browser.loadData("" +
                "<html>" +
                "   <body>" +
                "  <title>About Aplikasi </title>" +
                "<p>" +
                "About Aplikasi<br>" +
                "Aplikasi ini aplikasi<br>" +
                "pencatatan waktu olahraga<br> <br> <br>" +
                "Aplikasi ini dibuat oleh :<br/>" +
                "Abdul Majid (1406003)<br/>" +
                "Gugum Gumilar (1406060)<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html","UTF-8");

    }
}
