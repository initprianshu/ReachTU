package com.example.first_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class cpage extends AppCompatActivity {

    Button que;
    EditText ki;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpage);
        que = findViewById(R.id.button15);
        ki = findViewById(R.id.ques);
        que.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                querydatabase qdb= new querydatabase(-1,ki.getText().toString());
                Toast.makeText(cpage.this,"Your Query has been received , we will get back to you shortly. ",Toast.LENGTH_SHORT).show();
                help h = new help(cpage.this);
                boolean success = h.addone(qdb);




            }
        });
    }
}