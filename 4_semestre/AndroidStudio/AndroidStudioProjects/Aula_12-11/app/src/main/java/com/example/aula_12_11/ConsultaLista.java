package com.example.aula_12_11;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.widget.ListView;
import android.widget.Toast;
import java.util.LinkedList;
import java.util.List;

public class Consulta_Lista extends Activity {
    ListView lista;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_lista);
        List<UsuarioModelo> listadados = null ;
        listadados = consultarTodos();
        UsuarioAdapter adaptador = new UsuarioAdapter(this,  listadados);
        lista = (ListView) findViewById(R.id.lista);
        lista.setAdapter(adaptador);
    }

    public List<UsuarioModelo> consultarTodos() {
        List<UsuarioModelo> lista = new LinkedList<UsuarioModelo>();

        BancoControllerContatos bd = new BancoControllerContatos(getBaseContext());
        Cursor dados = bd.consultarTodos() ;

        if(dados != null) {
            do  {
                UsuarioModelo item = new UsuarioModelo();
                item.setCodigo(dados.getInt(0));
                item.setNome(dados.getString(1));
                item.setEmail(dados.getString(2));
                lista.add(item);
            } while(dados.moveToNext());
        }else{
            String msg= "Não há nenhum contato cadastrado!!";
            mensagem(msg);
        }
        return  lista ;
    }


    public void mensagem(String msg) {
        Context contexto = getApplicationContext();
        int duracao = Toast.LENGTH_SHORT;


        Toast toast = Toast.makeText(contexto, msg, duracao);
        toast.show();
    }


}
