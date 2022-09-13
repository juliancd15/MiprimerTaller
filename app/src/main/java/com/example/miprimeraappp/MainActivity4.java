package com.example.miprimeraappp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    // escribo los objetos

    private EditText et1, et2;
    private CheckBox check1, check2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //crear la relacion parte logica con parte grafica
        et1 = (EditText) findViewById(R.id.txt_valor1);
        et2 = (EditText) findViewById(R.id.txt_valor2);
        check1 = (CheckBox)findViewById(R.id.check_Suma);
        check2 = (CheckBox)findViewById(R.id.check_Resta);
        tv1 = (TextView)findViewById(R.id.tv_resultado);
    }
    // Metodo de funcion de boton
    public void Calcular(View view){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        String resultado = "";

        // estructuras condicionales
        if(check1.isChecked() == true){
            int suma = valor1_int + valor2_int;
            resultado = " La suma es: " + suma + " / ";
        }
        if (check2.isChecked() == true){
            int resta = valor1_int - valor2_int;
            resultado = resultado + " La resta es: " + resta;
        }
        tv1.setText(resultado);


    }

    // Metodo de boton anterior
    public void Previous(View view){
        Intent Previous2 = new Intent(this, MainActivity3.class);
        startActivity(Previous2);
    }

    // Metodo de el boton siguiente

    public void Next(View view){
        Intent Next3 = new Intent(  this, MainActivity5.class);
        startActivity(Next3);
    }
}