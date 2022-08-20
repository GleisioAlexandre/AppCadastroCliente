package com.example.lista033questo08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText BASE, ALTURA;
    TextView PERIMETRO, AREA, DIAGONAL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ALTURA = findViewById(R.id.edtxAltura);
        BASE = findViewById(R.id.edtxBase);

        PERIMETRO = findViewById(R.id.txtPerimetro);
        AREA = findViewById(R.id.txtArea);
        DIAGONAL = findViewById(R.id.txtDiagonal);
    }
    public void calculoRetangulo(View view){
        double base, altura, perimetro, area, diagonal;

        base = Double.parseDouble(BASE.getText().toString());
        altura = Double.parseDouble(ALTURA.getText().toString());

        perimetro = (base * 2) + (altura * 2);
        area = base * altura;
        diagonal = Math.pow(base, 2) + Math.pow(altura, 2);

        PERIMETRO.setText(String.format("Perimetro: %.2f", perimetro));
        AREA.setText(String.format("Área: %.2f", area));
        DIAGONAL.setText(String.format("Diagonal: %.2f", Math.sqrt(diagonal)));
    }
}