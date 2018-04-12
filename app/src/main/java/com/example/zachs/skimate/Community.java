package com.example.zachs.skimate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Community extends AppCompatActivity {

    private Button mSubmit;
    private EditText mEdit;
    private TextView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);

        mSubmit = (Button) findViewById(R.id.button_submit);
        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEdit   = (EditText)findViewById(R.id.editText);
                mView = (TextView)findViewById(R.id.textView1);
                mView.setText(mEdit.getText().toString());
            }
        });
    }
}
