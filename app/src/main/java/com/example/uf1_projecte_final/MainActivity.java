package com.example.uf1_projecte_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //FEM VISIBLES ELS BOTONS D'HISTORIA I EL DE COMENÇAR EL JOC
        Button b_historia = (Button) findViewById(R.id.btn_historia);
        Button b_joc = (Button) findViewById(R.id.btn_inici_joc);

        //ACCIÓ AL FER CLICK AL BOTO DE COMENÇAR
        b_joc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CREEM EL INTENT QUE ENS PORTARA A LA PAG PER COMENÇAR EL JOC
                Intent intent = new Intent( MainActivity.this, PreguntesJoc1.class);
                //S'EXECUTA L'INTENT
                startActivity(intent);
            }
        });

        //ACCIÓ AL FER CLICK AL BOTO D'HISTORIA
        b_historia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CREEM EL INTENT QUE ENS PORTARA A LA PAG D'HISTORIA
                Intent intent = new Intent( MainActivity.this, Historia.class);
                //S'EXECUTA L'INTENT
                startActivity(intent); //executar intent
            }
        });

    }
}