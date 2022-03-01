package com.example.first_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class screen3 extends AppCompatActivity {
    private Button button3;
    private Button button8;
    private Button button9;
    private Button button5;
    private Button button4;
    private Button button6;
    private Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        button5=(Button)findViewById(R.id.button5);
        button9=(Button)findViewById(R.id.button9);
        button8=(Button)findViewById(R.id.button8);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitylaundry();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityfaculty_s1();
            }


        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityfood();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityhealth();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityhostel();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityadmins();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitymaps();
            }
        });
    }
    public void openActivityfaculty_s1(){
        Intent intent=new Intent(this, faculty_s1.class);
        startActivity(intent);
    }
    public void openActivitylaundry(){
        Intent intent=new Intent(this, laundry.class);
        startActivity(intent);
    }
    public void openActivityfood(){
        Intent intent=new Intent(this, food.class);
        startActivity(intent);
    }
    public void openActivityhealth(){
        Intent intent=new Intent(this, Health.class);
        startActivity(intent);
    }
    public void openActivityhostel(){
        Intent intent=new Intent(this, hostel.class);
        startActivity(intent);
    }
    public void openActivityadmins(){
        Intent intent=new Intent(this, admins.class);
        startActivity(intent);
    }
    public void openActivitymaps(){
        Intent intent=new Intent(this, maps.class);
        startActivity(intent);
    }
}