package com.example.lista0303questao05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText raio, altura;
    TextView volume;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        raio = findViewById(R.id.edtxRaio);
        altura = findViewById(R.id.edtxAltura);
        volume = findViewById(R.id.txtVolume);
    }

    public void calcularVolume (View view){

        double r, a, v;

        r = Double.parseDouble(raio.getText().toString());
        a = Double.parseDouble(altura.getText().toString());

        v = Math.PI * (r * r) * a;

        volume.setText(String.format("%.2f", v));
    }
}