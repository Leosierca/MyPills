package com.mypills;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo temporal Borrable para visitar pagina3 ejercicio desarrollo
    public void siguiente2(View view){

        Intent siguiente= new Intent(this,mypills1.class);
        startActivity(siguiente);
    }


}