package com.example.telainicial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pergunta2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pergunta2);
    }

    public void onClickOpcaoErrada(View view) {
        Intent terceiraPergunta = new Intent(this, Pergunta3.class);
        startActivity(terceiraPergunta);
        barraProgresso.setProgress(barraProgresso.getProgress() + 20);
        finish();
    }

    public void onClickOpcaoCerta(View view) {
        Intent terceiraPergunta = new Intent(this, Pergunta3.class);
        startActivity(terceiraPergunta);
        Contador.acertos = +1;
        barraProgresso.setProgress(barraProgresso.getProgress() + 20);
        finish();
    }
}