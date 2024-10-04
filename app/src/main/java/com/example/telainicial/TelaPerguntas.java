package com.example.telainicial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class TelaPerguntas extends AppCompatActivity implements View.OnClickListener {

    ProgressBar barraProgresso;
    TextView pergunta;
    Button resp1, resp2, resp3, resp4;

    int certas = 0;
    int erradas = 0;
    int progressoBarra = 0;
    int perguntaAtual = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_telaperguntas);

        barraProgresso = findViewById(R.id.barraProgresso);
        pergunta = findViewById(R.id.pergunta);
        resp1 = findViewById(R.id.resp1);
        resp2 = findViewById(R.id.resp2);
        resp3 = findViewById(R.id.resp3);
        resp4 = findViewById(R.id.resp4);

        barraProgresso.setProgress(progressoBarra);

        resp1.setOnClickListener(this);
        resp2.setOnClickListener(this);
        resp3.setOnClickListener(this);
        resp4.setOnClickListener(this);

        carregarPergunta();
    }

    public void carregarPergunta(){

        if(perguntaAtual == 5){
            exibirResultado();
        }

        pergunta.setText(Perguntas.perguntas[perguntaAtual]);
        resp1.setText(Perguntas.respostas[perguntaAtual][0]);
        resp2.setText(Perguntas.respostas[perguntaAtual][1]);
        resp3.setText(Perguntas.respostas[perguntaAtual][2]);
        resp4.setText(Perguntas.respostas[perguntaAtual][3]);
    }

    @Override
    public void onClick(View view) {
        Button escolhaFeita = (Button) view;
        String conteudoEscolha = escolhaFeita.getText().toString();

        if(conteudoEscolha.equals(Perguntas.respostasCertas[perguntaAtual])){
            certas++;
        } else {
            erradas++;
        }

        perguntaAtual++;
        progressoBarra = barraProgresso.getProgress() + 20;
        barraProgresso.setProgress(progressoBarra);
        carregarPergunta();
    }

    public void exibirResultado() {
        String mensagemFinal = "";

        if(certas == 5){
           mensagemFinal = "Incrível! Você acertou todas as perguntas!";
        } else if(certas == 4 || certas == 3){
            mensagemFinal = "Ótimo trabalho! Você foi muito bem!";
        } else{
            mensagemFinal = "Não se preocupe, continue praticando!";
        }

        Intent telaResultado = new Intent(this, Resultado.class);
        telaResultado.putExtra("mensagemFinal", mensagemFinal);
        telaResultado.putExtra("certas", certas);
        startActivity(telaResultado);
        finish();
    }
}