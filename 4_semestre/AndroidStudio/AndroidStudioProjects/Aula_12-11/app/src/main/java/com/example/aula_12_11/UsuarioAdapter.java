package com.example.aula_12_11;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


public class UsuarioAdapter extends ArrayAdapter<UsuarioModelo>{
    private Context context;
    private List<UsuarioModelo> lista = null;

    public UsuarioAdapter(Context context,  List<UsuarioModelo> lista) {
        super(context,0, lista);
        this.lista = lista;
        this.context = context;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        UsuarioModelo dados = lista.get(position);


        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.layout_lista, null);
        }


        TextView textViewCodigo = (TextView) view.findViewById(R.id.codigo);
        textViewCodigo.setText(String.valueOf(dados.getCodigo()));


        TextView textViewNome = (TextView) view.findViewById(R.id.nome);
        textViewNome.setText(dados.getNome());


        TextView textViewData = (TextView)view.findViewById(R.id.email);
        textViewData.setText(dados.getEmail());


        return view;
    }
}
