package cl.grupost.eval1androidgrupal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class HistorialPagos extends AppCompatActivity {
    private TarjetaChip tarjetaChip;
    private ArrayList<Viaje> viajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial_pagos);

        tarjetaChip = (TarjetaChip) getIntent().getSerializableExtra("tarjetaChip");
        viajes = (ArrayList<Viaje>) getIntent().getSerializableExtra("viajes");
    }

    public void historialMetro(View view) {
        Intent intent = new Intent(this,ViajesMetro.class);
        intent.putExtra("tarjetaChip",tarjetaChip);
        intent.putExtra("viajes",viajes);
        startActivity(intent);

    }

    public void historialTaxi(View view) {
        Intent intent = new Intent(this,ViajesMetro.class);
        intent.putExtra("tarjetaChip",tarjetaChip);
        intent.putExtra("viajes",viajes);
        startActivity(intent);

    }
}