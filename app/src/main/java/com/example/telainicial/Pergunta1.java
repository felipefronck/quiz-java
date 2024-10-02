package com.example.telainicial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pergunta1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pergunta1);
    }

    public void getOnClickOpcaoErrada(View view) {
        Intent segundaPergunta = new Intent(this, Pergunta2.class);
        startActivity(segundaPergunta);

    }

    public void onClickOpcaoCerta (View view) {
        Intent segundaPergunta = new Intent(this, Pergunta2.class);
        startActivity(segundaPergunta);
    }
}