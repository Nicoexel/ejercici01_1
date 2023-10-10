package com.example.ejercici01_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView lbldatos;
    Button btnregresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recibirDatos();

        btnregresar= (Button) findViewById(R.id.btnRetorno);

        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //este metodo cierra la actividad lo cual nos permite regresar a la anterior
                finish();
            }
        });


    }

    private void recibirDatos(){
        Intent extra = getIntent();
        double resultado = extra.getDoubleExtra("datos",0);
        lbldatos = (TextView) findViewById(R.id.lblResul);
        lbldatos.setText(String.valueOf(resultado));

    }
}