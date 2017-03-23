package rtrk.pnrs1.ra87_2014;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class task extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        final Button red_button = (Button) findViewById(R.id.red_button);
        final Button orange_button = (Button) findViewById(R.id.orange_button);
        final Button green_button = (Button) findViewById(R.id.green_button);
        Button add_button = (Button) findViewById(R.id.add_button);
        Button cancel_button = (Button) findViewById(R.id.cancel_button);

        final Intent main = new Intent(this, MainActivity.class);

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(main);
            }
        });

        cancel_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(main);
            }
        });

        red_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                red_button.setEnabled(false);
                orange_button.setEnabled(true);
                green_button.setEnabled(true);
            }
        });

        orange_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orange_button.setEnabled(false);
                red_button.setEnabled(true);
                green_button.setEnabled(true);
            }
        });

        green_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                green_button.setEnabled(false);
                red_button.setEnabled(true);
                orange_button.setEnabled(true);
            }
        });

    }
}
