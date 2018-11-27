package whatfood.whatfood.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import whatfood.whatfood.R;


public class IngredientesCadastrados extends AppCompatActivity {

    ListView listV_dados;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    private List<IngredientesCadastrados> listar = new ArrayList<IngredientesCadastrados>();
    private ArrayAdapter<IngredientesCadastrados> arrayAdapterIngredientesCadastrados;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredientes_cadastrados);

        eventoDatabase();
        inicializarFirebase();

    }

    private void eventoDatabase(){
        databaseReference.child("IngredienteUsuario").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                listar.clear();
                for (DataSnapshot objSnapshot:dataSnapshot.getChildren()){
                    IngredientesCadastrados c = objSnapshot.getValue(IngredientesCadastrados.class
                    );
                    listar.add(c);
                }
                arrayAdapterIngredientesCadastrados = new ArrayAdapter<IngredientesCadastrados>(IngredientesCadastrados.this,
                        android.R.layout.simple_list_item_1,listar);
                listV_dados.setAdapter(arrayAdapterIngredientesCadastrados);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void inicializarFirebase(){
        FirebaseApp.initializeApp(IngredientesCadastrados.this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        firebaseDatabase.setPersistenceEnabled(true);
        databaseReference = firebaseDatabase.getReference();

    }

    public void CadastrarIngrediente(View v) {
        Intent intent = new Intent(this, CadastrarIngredientes.class);
        startActivity(intent);
        finish();
    }

    public void DeletarIngrediente(View v) {

    }

}
