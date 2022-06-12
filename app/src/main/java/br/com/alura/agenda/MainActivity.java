package br.com.alura.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Toast.makeText(this, "Alan Lopes", Toast.LENGTH_LONG).show();
//        TextView aluno = new TextView(this);
//        aluno.setText("Alan Lopes");
//        setContentView(aluno);
        setContentView(R.layout.activity_main);
    }
}