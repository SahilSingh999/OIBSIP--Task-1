package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView output;
    EditText EnterNum;
    Button meter;
    Button kilogram;
    Button centimeter;
    Button kilometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);
        EnterNum = findViewById(R.id.editTextNumberDecimal);
        meter = findViewById(R.id.meter);
        kilogram = findViewById(R.id.kilogram);
        centimeter = findViewById(R.id.centimeter);
        kilometer= findViewById(R.id.kilometer);

        meter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = EnterNum.getText().toString();
                int number= Integer.parseInt(num);
                float meter=(number * 1000);
                output.setText("Value  in Ms from KMs :"+meter);
            }
        });
        kilogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = EnterNum.getText().toString();
                int number= Integer.parseInt(num);
                float kilogram=(number / 1000);
                output.setText("Value  in KGs from grams :"+kilogram);
            }
        });
        centimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = EnterNum.getText().toString();
                int number= Integer.parseInt(num);
                float centimeter=(number * 100);
                output.setText("Value  in CMs from meters :"+centimeter);
            }
        });
        kilometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = EnterNum.getText().toString();
                int number= Integer.parseInt(num);
                float kilometer=(number / 1000);
                output.setText("Value  in KMs from meters :"+kilometer);
            }
        });
    }
}