package com.mypills;

//el xml solo tiene un reclicle view



        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.os.Bundle;

        import com.firebase.ui.firestore.FirestoreRecyclerOptions;
        import com.google.firebase.firestore.FirebaseFirestore;
        import com.google.firebase.firestore.Query;
        import com.mypills.modelo.Medicamento;


public class MostrarDatosActivity extends AppCompatActivity{

    RecyclerView rv;
    MedicamentoAdapter adapter;
    FirebaseFirestore firestore= FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);
//se relaciona el activiti con el recicler view
        rv= findViewById(R.id.rvMedicamentos);
//con el recicler V hacemos que se repita el item
        rv.setLayoutManager(new LinearLayoutManager(this));

//se trae la coleccion del firestore
        Query query = firestore.collection("Medicamentos");//aqui se puede especificar queri
//hace que el resultado se vaya al reclicler
        FirestoreRecyclerOptions<Medicamento> firestoreRO = new FirestoreRecyclerOptions.Builder<Medicamento>().setQuery(query,Medicamento.class).build();

        adapter= new MedicamentoAdapter(firestoreRO);
        adapter.notifyDataSetChanged();//cuando se elimine o agregue se actualice rapidamente
        rv.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}