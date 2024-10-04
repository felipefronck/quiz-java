package com.example.telainicial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pergunta1 extends AppCompatActivity {

    private ProgressBar barraProgresso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pergunta1);

        barraProgresso = findViewById(R.id.barraProgresso);
    }

    public void onClickOpcaoErrada(View view) {
        Intent segundaPergunta = new Intent(this, Pergunta2.class);
        startActivity(segundaPergunta);
        barraProgresso.setProgress(barraProgresso.getProgress() + 20);
        finish();
    }

    public void onClickOpcaoCerta (View view) {
        Intent segundaPergunta = new Intent(this, Pergunta2.class);
        startActivity(segundaPergunta);
        Contador.acertos =+ 1;
        barraProgresso.setProgress(barraProgresso.getProgress() + 20);
        finish();
    }
}