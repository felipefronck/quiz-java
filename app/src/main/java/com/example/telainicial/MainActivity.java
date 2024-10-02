package com.example.telainicial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

//    private BarraDeProgresso barraDeProgresso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

//        BarraDeProgresso = findViewById(R.id.barraProgresso);
    }

    public void onIniciarQuizBtnClick(View view){
        Intent primeiraPergunta = new Intent(this, Pergunta1.class);
        startActivity(primeiraPergunta);
    }
}