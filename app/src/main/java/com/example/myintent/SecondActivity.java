package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
 Button button;
 TextView sname,name,patr,agesss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button = findViewById(R.id.button);
        sname = findViewById(R.id.sN);
        name = findViewById(R.id.n);
        patr = findViewById(R.id.patron);
        agesss = findViewById(R.id.ageS);
        Intent inte = getIntent();
        String surname = inte.getStringExtra("s").toString();
        String names = inte.getStringExtra("n").toString();
        String patronymic = inte.getStringExtra("p").toString();
        String age = inte.getStringExtra("a").toString();
        sname.setText(surname);
        name.setText(names);
        patr.setText(patronymic);
        agesss.setText(age);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(SecondActivity.this,MainActivity.class);
             startActivity(intent);
             }
         });
    }
}