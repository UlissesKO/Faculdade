package com.example.time_date_picker;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
//                                                  O implements quer dizer que vai ficar na escuta
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btShow;
    DatePicker dpDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btShow = findViewById(R.id.btShow); //Caso fique com erro tem que salvar tudo
        dpDate = findViewById(R.id.dpDate);

        btShow.setOnClickListener(this); //Fala que o botão em questão vai ficar em modo listening
    }

    @Override
    public void onClick(View v) {
        int Dia = dpDate.getMonth() + 1;
        String dados = "Você vai se fuder no dia: " + dpDate.getDayOfMonth() + "/" + Dia + "/" + dpDate.getYear() + "\n HaHa";

        AlertDialog.Builder dialogo = new AlertDialog.Builder(this); //Vai criar um PopUp
        dialogo.setTitle("----Rufem os tambores!----");
        dialogo.setMessage(dados);
        dialogo.setNeutralButton("Fechar", null);
        dialogo.show();
    }
}