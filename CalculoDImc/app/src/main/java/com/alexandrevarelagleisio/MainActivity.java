package com.alexandrevarelagleisio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void calcular (View view){
        double IMC, PESO, ALTURA;
        String RESULTADO;
        TextView altura = findViewById(R.id.txbAltura);
        TextView peso = findViewById(R.id.txbPeso);
        TextView imc = findViewById(R.id.txtIMC);

        ALTURA = Double.parseDouble(altura.getText().toString());
        PESO = Double.parseDouble(peso.getText().toString());

        IMC = (PESO / (ALTURA * ALTURA));
        RESULTADO = String.format("%.1f", IMC);
        imc.setText(RESULTADO);

        situacaoIMC();

    }
    public void situacaoIMC(){
        double IMC;
        TextView imc = findViewById(R.id.txtIMC);
        TextView situacao = findViewById(R.id.txtSituação);
        IMC = Double.parseDouble(imc.getText().toString());

        if (IMC < 18.5){
            situacao.setText("Abaixo do Peso");
        }else if (IMC >= 18.5 && IMC <= 24.9){
                situacao.setText("Peso Normal");
        }else if (IMC >= 25 && IMC <= 29.9){
                situacao.setText("Sobre Peso");
        }else if (IMC >= 30 && IMC <= 34.9){
                situacao.setText("Obesidade Grau 1");
        }else if (IMC >= 35 && IMC <= 39.9){
                situacao.setText("Obesidade Grau 2");
        }else {
                situacao.setText("Obesidade Grau 3");
        }

        }

    }
