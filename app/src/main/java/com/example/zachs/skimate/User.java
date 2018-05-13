package com.example.zachs.skimate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.jar.Attributes;

public class User extends AppCompatActivity {

    private EditText mPassword, mUsername, mName, mAge, mEmail, mPhone_num;
    private TextView mUpdate;
    private Button mSave;
    private Button mBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        mSave = (Button) findViewById(R.id.save);
        mSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPassword = (EditText)findViewById(R.id.password);
                mUsername = (EditText) findViewById(R.id.username);
                mName = (EditText) findViewById(R.id.name);
                mAge = (EditText) findViewById(R.id.age);
                mEmail = (EditText) findViewById(R.id.email);
                mPhone_num = (EditText) findViewById(R.id.phone_num);

                Toast.makeText(User.this,
                        R.string.user_toast,
                        Toast.LENGTH_SHORT).show();



                //Connect to Database
                //Save credentials for user

            }
        });





        mBack= (Button) findViewById(R.id.BackButton);
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(User.this,"Moving back to the update page!",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(User.this, MainActivity.class);
                startActivity(i);
            }
        });


    }
}
