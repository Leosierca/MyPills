package com.mypills;

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

        rv= findViewById(R.id.rvPersonas);

        rv.setLayoutManager(new LinearLayoutManager(this));


        Query query = firestore.collection("Medicamentos");//aqui se puede especificar queri

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