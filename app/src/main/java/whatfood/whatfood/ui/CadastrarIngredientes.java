package whatfood.whatfood.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import whatfood.whatfood.R;

public class CadastrarIngredientes extends AppCompatActivity {

    EditText edtNomeIngrediente;
    EditText edtQuantidade;
    Spinner spnMedidaQuantidade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_ingredientes);

        edtNomeIngrediente = (EditText)findViewById(R.id.edtNomeIngrediente);
        edtQuantidade = (EditText)findViewById(R.id.edtQuantidade);
        spnMedidaQuantidade = (Spinner)findViewById(R.id.spnMedidaQuantidade);
    }


    public void gravarIngrediente(View v){

        Toast.makeText(getApplicationContext(), "Ingrediente cadastrado com sucesso !", Toast.LENGTH_SHORT).show();

    }

    public void voltarTelaInicial(View v){

        finish();

    }

}
