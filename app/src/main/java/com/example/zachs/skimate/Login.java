package com.example.zachs.skimate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private  Button mSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        mSignup = (Button) findViewById(R.id.Signup);
        mSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this,"Moving to Update User Page!",Toast.LENGTH_SHORT).show();

                Intent i = new Intent(Login.this, User.class);
                startActivity(i);
            }
        });





    }
}
