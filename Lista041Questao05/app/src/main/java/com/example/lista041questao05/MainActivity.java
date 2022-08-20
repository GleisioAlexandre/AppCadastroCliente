package com.example.lista041questao05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nota1;
    EditText nota2;
    EditText nota3;
    EditText nota4;
    TextView media;
    Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nota1 = findViewById(R.id.edtxNota1);
        nota2 = findViewById(R.id.edtxNota2);
        nota3 = findViewById(R.id.edtxNota3);
        nota4 = findViewById(R.id.edtxNota4);
        media = findViewById(R.id.txtMedia);
        btnCalcular = findViewById(R.id.btncalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1, n2, n3, n4, m;

                n1 = Double.parseDouble(nota1.getText().toString());
                n2 = Double.parseDouble(nota2.getText().toString());
                n3 = Double.parseDouble(nota3.getText().toString());
                n4 = Double.parseDouble(nota4.getText().toString());

                m = (n1 + n2 + n3 + n4) / 4;

               if (m >= 5){
                   media.setText(String.format("Sua MEDIA foi %.2f, você foi aprovado!", m));
               }else if (m < 5){
                   media.setText(String.format("Sua MEDIA foi %.2f, você Não foi aprovado!", m));
               }

               }

        });
    }
}