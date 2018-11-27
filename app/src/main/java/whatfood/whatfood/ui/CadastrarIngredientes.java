package whatfood.whatfood.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

import whatfood.whatfood.R;
import whatfood.whatfood.model.IngredienteUsuario;

public class CadastrarIngredientes extends AppCompatActivity {

    EditText edtNomeIngrediente;
    EditText edtQuantidade;
    Spinner spnMedidaQuantidade;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_ingredientes);

        edtNomeIngrediente = (EditText)findViewById(R.id.edtNomeIngrediente);
        edtQuantidade = (EditText)findViewById(R.id.edtQuantidade);
        spnMedidaQuantidade = (Spinner)findViewById(R.id.spnMedidaQuantidade);

        inicializarFirebase();

    }

    private void inicializarFirebase(){
        FirebaseApp.initializeApp(CadastrarIngredientes.this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        firebaseDatabase.setPersistenceEnabled(true);
        databaseReference = firebaseDatabase.getReference();

    }


    public void gravarIngrediente(View v){

        IngredienteUsuario ingrediente = new IngredienteUsuario();
        ingrediente.setId(UUID.randomUUID().toString());
        ingrediente.setNomeIngrediente(edtNomeIngrediente.getText().toString());
        ingrediente.setQuantidade(edtQuantidade.getText().toString());
        ingrediente.setMedidaQuantidade(spnMedidaQuantidade.getSelectedItem().toString());
        databaseReference.child("IngredienteUsuario").child(ingrediente.getId()).setValue(ingrediente);
        Toast.makeText(getApplicationContext(), "Ingrediente cadastrado com sucesso !", Toast.LENGTH_SHORT).show();

        edtNomeIngrediente.setText("");
        edtQuantidade.setText("");
    }

    public void voltarTelaInicial(View v){

        finish();

    }

}
