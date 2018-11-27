package whatfood.whatfood.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

import whatfood.whatfood.R;


public class IngredientesCadastrados extends AppCompatActivity {


    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    ListView ListExibirIngredientes;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredientes_cadastrados);
        inicializarFirebase();

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
