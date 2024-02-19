package com.example.myintent;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText surnames,names,patronymic,ages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn);
        surnames = findViewById(R.id.surname);
        names = findViewById(R.id.name);
        patronymic = findViewById(R.id.patr);
        ages = findViewById(R.id.age);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String surname = surnames.getText().toString();
                String name = names.getText().toString();
                String patron = patronymic.getText().toString();
                String age = ages.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("s",surname) ;
                intent.putExtra("n",name);
                intent.putExtra("p",patron);
                intent.putExtra("a",age);
                startActivity(intent);
            }
        });
    }
}