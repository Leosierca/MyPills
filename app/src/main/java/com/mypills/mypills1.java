package com.mypills;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

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

    int cantidad = 0;
    public void siguiente(View view) {
        Intent registrousuario = new Intent(this, datosUsuario2.class);
        Intent listadomedicamentos = new Intent(this, MyPills4.class);

       Object datos= mfirestore.collection("Usuario").get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
           @Override
           public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
               cantidad= queryDocumentSnapshots.size();
               if (cantidad >1 ){
                   startActivity(listadomedicamentos);
               }
               else{
                   startActivity(registrousuario);
               }
           }
       });

    }
}