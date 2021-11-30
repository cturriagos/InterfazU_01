package com.example.interfazu_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    public RadioButton r1, r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Código Evento Click
    public void btEnviar(View view) {
        //Creamos el Intent
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        EditText txtNombre = (EditText) findViewById(R.id.txtNombre);
        EditText txtTelefono = (EditText) findViewById(R.id.txtTelefono);
        EditText txtFecha = (EditText) findViewById(R.id.txtFecha);
        r1 = (RadioButton) findViewById(R.id.rdMasculino);
        r2 = (RadioButton) findViewById(R.id.rdFemenino);


        //Creamos la información a pasar entre actividades - Pares Key-Value
        Bundle b = new Bundle();

        b.putString("NOMBRE", txtNombre.getText().toString());
        b.putString("TELEFONO", txtTelefono.getText().toString());

        if (r1.isChecked() == true){
            b.putString("GENERO", r1.getText().toString());
        }

        if (r2.isChecked() == true){
            b.putString("GENERO", r2.getText().toString());
        }

        b.putString("FECHA", txtFecha.getText().toString());

        //Añadimos la información al intent
        intent.putExtras(b);
        // Iniciamos la nueva actividad
        startActivity(intent);
    }
}