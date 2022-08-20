package com.example.lista51questao05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numero;
    TextView resultado;
    Button btncalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = findViewById(R.id.edtxNumero);
        resultado = findViewById(R.id.txtResultado);
        btncalcular = findViewById(R.id.btnClcular);

        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int r,num, i = 0;

                while (i <= 10) {

                
                }
            }
        });
    }
}