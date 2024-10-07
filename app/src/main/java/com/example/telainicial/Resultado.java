package com.example.telainicial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Resultado extends AppCompatActivity {

    TextView textoFinal;
    TextView numAcertos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_resultado);

        textoFinal = findViewById(R.id.textoFinal);
        numAcertos = findViewById(R.id.numAcertos);

        String mensagemFinal = getIntent().getStringExtra("mensagemFinal");
        int acertos = getIntent().getIntExtra("certas", 0);


        textoFinal.setText(mensagemFinal);
        numAcertos.setText(String.valueOf(acertos));
    }

    public void onClickReiniciar(View view) {
        Intent primeiraPergunta = new Intent(this, TelaPerguntas.class);
        startActivity(primeiraPergunta);
        finish();
    }
}