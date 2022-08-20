package com.example.lista033questo07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.shape.EdgeTreatment;

public class MainActivity extends AppCompatActivity {

    EditText catetoA, catetoB;
    TextView hipotenusa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catetoA = findViewById(R.id.edtxCatetoA);
        catetoB = findViewById(R.id.edtxCatetoB);
        hipotenusa = findViewById(R.id.txtHipotenusa);
    }
    public void calculoHipotenusa(View view){

        double ca, cb, h;

        ca = Double.parseDouble(catetoA.getText().toString());
        cb = Double.parseDouble(catetoB.getText().toString());

       h = Math.pow(ca,2) + Math.pow(cb,2);

       hipotenusa.setText(String.format("Hipotenusa: %.2f" , Math.sqrt(h)));

    }
}