package com.example.lista33questo10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText razao;
    EditText termo;
    TextView resultado;
    Button BtnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        razao = findViewById(R.id.edtxRazao);
        termo = findViewById(R.id.edtxTermo);
        resultado = findViewById(R.id.txtResultado);
        BtnCalcular = findViewById(R.id.btnCalcular);

        BtnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double an, a1, q;


                q = Double.parseDouble(razao.getText().toString());
                a1 = Double.parseDouble(termo.getText().toString());

                an = q * Math.pow(a1,2);

                resultado.setText("" + an);

            }
        });
    }
}