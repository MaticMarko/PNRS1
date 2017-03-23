package com.example.matic.adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button upisi = (Button) findViewById(R.id.upisi);
        ListView lista1 = (ListView) findViewById(R.id.lista1);
        final EditText unesi_tekst = (EditText) findViewById(R.id.unesi_tekst);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        upisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.add(unesi_tekst.getText().toString());
                unesi_tekst.getText().clear();
            }
        });

        lista1.setAdapter(adapter);

    }
}
