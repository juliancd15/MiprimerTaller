package com.example.miprimeraappp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    // Creacion de Objeto Image View & Switch

    private ImageView iv1;
    private Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1 = (ImageView) findViewById(R.id.imageView);
        switch1 = (Switch) findViewById(R.id.switch1);
    }

    // Metodo para Accionar Ocultar

    public void Ocultar (View view){
        switch1.setVisibility(View.INVISIBLE);
        iv1.setVisibility(View.VISIBLE);
    }

    // Metodo de el boton siguiente

    public void Next(View view){
        Intent Next1 = new Intent(  this, MainActivity2.class);
        startActivity(Next1);
    }
}