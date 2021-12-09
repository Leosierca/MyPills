package com.mypills;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;

public class mypills1 extends AppCompatActivity {

    FirebaseFirestore mfirestore = FirebaseFirestore.getInstance();
    private Button btncomenzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypills1);

        btncomenzar = findViewById(R.id.btncomenzar);


    }


    //Metodo temporal Borrable para visitar pagina3 ejercicio desarrollo


    public void siguiente(View view) {
  /*
        Intent registrousuario = new Intent(this, datosUsuario2.class);
        Intent listadomedicamentos = new Intent(this, MyPills4.class);

        int datos = mfirestore.collection("Usuario").get().getResult().size();
        if (datos > 1) {
            startActivity(listadomedicamentos);
        } else {
            startActivity(registrousuario);
}*/
        Intent siguiente= new Intent(this,MyPills4.class);
        startActivity(siguiente);

        // hasta aqui

    }}
