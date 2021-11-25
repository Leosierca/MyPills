package com.mypills;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.text.DateFormat;

public class Calendario8 extends AppCompatActivity {

    private TextView txtV;
    private ListView lstV;
    //datos que vienen de un consumo de servicios
    private String [] medicamentos ={"Ibuprofeno 800 mg  80:30 am 1 pastilla","Insulina 6:00 pm 20 unidades", "Losartan 50mg 8:00 pm 1 pastilla"};
    private String [] hora={"80:30 a.m.","6:00 pm", "8:00 p.m" };
    private String [] cantidad ={"1 pastilla","20 unidades","1 pastilla"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario8);

        /*txtV=findViewById(R.id.tv_titulo8); campo dejercicio para trabajar evento*/
        lstV =findViewById(R.id.lv_calend8);

        //aqui se utiliza  el formato creado en layout itemdelista
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.itemdelista,medicamentos);
        lstV.setAdapter(adapter);

        //evento que cuando se haga clic en un campo ejecute algo, en este caso impresion en txtV
        lstV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //accion a ejecutar
               /* txtV.setText("El producto es: "+medicamentos[position]+". Tomar a las: "+hora[position]+". Cantidad: "+cantidad[position]);*/

            }
        });

    }
}