package whatfood.whatfood.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import whatfood.whatfood.R;

public class CadastrarIngredientes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_ingredientes);
    }

    public void gravarIngrediente(View v){}

    public void voltarTelaInicial(View v){

        finish();

    }

}
