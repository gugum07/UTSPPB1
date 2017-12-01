package com.example.garut.utsppb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Intent;

public class Main3Activity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        listView = (ListView)findViewById(R.id.list1);
        String pilihan[] = { "Lari", "Futsal", "Basket", "Bulutangkis", "Tenis"};

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pilihan);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String itemValue = (String) listView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), itemValue, Toast.LENGTH_LONG).show();

                switch (itemPosition) {
                    case 0:
                        Intent lari = new Intent(Main3Activity.this, Main6Activity.class);
                        startActivity(lari);
                        break;
                    case 1:
                        Intent futsal = new Intent(Main3Activity.this, Main7Activity.class);
                        startActivity(futsal);
                        break;

                    case 2:
                        Intent basket = new Intent(Main3Activity.this, Main8Activity.class);
                        startActivity(basket);
                        break;
                    case 3:
                        Intent bulutangkis = new Intent(Main3Activity.this, Main9Activity.class);
                        startActivity(bulutangkis);
                        break;

                    case 4:
                        Intent tenis = new Intent(Main3Activity.this, Main10Activity.class);
                        startActivity(tenis);
                        break;

                }
            }
        });
    }


}
