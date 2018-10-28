package whatfood.whatfood.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import whatfood.whatfood.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exibirReceitas(View v){

        Intent intent = new Intent(this, ExibirReceitas.class);
        startActivity(intent);


    }

    public void cadastrarIngredientes(View v){

        Intent intent = new Intent(this, CadastrarIngredientes.class);
        startActivity(intent);


    }

    public void ingredientesCadastrados(View v){

        Intent intent = new Intent(this, IngredientesCadastrados.class);
        startActivity(intent);

    }

    private AlertDialog alerta;

    private void mensagemSobre() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("What Food");

        builder.setMessage("Aplicativo desenvolvido na disciplina de programação para dispositivos móveis. " +
                           "O aplicativo tem como objetivo sugerir receitas a partir de ingredientes cadastrados pelo usuário. " +
                           "Acadêmicos desenvolvedores: Eduardo Ludwig e Jonathan Dalpiaz");

        builder.setPositiveButton("Fechar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });
        alerta = builder.create();
        alerta.show();
    }
    public void sobreAplicativo(View v){
        mensagemSobre();
    }
}
