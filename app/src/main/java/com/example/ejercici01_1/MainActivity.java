package com.example.ejercici01_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText num1, num2;

    Button btnSuma, btnResta, btnDiv, btnMulti, btnsal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.txtNum1);
        num2 = (EditText)findViewById(R.id.txtNum2);
        btnSuma = (Button) findViewById(R.id.btnSumar);
        btnResta = (Button) findViewById(R.id.btnRestar);
        btnDiv = (Button) findViewById(R.id.btnDivision);
        btnMulti = (Button) findViewById(R.id.btnMultiplicacion);
        btnsal = (Button) findViewById(R.id.btnSal);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validar()){

                    suma();

                }
            }
        });//fin boton suma


        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validar()){

                    resta();

                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validar()){

                    divi();

                }
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validar()){

                    multi();

                }
            }
        });

        btnsal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });

    }


    //Metodo para validar campos vacios
    public boolean validar(){
        boolean retorna = true;
        if(num1.getText().toString().isEmpty()){
            num1.setError("No permite campo vacio");
            retorna = false;
        }
        if(num2.getText().toString().isEmpty()){
            num2.setError("No permite campo vacio");
            retorna = false;
        }
        return retorna;

    }
    //Metodo suma
    private void suma() {
        double n1,n2, res;
        n1=Double.parseDouble(num1.getText().toString());
        n2=Double.parseDouble(num2.getText().toString());
        res = n1 + n2;

        //Crear un inten para cambiar de ventana
        Intent enviar = new Intent(MainActivity.this, MainActivity2.class);


        //agrega los datos que se van a pasar
        enviar.putExtra("datos", res);

        //cambio de actividad o ventana
        startActivity(enviar);

    }

    //Metodo resta
    private void resta(){
        double n1,n2, res;
        n1=Double.parseDouble(num1.getText().toString());
        n2=Double.parseDouble(num2.getText().toString());

        res = n1 - n2;

        //Crear un inten para cambiar de ventana
        Intent enviar = new Intent(MainActivity.this, MainActivity2.class);


        //agrega los datos que se van a pasar
        enviar.putExtra("datos", res);

        //cambio de actividad o ventana
        startActivity(enviar);
    }

    //Metodo division
    private void divi(){
        double n1,n2, res;
        n1=Double.parseDouble(num1.getText().toString());
        n2=Double.parseDouble(num2.getText().toString());

        res = n1 / n2;

        //Crear un inten para cambiar de ventana
        Intent enviar = new Intent(MainActivity.this, MainActivity2.class);


        //agrega los datos que se van a pasar
        enviar.putExtra("datos", res);

        //cambio de actividad o ventana
        startActivity(enviar);
    }



    //Metodo multiplicacion
    private void multi(){
        double n1,n2, res;
        n1=Double.parseDouble(num1.getText().toString());
        n2=Double.parseDouble(num2.getText().toString());

        res = n1 * n2;

        //Crear un inten para cambiar de ventana
        Intent enviar = new Intent(MainActivity.this, MainActivity2.class);


        //agrega los datos que se van a pasar
        enviar.putExtra("datos", res);

        //cambio de actividad o ventana
        startActivity(enviar);
    }

    @Override
    public void onClick(View view) {

    }


    // @Override
  //  public void onClick(View view) {

  //  }
}