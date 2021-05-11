package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //1 : Nhan du lieu
        Intent intent = getIntent();
        String chuoi = intent.getStringExtra("String");
        Toast.makeText(this,chuoi,Toast.LENGTH_SHORT).show();
    }
}