package com.example.first_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitysecscreen();
            }
        });

    }
    public void openActivitysecscreen(){
        Intent intent=new Intent(this, secscreen.class);
        startActivity(intent);
    }
    /*public void displayToast(View v){
        Toast.makeText(MainActivity.this,"Welcome To The World of TU",Toast.LENGTH_LONG);
    }*/
}