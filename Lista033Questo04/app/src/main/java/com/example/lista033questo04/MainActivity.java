package com.example.lista033questo04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nota1, nota2, nota3, nota4;
    TextView media;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nota1 = findViewById(R.id.edtxNota1);
        nota2 = findViewById(R.id.edtxNota2);
        nota3 = findViewById(R.id.edtxNota3);
        nota4 = findViewById(R.id.edtxNota4);
        media = findViewById(R.id.txtMedia);
    }
    public void calcularMedia(View view){

        double n1, n2, n3, n4, mp;

        n1 = Double.parseDouble(nota1.getText().toString());
        n2 = Double.parseDouble(nota2.getText().toString());
        n3 = Double.parseDouble(nota3.getText().toString());
        n4 = Double.parseDouble(nota4.getText().toString());

        mp = (n1 * 1) + (n2 * 2) + (n3 * 3) + (n4 * 4) / (1 + 2 + 3 + 5);

        media.setText(String.format("Média: %.2f", mp));

    }
}