package com.mypills;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class MainActivity extends AppCompatActivity {

    TextView tvNombre = findViewById(R.id.tvNombre);

    //public static final String TAG = "YOUR-TAG-NAME";
    FirebaseFirestore mfirestore = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a reference to the Usuario collection
        CollectionReference usuariosRef = mfirestore.collection("Usuario");

// Create a query against the collection.
        //Query usuarios =
                mfirestore.collection("Usuario").whereEqualTo("nombre", true)
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {

                        if(task.isSuccessful()){
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Toast.makeText(MainActivity.this,"Registrado correctamente", Toast.LENGTH_LONG).show();

                        }
                        }else{
                            Toast.makeText(MainActivity.this,"no  correcto", Toast.LENGTH_LONG).show();
                            }

                    }
                });





        }

    }




