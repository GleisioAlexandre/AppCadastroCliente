package com.example.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void Enviar (View view){

        TextView peidio = findViewById(R.id.txbPedido);
        TextView texto = findViewById(R.id.txtTeste);

        texto.setText(peidio.getText());

    }


}