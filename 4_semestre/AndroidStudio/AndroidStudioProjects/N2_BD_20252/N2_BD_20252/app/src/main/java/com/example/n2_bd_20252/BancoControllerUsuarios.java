package com.example.n2_bd_20252;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class BancoControllerUsuarios {
    private SQLiteDatabase db;
    private CriaBanco banco;

    public BancoControllerUsuarios(Context context) {
        banco = new CriaBanco(context);
    }


    // consulta para verificar se o usuario existe na tela de login
    public Cursor carregaDadosLogin(String txtEmail, String txtSenha) {
        Cursor cursor;
        String[] campos = {"codigo", "nome", "email", "senha", "cpf"};
        String where = "email = '" + txtEmail + "' and senha = '" + txtSenha + "'";
        //select codigo, nome, email, senha, cpf from usuarios
        // where email = 'test@test.com' and senha = '123456';
        db = banco.getReadableDatabase();
        cursor = db.query("usuarios", campos, where, null, null, null,
                null, null);
        if (cursor != null) {
            cursor.moveToFirst();
        }

        db.close();
        return cursor;
    }

    public String insereDados(String _txtNome, String _txtCPF, String _txtEmail, String _txtSenha) {
        ContentValues valores;
        long resultado;
        db = banco.getWritableDatabase();

        valores = new ContentValues();
        valores.put("nome", _txtNome);
        valores.put("email", _txtEmail);
        valores.put("cpf", _txtCPF);
        valores.put("senha", _txtSenha);

        resultado = db.insert("usuarios", null, valores);
        db.close();

        if (resultado == -1)
            return "Erro ao inserir registro";
        else
            return "Cadastro efetuado com sucesso!";
    }

    // consulta pelo campo email
    public Cursor carregaDadosEmail(String email) {
        Cursor cursor;
        String[] campos = {"codigo", "nome", "email", "senha", "cpf"};
        String where = "email = '" + email + "'";
        //select codigo, nome, email, senha, cpf from usuarios
        // where email = 'test@test.com';
        db = banco.getReadableDatabase();
        cursor = db.query("usuarios", campos, where, null, null, null,
                null, null);
        if (cursor != null) {
            cursor.moveToFirst();
        }

        db.close();
        return cursor;
    }
}
