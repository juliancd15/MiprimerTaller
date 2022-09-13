package com.example.miprimeraappp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    // Metodo de boton anterior
    public void Previous(View view){
        Intent Previous2 = new Intent(this, MainActivity2.class);
        startActivity(Previous2);
    }

    // Metodo de el boton siguiente

    public void Next(View view){
        Intent Next3 = new Intent(  this, MainActivity4.class);
        startActivity(Next3);
    }

}