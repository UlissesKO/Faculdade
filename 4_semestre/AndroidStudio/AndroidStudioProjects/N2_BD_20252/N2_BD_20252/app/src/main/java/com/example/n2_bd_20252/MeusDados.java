package com.example.n2_bd_20252;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MeusDados extends AppCompatActivity {
    String email;
    EditText txtMeuNome, txtMeuCpf, txtMeuEmail, txtMeuSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_dados);

        Intent intencao = getIntent();
        Bundle parametros = intencao.getExtras();
        email = parametros.getString("email");

        txtMeuNome = findViewById(R.id.txtMeuNome);
        txtMeuCpf = findViewById(R.id.txtMeuCPF);
        txtMeuEmail = findViewById(R.id.txtMeuEmail);
        txtMeuSenha = findViewById(R.id.txtMeuSenha);

        //Toast.makeText(this,email,Toast.LENGTH_LONG).show();
        BancoControllerUsuarios bd = new BancoControllerUsuarios(getBaseContext());
        Cursor dados = bd.carregaDadosEmail(email);

        if (dados.moveToFirst()){
            txtMeuNome.setText(dados.getString(1));
            txtMeuCpf.setText(dados.getString(4));
            txtMeuEmail.setText(dados.getString(2));
            txtMeuSenha.setText(dados.getString(3));

        }
    }
}