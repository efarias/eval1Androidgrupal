package cl.grupost.eval1androidgrupal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PagarPasaje extends AppCompatActivity {
    private ArrayList<Viaje> viajes;
    private TarjetaChip tarjetaChip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagar_pasaje);
        tarjetaChip = (TarjetaChip) getIntent().getSerializableExtra("tarjetaChip");
        viajes = (ArrayList<Viaje>) getIntent().getSerializableExtra("viajes");

    }

    public void pagarMetro(View view) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();

        int saldo = tarjetaChip.getSaldo();


        if (saldo > 750){
            tarjetaChip.setSaldo(saldo - 750);
            viajes.add(new Viaje(750,"Metro",date.toString()));

            String texto = String.valueOf(tarjetaChip.getSaldo());
            Toast.makeText(this,texto,Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,"No tiene saldo suficiente",Toast.LENGTH_LONG).show();
        }

        volverHome();
    }

    private void volverHome() {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("viajes",viajes);
        intent.putExtra("tarjetaChip",tarjetaChip);
        startActivity(intent);
    }

    public void pagarTaxi(View view) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();

        int saldo = tarjetaChip.getSaldo();


        if (saldo > 600){
            tarjetaChip.setSaldo(saldo - 600);
            viajes.add(new Viaje(600,"Metro",date.toString()));

            String texto = String.valueOf(tarjetaChip.getSaldo());
            Toast.makeText(this,texto,Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,"No tiene saldo suficiente",Toast.LENGTH_LONG).show();
        }

        volverHome();
    }
}