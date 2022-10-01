package com.cidead.pmdm.proyecto001campodetextoyboton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarMensaje (View v) {
        System.out.print("Se ha pulsado un botón");
    }
}