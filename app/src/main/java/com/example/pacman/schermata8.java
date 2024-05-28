package com.example.pacman;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class schermata8 extends AppCompatActivity
{
    // Dichiarazione variabili
    private Button schermata1;
    private Button schermata9;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // Nascondi la barra di stato e attiva la modalità schermo intero
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        // Imposta l'orientamento del display su orizzontale
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // Rimuovi il bordo attorno alla visualizzazione
        //EdgeToEdge.enable(this);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);

        // Imposta il layout della tua attività
        setContentView(R.layout.activity_schermata1)  ;

        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------

        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_schermata8);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //codice per spostamento a schermata1----------------------------------------------------
        schermata1 = findViewById(R.id.BottoneX);
        schermata1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(schermata8.this, schermata1.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        //codice per spostamento a schermata1----------------------------------------------------
        schermata1 = findViewById(R.id.BottoneAnnulla8);
        schermata1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(schermata8.this, schermata1.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        //codice per spostamento a schermata1----------------------------------------------------
        schermata9 = findViewById(R.id.BottoneContinua8);
        schermata9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(schermata8.this, schermata9.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });
    }
}