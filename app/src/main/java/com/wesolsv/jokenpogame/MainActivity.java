package com.wesolsv.jokenpogame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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
                this.opcaoSelecionada("papel");
                break;
            case 2131231213:
                this.opcaoSelecionada("tesoura");
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }

    public void opcaoSelecionada(String opcaoUsuario){
        ImageView imageResultado = findViewById(R.id.resultadoImg);
        TextView resultado = findViewById(R.id.resultadoTxt);

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

        if(     (escolhaApp.equals("tesoura")  && opcaoUsuario.equals("papel") )||
                (escolhaApp.equals("papel") && opcaoUsuario.equals("pedra") )||
                (escolhaApp.equals("pedra") && opcaoUsuario.equals("tesoura"))
        ){
            resultado.setText(getString(R.string.you_lose));

        }else if((opcaoUsuario.equals("tesoura") && escolhaApp.equals("papel")) ||
                (opcaoUsuario.equals("papel") && escolhaApp.equals("pedra")) ||
                (opcaoUsuario.equals("pedra") && escolhaApp.equals("tesoura") )){
            resultado.setText(getString(R.string.you_win));
        }else {
            resultado.setText(getString(R.string.a_tie));
        }

    }
}