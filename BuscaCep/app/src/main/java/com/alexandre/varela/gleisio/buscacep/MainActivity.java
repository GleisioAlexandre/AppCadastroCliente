package com.alexandre.varela.gleisio.buscacep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText caixaCep;
    TextView caixaLogradouro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaCep = findViewById(R.id.txbCep);
        caixaLogradouro = findViewById(R.id.txtLogradouro);
    }
    public void consultaCep(View view){

      //  ViaCep.buscar(caixaLogradouro.getText());

        caixaLogradouro.setText("");
    }
}