package com.example.telainicial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pergunta5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pergunta5);
    }

    public void onClickOpcaoErrada(View view) {
        Intent resultado = new Intent(this, Resultado.class);
        startActivity(resultado);
        finish();
    }

    public void onClickOpcaoCerta(View view) {
        Intent resultado = new Intent(this, Resultado.class);
        startActivity(resultado);
        Contador.acertos = +1;
        finish();
    }
}