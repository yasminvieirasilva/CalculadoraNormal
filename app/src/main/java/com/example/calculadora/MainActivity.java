package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    TextView rslt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        rslt = findViewById(R.id.rslt);
    }

    public void somar(View v) {
        int numeroUm = Integer.parseInt(n1.getText().toString());
        int numeroDois = Integer.parseInt(n2.getText().toString());
        int resultado = numeroUm + numeroDois;
        rslt.setText(resultado + "");
        }

    public void subtrair (View v) {
        int numeroUm = Integer.parseInt(n2.getText().toString());
        int numeroDois= Integer.parseInt(n1.getText().toString());
        int resultado= numeroUm * numeroDois;
        rslt.setText(resultado + "");
        }
    public void dividir (View v){
        int numeroUm = Integer.parseInt(n1.getText().toString());
        int numeroDois = Integer.parseInt(n2.getText().toString());
        int resultado = numeroUm/numeroDois;
        rslt.setText(resultado + "");
    }
    public void multi (View v){
        int numeroUm = Integer.parseInt(n2.getText().toString());
        int numeroDois = Integer.parseInt(n1.getText().toString());
        int resultado = numeroUm + numeroDois;
        rslt.setText(resultado + "");
    }

}