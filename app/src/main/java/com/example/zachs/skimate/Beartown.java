package com.example.zachs.skimate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by zachs on 5/17/2018.
 */

public class Beartown extends AppCompatActivity {

    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beartown);

        back = (Button) findViewById(R.id.button_backBeartown);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Beartown.this, Mountain.class);
                startActivity(i);
            }
        });

    }
}
