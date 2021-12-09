package com.mypills;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MyPills4 extends AppCompatActivity {

    TextView holaNn;
    ImageButton misMedicamentos;
    ImageButton lista;
    ImageButton imgagregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_pills4);

        holaNn=findViewById(R.id.txtHola);
        misMedicamentos=findViewById(R.id.imgMisMedicamts);
        lista=findViewById(R.id.imgLista);
        imgagregar=findViewById(R.id.imgAgregar);

        misMedicamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                consultar();
            }
        });

        lista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarM();
            }
        });
/*
        imgagregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrarse();
            }
        });
*/



    }
    //envia a mostrardatoosactivity.java
    private void consultar(){

        startActivity(new Intent(MyPills4.this,MostrarDatosActivity.class));

    }

    //envia a activity agregarmedicamentos3
    private void agregarM(){

        startActivity(new Intent(MyPills4.this,agregarMedicamento3.class));

    }

    //envia a activity datosUsuario2
    private void registrarse(){

        startActivity(new Intent(MyPills4.this,datosUsuario2.class));

    }







}