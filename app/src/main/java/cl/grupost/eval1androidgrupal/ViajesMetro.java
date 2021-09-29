package cl.grupost.eval1androidgrupal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ViajesMetro extends AppCompatActivity {

    RecyclerView recyclerViajesMetro;
    AdaptadorViaje adaptadorViaje;
    private ArrayList<Viaje> viajes;
    private TarjetaChip tarjetaChip;
    private TextView serie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viajes_metro);

        tarjetaChip = (TarjetaChip) getIntent().getSerializableExtra("tarjetaChip");
        viajes = (ArrayList<Viaje>) getIntent().getSerializableExtra("viajes");
        serie = (TextView) findViewById(R.id.tvTarjetaID);
        serie.setText(String.valueOf(tarjetaChip.getIdTarjeta()));


        recyclerViajesMetro = findViewById(R.id.listaViajesMetro);
        recyclerViajesMetro.setLayoutManager(new LinearLayoutManager(this));

        adaptadorViaje = new AdaptadorViaje(viajes);
  //      recyclerViajesMetro.setAdapter(adaptadorViaje);

    }
}