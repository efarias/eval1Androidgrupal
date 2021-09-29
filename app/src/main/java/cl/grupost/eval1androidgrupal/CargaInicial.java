package cl.grupost.eval1androidgrupal;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CargaInicial extends AppCompatActivity {
    private int numero;
    private TarjetaChip tarjetaChip;
    private EditText txtMontoInicial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carga_inicial);

        numero = (int)(Math.random()*1000000+1);
        tarjetaChip = new TarjetaChip(numero);

        txtMontoInicial = (EditText) findViewById(R.id.txtMontoInicial);

    }

    public void cargaInicial(View view) {
        Integer monto = Integer.parseInt(txtMontoInicial.getText().toString());

        if (monto >= 5000){
            tarjetaChip.setSaldo(monto);
            String texto = "Se han cargado "+ String.valueOf(tarjetaChip.getSaldo());
            Toast.makeText(this,texto,Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Monto mínimo $5.000",Toast.LENGTH_LONG).show();
            txtMontoInicial.setText("");
        }

        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("tarjetaChip",tarjetaChip);
        startActivity(intent);



    }
}