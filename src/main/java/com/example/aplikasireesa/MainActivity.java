package com.example.aplikasireesa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button btkali,btbagi,bttambah,btkurang;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.inputbil1);
        et2 = (EditText) findViewById(R.id.inputbil2);
        btkali = (Button) findViewById(R.id.bkali);
        btbagi = (Button) findViewById(R.id.bbagi);
        bttambah = (Button) findViewById(R.id.btambah);
        btkurang = (Button) findViewById(R.id.bkurang);
        tvHasil = (TextView) findViewById(R.id.hasilangka);

        btkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1,bil2,hasil;
                bil1 = Double.valueOf(et1.getText().toString().trim());
                bil2 = Double.valueOf(et2.getText().toString().trim());
                hasil = bil1*bil2;
                String hasil1 = String.valueOf(hasil);
                tvHasil.setText(hasil1);
            }
        });
        btbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1,bil2,hasil;
                bil1 = Double.valueOf(et1.getText().toString().trim());
                bil2 = Double.valueOf(et2.getText().toString().trim());
                hasil = bil1/bil2;
                String hasil1 = String.valueOf(hasil);
                tvHasil.setText(hasil1);
            }
        });
        bttambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1,bil2,hasil;
                bil1 = Double.valueOf(et1.getText().toString().trim());
                bil2 = Double.valueOf(et2.getText().toString().trim());
                hasil = bil1+bil2;
                String hasil1 = String.valueOf(hasil);
                tvHasil.setText(hasil1);
            }
        });
        btkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1,bil2,hasil;
                bil1 = Double.valueOf(et1.getText().toString().trim());
                bil2 = Double.valueOf(et2.getText().toString().trim());
                hasil = bil1-bil2;
                String hasil1 = String.valueOf(hasil);
                tvHasil.setText(hasil1);
            }
        });

    }


}