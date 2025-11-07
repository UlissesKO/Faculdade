package com.example.n2_bd_20252;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cadastre_se extends AppCompatActivity implements View.OnClickListener {
    EditText txtCadNome, txtCadCPF, txtCadEmail, txtCadSenha, txtCadConfSenha;
    Button btCadGravar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastre_se);

        txtCadNome = findViewById(R.id.txtCadNome);
        txtCadCPF  = findViewById(R.id.txtCadCPF);
        txtCadEmail  = findViewById(R.id.txtCadEmail);
        txtCadSenha  = findViewById(R.id.txtCadSenha);
        txtCadConfSenha  = findViewById(R.id.txtCadConfSenha);
        btCadGravar = findViewById(R.id.btCadGravar);

        btCadGravar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (ValidaDados()) {
            // gravar os dados
            BancoControllerUsuarios bd = new BancoControllerUsuarios(getBaseContext());
            String resultado;

            resultado = bd.insereDados(txtCadNome.getText().toString(),
                                        txtCadCPF.getText().toString(),
                                        txtCadEmail.getText().toString(),
                                        txtCadSenha.getText().toString());

            Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();

            if (resultado.equals("Cadastro efetuado com sucesso!")){
                finish();
            }

        }
    }

    public boolean ValidaDados() {
        String msg = "";
        if (txtCadNome.getText().length() == 0) {
            msg = "Atenção - O campo Nome deve ser preenchido!";
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
            return false;
        }
        if (txtCadCPF.getText().length() == 0) {
            msg = "Atenção - O campo CPF deve ser preenchido!";
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
            return false;
        }
        if (txtCadEmail.getText().length() == 0) {
            msg = "Atenção - O campo E-mail deve ser preenchido!";
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
            return false;
        }
        if (txtCadSenha.getText().length() == 0) {
            msg = "Atenção - O campo Senha deve ser preenchido!";
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
            return false;
        }
        if (txtCadConfSenha.getText().length() == 0) {
            msg = "Atenção - O campo Confirma Senha deve ser preenchido!";
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
            return false;
        }
        if (!txtCadSenha.getText().toString().equals(txtCadConfSenha.getText().toString())){
            msg = "Atenção - As senhas não estão iguais!";
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }
}