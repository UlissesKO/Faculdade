package com.example.n2_bd_20252;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity implements View.OnClickListener {
    ImageButton btMnuContatos, btMnuMeusDados;
    String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intencao = getIntent();
        Bundle parametros = intencao.getExtras();
        email = parametros.getString("email");

        btMnuContatos = findViewById(R.id.btMnuContatos);
        btMnuMeusDados = findViewById(R.id.btMnuMeusDados);

        btMnuContatos.setOnClickListener(this);
        btMnuMeusDados.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btMnuContatos){
            Intent telaContatos = new Intent(this, MainActivity.class);
            startActivity(telaContatos);
        }
        if (v.getId() == R.id.btMnuMeusDados) {
            Intent telaMeusDados = new Intent(this, MeusDados.class);
            Bundle parametros = new Bundle();
            parametros.putString("email",email);
            telaMeusDados.putExtras(parametros);
            startActivity(telaMeusDados);
        }

    }
}