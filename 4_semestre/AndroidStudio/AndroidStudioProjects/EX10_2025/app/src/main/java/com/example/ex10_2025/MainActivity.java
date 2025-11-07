package com.example.ex10_2025;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton btProfile, btCalendar;

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

        //R. é o arquivo de todas as váriaveis do projeto. ID é uma "pasta"
        btProfile = findViewById(R.id.btProfile);
        btCalendar = findViewById(R.id.btCalendar);

        btProfile.setOnClickListener(this);
        btCalendar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btProfile) {
            //Intent = Criar uma nova tela (Marromeno)
            Intent screen = new Intent(this, Profile.class);
            startActivity(screen);
        }
        if (v.getId() == R.id.btCalendar) {
            Intent screen = new Intent(this, Calendar.class);
            startActivity(screen);
        }

    }
}