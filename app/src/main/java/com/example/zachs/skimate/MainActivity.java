package com.example.zachs.skimate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.zachs.skimate.model.User;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    private Button mMountain;
    private Button mCommunity;
    private Button mFriends;
    private Button mHelp;
    private Button mProfile;
    //private Button mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMountain = (Button) findViewById(R.id.button_Mountain);
        mMountain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.mountain_toast,
                        Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, Mountain.class);
                startActivity(i);
            }
        });


        mCommunity = (Button) findViewById(R.id.button_Community);
        mCommunity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.community_toast,
                        Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, Community.class);
                startActivity(i);
            }
        });


        mFriends = (Button) findViewById(R.id.button_Friends);
        mFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.friends_toast,
                        Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, Friends.class);
                startActivity(i);
            }
        });






    }
    }

