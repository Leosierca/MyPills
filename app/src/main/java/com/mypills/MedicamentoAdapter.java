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

    FirebaseFirestore fireStore= FirebaseFirestore.getInstance();

    public MedicamentoAdapter(@NonNull FirestoreRecyclerOptions<Medicamento> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull MedicamentoAdapter.ViewHolder holder, int position, @NonNull Medicamento model) {
        DocumentSnapshot medicamentoDocumento= getSnapshots().getSnapshot(holder.getAdapterPosition());
        final String id= medicamentoDocumento.getId();

        holder.txvDoc.setText(id);
        holder.txvNom.setText(model.getNombre());
        holder.txvApe.setText(model.getApellido());


        holder.btnElim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireStore.collection("Medicamentos").document(id).delete();
            }
        });


    }

    @NonNull
    @Override
    public MedicamentoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vista_medicamento,parent,false);

        return new ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txvDoc,txvNom,txvApe;
        Button btnElim;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txvDoc= itemView.findViewById(R.id.txvDoc);
            txvNom= itemView.findViewById(R.id.txvNom);
            txvApe= itemView.findViewById(R.id.txvApe);
            btnElim= itemView.findViewById(R.id.btnElim);
        }
    }
}
