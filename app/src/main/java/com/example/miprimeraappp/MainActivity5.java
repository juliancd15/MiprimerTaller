package com.example.miprimeraappp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
// escribo los objetos

    private EditText et11, et22;
    private RadioButton rb1, rb2;
    private TextView tvr;
    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        //crear la relacion parte logica con parte grafica
        et11 = (EditText) findViewById(R.id.txt_valor3);
        et22 = (EditText) findViewById(R.id.txt_valor4);
        tvr = (TextView) findViewById(R.id.tv_resultadot);
        rb1 = (RadioButton) findViewById(R.id.rb_suma);
        rb2 = (RadioButton) findViewById(R.id.rb_resta);
        spinner1 = (Spinner) findViewById(R.id.spinner);

        String[] opciones = {"sumar", "restar", "multiplicar", "dividir"};


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);
    }

    // Metodo de Spinner


    // Metodo de funcion de boton
    public void Calcular(View view) {
        String valor1_String = et11.getText().toString();
        String valor2_String = et22.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        String seleccion = spinner1.getSelectedItem().toString();
        if (seleccion.equals("sumar")) {
            int suma = valor1_int + valor2_int;
            String resultado = String.valueOf(suma);
            tvr.setText(resultado);
        } else if (seleccion.equals("resta")) {
            int resta = valor1_int - valor2_int;
            String resultado = String.valueOf(resta);
            tvr.setText(resultado);
        } else if (seleccion.equals("multiplicar")) {
            int multiplicar = valor1_int * valor2_int;
            String resultado = String.valueOf(multiplicar);
            tvr.setText(resultado);
        } else if (seleccion.equals("dividir")) {
            if (valor2_int != 0) {
                int dividir = valor1_int / valor2_int;
                String resultado = String.valueOf(dividir);
                tvr.setText(resultado);
            } else {
                Toast.makeText(this, "No se puede dividir entre cero", Toast.LENGTH_LONG).show();
            }
        }

        // estructuras condicionales

        if (rb1.isChecked() == true) {
            int suma = valor1_int + valor2_int;
            String resultado = String.valueOf(suma);
            tvr.setText(resultado);
        }
        if (rb2.isChecked() == true) {
            int resta = valor1_int - valor2_int;
            String resultado = String.valueOf(resta);
            tvr.setText(resultado);
        }


    }

    public void Previous(View view) {
        Intent Previous2 = new Intent(this, MainActivity4.class);
        startActivity(Previous2);
    }
}