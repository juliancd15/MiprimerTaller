package com.example.miprimeraappp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    // Metodo de boton anterior
    public void Previous(View view){
        Intent Previous1 = new Intent(this, MainActivity.class);
        startActivity(Previous1);
    }
    // Metodo de boton siquiente Main 3
    public void Next(View view){
        Intent Next2 = new Intent(  this, MainActivity3.class);
        startActivity(Next2);
    }
}