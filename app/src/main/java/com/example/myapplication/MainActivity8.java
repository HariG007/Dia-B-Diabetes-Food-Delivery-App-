package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {
    private Button proceedbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    Button proceedbtn = (Button) findViewById(R.id.proceedbtn);
        proceedbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openActivity7();
        }
    });

}
    public void openActivity7() {
        Intent intent = new Intent(this,LifestyleDetailsActivity.class);
        startActivity(intent);
    }
}