package com.example.telainicial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pergunta4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pergunta4);
    }

    public void onClickOpcaoErrada(View view) {
        Intent quintaPergunta = new Intent(this, Pergunta5.class);
        startActivity(quintaPergunta);
        finish();
    }

    public void onClickOpcaoCerta(View view) {
        Intent quintaPergunta = new Intent(this, Pergunta5.class);
        startActivity(quintaPergunta);
        Contador.acertos = +1;
        finish();
    }
}
