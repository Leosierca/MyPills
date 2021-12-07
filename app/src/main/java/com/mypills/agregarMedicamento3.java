package com.mypills;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.firebase.firestore.FirebaseFirestore;

import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class agregarMedicamento3 extends AppCompatActivity {

    Spinner mSpiner;
    Spinner mSpiner2;

    EditText nnmedicamento;
    EditText alias;
    EditText dosis;
    EditText Intervalo;
    EditText dias;
    EditText fechaIni;// campo fecha!!!
    EditText horaIni; // campo hora!!!
    EditText Observaciones;
    Button btnGuardarM;

    FirebaseFirestore mfirestore = FirebaseFirestore.getInstance();


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_medicamento3);

            nnmedicamento=findViewById(R.id.txtNnMed);
            alias=findViewById(R.id.txtAlias);
            dosis=findViewById(R.id.numCantxtoma);
            Intervalo=findViewById(R.id.timeIntervalo);
            dias=findViewById(R.id.numDias);
            fechaIni=findViewById(R.id.dateFechaIni);
            horaIni=findViewById(R.id.timeHoraIni);
            Observaciones=findViewById(R.id.txtObservaciones);

            btnGuardarM=findViewById(R.id.btnGuardar3);

            btnGuardarM.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    guardarM();
                }
            });


           //Spiner tipo de presentacion

            mSpiner =(Spinner) findViewById(R.id.spnPresentacion);

            ArrayList<String> elementos=new ArrayList<>();

            elementos.add("Elegir presentacion");
            elementos.add("Pastillas");
            elementos.add("Capsulas");
            elementos.add("Jarabe");
            elementos.add("Sprite");
            elementos.add("Inyeccion");
            elementos.add("Crema");
            elementos.add("Ovulos");
            elementos.add("polvo");

            ArrayAdapter adp=new ArrayAdapter(agregarMedicamento3.this, android.R.layout.simple_spinner_dropdown_item,elementos);

            //Asignar el adaptador al spiner creado
            mSpiner.setAdapter(adp);
            //agregar los listener para saber cuando he seleccionado uno de los elementos de la lista desplegable
            mSpiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    String elemento= (String) mSpiner.getAdapter().getItem(position);

                    // aquí se maneja la información capturada en elemento .... se agrega a db

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            // hasta acá spiner presentacion

            // spiner unidad de medida
            mSpiner2 =(Spinner) findViewById(R.id.spnUnidadMed);

            ArrayList<String> elementos2=new ArrayList<>();

            elementos2.add("Elegir Unidad de medida");
            elementos2.add("gragea");
            elementos2.add("cc");
            elementos2.add("ml");
            elementos2.add("Cucharada");
            elementos2.add("porción");
            elementos2.add("aplicación");
            elementos2.add("puf");
            elementos2.add("inhalación");


            ArrayAdapter adp2=new ArrayAdapter(agregarMedicamento3.this, android.R.layout.simple_spinner_dropdown_item,elementos2);

            //Asignar el adaptador al spiner creado
            mSpiner2.setAdapter(adp2);
            //agregar los listener para saber cuando he seleccionado uno de los elementos de la lista desplegable
            mSpiner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    String elemento2= (String) mSpiner2.getAdapter().getItem(position);

                    // aquí se maneja la información capturada en elemento2 .... se agrega a db

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            // hasta acá spiner unidad de medida

        }

        private void guardarM(){
            Map<String, Object> medicamentos = new HashMap<>();

            medicamentos.put("medicamentos", nnmedicamento.getText().toString());
            medicamentos.put("presentacion", mSpiner.getSelectedItem().toString());
            medicamentos.put("unidadMedida", mSpiner2.getSelectedItem().toString());
            medicamentos.put("alias", alias.getText().toString());
            medicamentos.put("dosis", dosis.getText().toString());
            medicamentos.put("intervalo", Intervalo.getText().toString());
            medicamentos.put("dias", dias.getText().toString());
            medicamentos.put("fechaIni", fechaIni.getText().toString());
            medicamentos.put("hora", horaIni.getText().toString());
            medicamentos.put("observaciones", Observaciones.getText().toString());
            medicamentos.put("estado", "Activo");

            mfirestore.collection("Medicamentos").document(nnmedicamento.getText().toString()).set(medicamentos);
        }























    //Metodo temporal Borrable para visitar pagina3 ejercicio desarrollo
    public void siguiente3(View view) {

        Intent siguiente3 = new Intent(this, MyPills4.class);
        startActivity(siguiente3);
    }
        public void siguiente3r(View view){

            Intent siguiente3r= new Intent(this,datosUsuario2.class);
            startActivity(siguiente3r);
        
    }
    // hasta aqui



}