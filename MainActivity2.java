package com.example.luaskeliling;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    EditText editTextHasilLuas, editTextHasilKeliling;
    TextView textViewPanjang, textViewLebar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editTextHasilLuas = findViewById(R.id.HasilLuas);
        editTextHasilKeliling = findViewById(R.id.Hasilkeliling);
        textViewPanjang = findViewById(R.id.Panjang);
        textViewLebar = findViewById(R.id.Lebar);

        Intent intent = getIntent();
        double Panjang = intent.getDoubleExtra("Panjang", 0);
        double Lebar = intent.getDoubleExtra("Lebar", 0);
        double luas = intent.getDoubleExtra("LUAS", 0);
        double keliling = intent.getDoubleExtra("KELILING", 0);

        editTextHasilLuas.setText(String.valueOf(luas));
        editTextHasilKeliling.setText(String.valueOf(keliling));
        textViewPanjang.setText("Panjang: " + Panjang);
        textViewLebar.setText("Lebar: " + Lebar);
    }
}