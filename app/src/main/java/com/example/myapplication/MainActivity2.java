package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button loginbtn;
    private TextView signintxt;
    private Bundle savedInstanceState;
    private Bundle savedInstanceState2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView signintxt = (TextView) findViewById(R.id.signintxt);
        signintxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
    }
    public void openActivity3(){
    Intent intent=new Intent(this, MainActivity3.class);
    startActivity(intent);

    }

    protected void onCreate(View view) {
       super.onCreate(savedInstanceState);
        Button loginbtn = (Button) findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openActivity6();
            }
        });
    }
    public void openActivity6(){
        Intent intent=new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
    }




