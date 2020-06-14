package com.example.alterandolayouttransparente;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;

public class MainActivity extends AppCompatActivity {
    Button btTelaRelative;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        carregaTelaMain();

    }
    private void carregaTelaMain() {
        setContentView(R.layout.activity_main);
        carregaWidgetsMain();
    }
    private void carregaWidgetsMain()
    {
        btTelaRelative=(Button)findViewById(R.id.btnAbrirRelative);
        carregaClickMain();
    }
    private void carregaTelaRelative()
    {
        setContentView(R.layout.activity_relative);
    }
    private void carregaClickMain()
    {
        btTelaRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carregaTelaRelative();
            }
        });
    }

}