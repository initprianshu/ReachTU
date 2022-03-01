package com.example.first_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class secscreen extends AppCompatActivity {
    private Button button;
    private EditText ename1;
    private EditText email1;
    private EditText pin1;
    private Button button16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secscreen);
        button=(Button)findViewById(R.id.button);
        button16=(Button)findViewById(R.id.button16);
        ename1=(EditText)findViewById(R.id.ename1);
        email1=(EditText)findViewById(R.id.email1);
        pin1=(EditText)findViewById(R.id.pin1);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitycpage();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                openActivityscreen3();
                Usernamemodel um=new Usernamemodel(-1,ename1.getText().toString(),email1.getText().toString(),Integer.parseInt(pin1.getText().toString()));
                Toast.makeText(secscreen.this,"Successfully Registered!",Toast.LENGTH_SHORT).show();
                databasehelper db=new databasehelper(secscreen.this);
                boolean success=db.add1(um);
            }
        });
    }
    public void openActivityscreen3(){
        Intent intent=new Intent(this, screen3.class);
        startActivity(intent);
    }
    public void openActivitycpage(){
        Intent intent=new Intent(this, cpage.class);
        startActivity(intent);
    }
}