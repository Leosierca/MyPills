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

    }


    //Metodo temporal Borrable para visitar pagina3 ejercicio desarrollo
    public void siguiente4(View view){

        Intent siguiente4= new Intent(this,Calendario8.class);
        startActivity(siguiente4);
    }
    // hasta aqui


}