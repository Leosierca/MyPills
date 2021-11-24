package com.mypills;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class mypills1 extends AppCompatActivity {

    private Button btncomenzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypills1);

        btncomenzar = findViewById(R.id.btncomenzar);


    }


    //Metodo temporal Borrable para visitar pagina3 ejercicio desarrollo
    public void siguiente(View view){

        Intent siguiente= new Intent(this,datosUsuario2.class);
        startActivity(siguiente);
    }
    // hasta aqui


}