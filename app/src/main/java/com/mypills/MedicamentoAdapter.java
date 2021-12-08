package com.mypills;

        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

        import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
        import com.firebase.ui.firestore.FirestoreRecyclerOptions;
        import com.google.firebase.firestore.DocumentSnapshot;
        import com.google.firebase.firestore.FirebaseFirestore;
        import com.mypills.modelo.Medicamento;


public class MedicamentoAdapter extends FirestoreRecyclerAdapter<Medicamento, MedicamentoAdapter.ViewHolder>{
//enlace a la base de datos
    FirebaseFirestore fireStore= FirebaseFirestore.getInstance();
//constructor
    public MedicamentoAdapter(@NonNull FirestoreRecyclerOptions<Medicamento> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull MedicamentoAdapter.ViewHolder holder, int position, @NonNull Medicamento model) {
        //obtenemos el documento y el id y se lo pasamos al holder
        DocumentSnapshot medicamentoDocumento= getSnapshots().getSnapshot(holder.getAdapterPosition());
        final String id= medicamentoDocumento.getId();

        holder.txvNom.setText(id);
        holder.txvNom.setText(model.getNombre());
        holder.txvPresentacion.setText(model.getPresentacion());
        holder.txvAlias.setText(model.getAlias());
        holder.txvDosis.setText(model.getDosis());
        holder.txvFrecuencia.setText(model.getIntervalo());
        holder.txvPeriodo.setText(model.getDias());
        holder.txvHora.setText(model.getHora());



        holder.btnElim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireStore.collection("Medicamentos").document(id).delete();
            }
        });


    }
//definimos la vista entregandole la vista medicamento
    @NonNull
    @Override
    public MedicamentoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vista_medicamento,parent,false);

        return new ViewHolder(view);
    }
    //clase viewHolder
//recicler view
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txvNom,txvPresentacion, txvAlias, txvDosis, txvFrecuencia, txvPeriodo, txvHora;
        Button btnElim;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
//definimos los elementos del item y lo relacionamos con la interfas
            //txvDoc= itemView.findViewById(R.id.txvDoc);***lo comento para ver resultados en otro lado
            txvNom= itemView.findViewById(R.id.txvNom);
            txvPresentacion=itemView.findViewById(R.id.txvPresentacion);
            txvAlias =itemView.findViewById(R.id.txvAlias);
            txvDosis =itemView.findViewById(R.id.txvDosis);
            txvFrecuencia =itemView.findViewById(R.id.txvFrecuencia);
            txvPeriodo =itemView.findViewById(R.id.txvPeriodo);
            txvHora =itemView.findViewById(R.id.txvHora);

            btnElim= itemView.findViewById(R.id.btnElim);

        }
    }
}
