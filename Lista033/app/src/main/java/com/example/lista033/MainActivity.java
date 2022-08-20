package com.example.lista033;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText RAIO;
    TextView AREA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RAIO = findViewById(R.id.edtxRario);
        AREA = findViewById(R.id.txtArea);
    }

    public void Calcualr (View view){

        double area, raio;

        raio = Double.parseDouble(RAIO.getText().toString());

        area = Math.PI * (raio * raio);

        AREA.setText(String.format("Area: %.2f", area));
    }
}