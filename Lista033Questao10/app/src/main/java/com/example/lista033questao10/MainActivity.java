package com.example.lista033questao10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.bottomappbar.BottomAppBar;

public class MainActivity extends AppCompatActivity {

    EditText RAZAO;
    EditText TERMO;
    TextView RESULTADO;
    Button BTNCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RAZAO = findViewById(R.id.edtxRazao);
        TERMO = findViewById(R.id.edtxTermo);
        RESULTADO = findViewById(R.id.txtTermo5);
        BTNCalcular = findViewById(R.id.btnCalcular);

        BTNCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double q, a1, a5;

                q = Double.parseDouble(RAZAO.getText().toString());
                a1 = Double.parseDouble(TERMO.getText().toString());

                a5 = q * Math.pow(a1 , 5 - 1);

                RESULTADO.setText("" + a5);
            }
        });
    }
}