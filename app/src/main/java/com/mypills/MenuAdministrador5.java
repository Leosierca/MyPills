package com.mypills;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuAdministrador5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_administrador5);
    }

    //Metodo temporal Borrable para visitar pagina3 ejercicio desarrollo
    public void siguiente5(View view){

        Intent siguiente5= new Intent(this,Alerta10.class);
        startActivity(siguiente5);
    }
    // hasta aqui




}