package rtrk.pnrs1.ra87_2014;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button new_task = (Button) findViewById(R.id.new_task);
        Button stat = (Button) findViewById(R.id.stat);

        final Intent task = new Intent(this, task.class);
        final Intent stats = new Intent(this, stat.class);

        new_task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(task);
            }
        });

        stat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(stats);
            }
        });

    }
}
