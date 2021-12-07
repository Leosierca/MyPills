package com.mypills;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class datosUsuario2 extends AppCompatActivity {

    private EditText etNombre, etnEdad, etDireccion, etTelefono, etTelefonoCon, etRh, etAntecedentes;
    private Button btnGuardar;

    FirebaseFirestore firestore = FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_usuario2);

        etNombre=findViewById(R.id.et_nn);
        etnEdad=findViewById(R.id.etn_edad);
        etDireccion=findViewById(R.id.et_direccion);
        etTelefono=findViewById(R.id.et_telefono);
        etTelefonoCon=findViewById(R.id.et_telefonoCont);
        etRh=findViewById(R.id.et_rh);
        etAntecedentes=findViewById(R.id.et_antecedentes);

        btnGuardar=findViewById(R.id.btn_guardar2);


    btnGuardar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            guardar();


        }
    });





    }


    private void guardar(){
        Map<String, Object> usuario = new HashMap<>();


        usuario.put("nombre",etNombre.getText().toString());
        usuario.put("edad",etnEdad.getText().toString());
        usuario.put("direccion", etDireccion.getText().toString());
        usuario.put("telefono", etTelefono.getText().toString());
        usuario.put("telefonoContacto", etTelefonoCon.getText().toString());
        usuario.put("rh", etRh.getText().toString());
        usuario.put("antecedentes", etAntecedentes.getText().toString());

        firestore.collection("Usuario").document(etNombre.getText().toString()).set(usuario);

        Intent siguiente2= new Intent(this,agregarMedicamento3.class);
        startActivity(siguiente2);

    }

    /* funcion para eliminar de acuerdo al campo nombre--- va relacionado con un boton eliminar
    private void eliminar(){
        Map<String, Object> usuario = new HashMap<>();

        firestore.collection("Usuario").document(etNombre.getText().toString()).delete();
    }*/










   public void siguiente2r(View view){

        Intent siguiente2r= new Intent(this,mypills1.class);
        startActivity(siguiente2r);
    }

    // hasta aqui

}