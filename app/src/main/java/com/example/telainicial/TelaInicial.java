package com.example.telainicial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class TelaInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.telainicial);
    }

    public void onIniciarQuizBtnClick(View view){
        Intent primeiraPergunta = new Intent(this, TelaPerguntas.class);
        startActivity(primeiraPergunta);
        finish();
    }
}