package com.wesolsv.jokenpogame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void opcao(View view){
        switch (view.getId()) {
            case 2131231212:
                this.opcaoSelecionada("pedra");
                break;
            case 2131231211:
                this.opcaoSelecionada("papel");;
                break;
            case 2131231213:
                this.opcaoSelecionada("tesoura");
                break;
        }
    }

    public void opcaoSelecionada(String opcaoSelecionada){
        ImageView imageResultado = findViewById(R.id.resultadoImg);

        String[] opcoesApp = {"pedra","papel","tesoura"};
        String escolhaApp = opcoesApp[(int) (Math.random() * 3)];

        switch (escolhaApp){
            case "pedra":
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imageResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
        }


    }
}