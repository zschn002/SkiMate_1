package com.example.zachs.skimate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Mountain extends AppCompatActivity{

    private Button mWhiteface;
    private Button mBeartown;
    private Button mStowe;
    private Button mTitus;
    private Button mKillington;
    private Button mJaysPeak;
    private Button mGore;
    private Button mSugarBush;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain);

        mWhiteface = (Button) findViewById(R.id.button_whiteface);
        mWhiteface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Mountain.this, Whiteface.class);
                startActivity(i);
            }
        });

        mBeartown = (Button) findViewById(R.id.button_beartown);
        mBeartown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Mountain.this, Beartown.class);
                startActivity(i);
            }
        });

        mTitus = (Button) findViewById(R.id.button_titus);
        mTitus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Mountain.this, Titus.class);
                startActivity(i);
            }
        });

        mStowe = (Button) findViewById(R.id.button_stowe);
        mStowe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Mountain.this, Stowe.class);
                startActivity(i);
            }
        });

        mGore = (Button) findViewById(R.id.button_gore);
        mGore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Mountain.this, Gore.class);
                startActivity(i);
            }
        });

        mSugarBush = (Button) findViewById(R.id.button_sugarBush);
        mSugarBush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Mountain.this, SugarBush.class);
                startActivity(i);
            }
        });

        mJaysPeak = (Button) findViewById(R.id.button_jayPeak);
        mJaysPeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Mountain.this, JayPeak.class);
                startActivity(i);
            }
        });

        mKillington = (Button) findViewById(R.id.button_killington);
        mKillington.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Mountain.this, Killington.class);
                startActivity(i);
            }
        });
    }
}

