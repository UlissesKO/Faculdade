package com.example.calculadorafaculdade;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText n1, n2, res;
    Button btSomar, btSub, btMulti, btDiv;

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
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        res = findViewById(R.id.res);

        btSomar = findViewById(R.id.btSomar);
        btSub = findViewById(R.id.btSub);
        btMulti = findViewById(R.id.btMulti);
        btDiv = findViewById(R.id.btDiv);

        btSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1, num2, numRes = 0;
                num1 = Float.parseFloat(n1.getText().toString());
                num2 = Float.parseFloat(n2.getText().toString());
                numRes = num1 + num2;
                res.setText(""+numRes);

            }
        });
        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1, num2, numRes = 0;
                num1 = Float.parseFloat(n1.getText().toString());
                num2 = Float.parseFloat(n2.getText().toString());
                numRes = num1 - num2;
                res.setText(""+numRes);

            }
        });
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1, num2, numRes = 0;
                num1 = Float.parseFloat(n1.getText().toString());
                num2 = Float.parseFloat(n2.getText().toString());
                numRes = num1 / num2;
                res.setText(""+numRes);

            }
        });
        btMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1, num2, numRes = 0;
                num1 = Float.parseFloat(n1.getText().toString());
                num2 = Float.parseFloat(n2.getText().toString());
                numRes = num1 * num2;
                res.setText(""+numRes);

            }
        });
    }
}