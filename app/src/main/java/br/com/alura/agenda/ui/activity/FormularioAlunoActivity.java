package br.com.alura.agenda.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.alura.agenda.R;
import br.com.alura.agenda.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);

        // final - colocar quando estiver usando via variavel local
        final EditText campoNome = findViewById(R.id.activity_formulario_aluno_nome);
        final EditText campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone);
        final EditText campoEmail = findViewById(R.id.activity_formulario_aluno_email);



        Button botaoSalvar = findViewById(R.id.activity_formulario_aluno_botao_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strNome = campoNome.getText().toString();
                String strTelefone = campoTelefone.getText().toString();
                String strEmail = campoEmail.getText().toString();

                Aluno alunoCriado = new Aluno(strNome, strTelefone, strEmail);

                Toast.makeText(FormularioAlunoActivity.this,
                        alunoCriado.getStrNome() + " - " + alunoCriado.getStrTelefone() + " - " + alunoCriado.getStrEmail(),
                        Toast.LENGTH_LONG).show();

//                Toast.makeText(FormularioAlunoActivity.this, "Cliquei no botao salvar", Toast.LENGTH_SHORT).show();
            }
        });
    }
}