package com.example.first_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hostel extends AppCompatActivity {
    private Button button11;
    private Button button14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostel);
        button11=(Button)findViewById(R.id.button11);
        button14=(Button)findViewById(R.id.button14);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitybhostel();
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityghostel();
            }
        });

    }
    public void openActivitybhostel(){
        Intent intent=new Intent(this,bhostel.class);
        startActivity(intent);
    }
    public void openActivityghostel(){
        Intent intent=new Intent(this,ghostel.class);
        startActivity(intent);
    }



}