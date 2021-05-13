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

        //1 : Nhan du lieu dang string
//        Intent intent = getIntent();
//        String chuoi = intent.getStringExtra("String");
//        Toast.makeText(this,chuoi,Toast.LENGTH_SHORT).show();

        //2 : Nhan du lieu dang Array
//        Intent intent1 = getIntent();
//        int[] arrNumbers = intent.getIntArrayExtra("array");
//        Toast.makeText(this, arrNumbers.length + "", Toast.LENGTH_SHORT).show();
        //3 : Nhan dang object
//        Intent intent = getIntent();
//        Food food = intent.getParcelableExtra("food");
//        Toast.makeText(this, food.getName() + "", Toast.LENGTH_SHORT).show();
        //4 : Nhan du lieu object(Serializable)
        Intent intent = getIntent();
        Animal animal = (Animal) intent.getSerializableExtra("animal");
        Toast.makeText(this, animal.getWeight() + " ", Toast.LENGTH_SHORT).show();
    }
}