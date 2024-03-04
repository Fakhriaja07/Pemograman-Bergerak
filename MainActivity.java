package com.example.luaskeliling;


import static com.example.luaskeliling.R.id.btJumlah;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static String EXTRA_Panjang;
    public static String EXTRA_Lebar;
    EditText edPanjang, edLebar;
    Button btJumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edPanjang = findViewById(R.id.edPanjang);
        edLebar = findViewById(R.id.edLebar);
        btJumlah = findViewById(R.id.btJumlah);

        btJumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungDanTampilkan();
            }
        });
    }

    private void hitungDanTampilkan() {

            double panjang = Double.parseDouble(edPanjang.getText().toString());
            double lebar = Double.parseDouble(edLebar.getText().toString());


            double luas = panjang * lebar;
            double keliling = 2 * (panjang + lebar);

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("Panjang", panjang);
            intent.putExtra("Lebar", lebar);
            intent.putExtra("LUAS", luas);
            intent.putExtra("KELILING", keliling);
            startActivity(intent);

        }
    }




