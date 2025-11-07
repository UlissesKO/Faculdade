package com.example.n2_bd_20252;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {
    EditText txtLogEmail, txtLogSenha;
    Button btLogAcessar, btLogCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtLogEmail = findViewById(R.id.txtLogEmail);
        txtLogSenha = findViewById(R.id.txtLogSenha);
        btLogAcessar= findViewById(R.id.btLogAcessar);
        btLogCadastrar = findViewById(R.id.btLogCadastrar);

        btLogAcessar.setOnClickListener(this);
        btLogCadastrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btLogAcessar){
            if (ValidaDados()){
                Intent tela = new Intent(this, Menu.class);
                Bundle parametros = new Bundle();
                parametros.putString("email",txtLogEmail.getText().toString());
                tela.putExtras(parametros);
                startActivity(tela);
                finish();
            }
        }
        if (v.getId() == R.id.btLogCadastrar){
            Intent telaCad = new Intent(this, Cadastre_se.class);
            startActivity(telaCad);
        }
    }
    public boolean ValidaDados() {
        String msg = "";
        if (txtLogEmail.getText().length() == 0){
            msg = "O campo E-mail deve ser preenchido!";
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
            return false;
        }
        if (txtLogSenha.getText().length() == 0){
            msg = "O campo Senha deve ser preenchido!";
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
            return false;
        }

        BancoControllerUsuarios bd = new BancoControllerUsuarios(getBaseContext());
        Cursor dados = bd.carregaDadosLogin(txtLogEmail.getText().toString(),txtLogSenha.getText().toString());

        if (dados.moveToFirst()){
            return true;
        }else{
            msg = "O usuário não está cadastrado no sistema, CADASTRE-SE!";
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
            return false;
        }
    }
}
