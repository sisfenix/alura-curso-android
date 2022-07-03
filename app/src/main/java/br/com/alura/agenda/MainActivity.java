package br.com.alura.agenda;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class MainActivity extends Activity {
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Lista de Alunos");
//        Toast.makeText(this, "Alan Lopes", Toast.LENGTH_LONG).show();
//        -------------------------------------------------------------
//        TextView aluno = new TextView(this);
//        aluno.setText("Alan Lopes");
//        setContentView(aluno);
        setContentView(R.layout.activity_main);
        List<String> alunos = new ArrayList<>(
                Arrays.asList("Alex", "Fran", "Jose", "Maria", "Ana", "Alan"));
//        TextView primeiroAluno = findViewById(R.id.textView);
//        TextView segundoAluno  = findViewById(R.id.textView2);
//        TextView terceiroAluno = findViewById(R.id.textView3);
//        primeiroAluno.setText(alunos.get(0));
//        segundoAluno.setText(alunos.get(1));
//        terceiroAluno.setText(alunos.get(2));
        //findViewById(R.id.activity_main_lista_de_alunos)
        ListView listaDeAlunos = findViewById(R.id.activity_main_lista_de_alunos);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                alunos));
    }
}