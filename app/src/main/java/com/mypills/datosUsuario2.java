package com.mypills;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class datosUsuario2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_usuario2);
    }





    //Metodo temporal Borrable para visitar pagina3 ejercicio desarrollo
    public void siguiente2(View view){

        Intent siguiente2= new Intent(this,agregarMedicamento3.class);
        startActivity(siguiente2);
    }

    public void siguiente2r(View view){

        Intent siguiente2r= new Intent(this,mypills1.class);
        startActivity(siguiente2r);
    }

    // hasta aqui

}