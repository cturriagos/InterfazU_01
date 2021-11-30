package com.example.interfazu_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Localizar los controles
        TextView  txtSaludo = (TextView)findViewById(R.id.txtSaludo);
        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
        //Construimos el mensaje a mostrar
        txtSaludo.setText("Hola!, Bienvenido " + bundle.getString("NOMBRE") + "\nEres de género " +
                          bundle.getString("GENERO") + "\nTu teléfono es " + bundle.getString("TELEFONO")
                          + "\nY naciste el " + bundle.getString("FECHA"));

    }
}