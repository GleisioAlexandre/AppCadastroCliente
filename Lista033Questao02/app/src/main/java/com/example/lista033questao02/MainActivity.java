package com.example.lista033questao02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText HORAAULA, HORASTRABALHDAS, DESCONTO;
    TextView SALARIO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HORAAULA = findViewById(R.id.edtxValHoraAula);
        HORASTRABALHDAS = findViewById(R.id.edtxHorasMes);
        DESCONTO = findViewById(R.id.edtxInss);
        SALARIO = findViewById(R.id.txtSalario);
    }

    public void CalcularSalaraio(View view){

        double horasAula, horasTrabalhadas, descont, salario;

        horasAula = Double.parseDouble(HORAAULA.getText().toString());
        horasTrabalhadas = Double.parseDouble(HORASTRABALHDAS.getText().toString());
        descont = Double.parseDouble(DESCONTO.getText().toString());

        salario = horasAula * horasTrabalhadas;

        descont = salario * descont / 100;

        salario = salario - descont;

        SALARIO.setText(String.format("R$ %.2f", salario));
    }
}