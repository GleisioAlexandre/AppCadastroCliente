package com.example.lista041questao03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numero;
    TextView resultado;
    Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = findViewById(R.id.edtxNumero);
        resultado = findViewById(R.id.txtResultado);
        btnCalcular = findViewById(R.id.btnTestar);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double num,res;

                num = Double.parseDouble(numero.getText().toString());

                res = num % 2;

                if (res == 0){

                        resultado.setText(String.format("O numero %.0f, é um numero par! ", num));

                }else{

                        resultado.setText(String.format("O numero %.0f, é um numero impar! ", num));

                }

            }
        });
    }
}