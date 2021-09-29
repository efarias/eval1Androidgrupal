package cl.grupost.eval1androidgrupal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class CargarSaldo extends AppCompatActivity {
    private TarjetaChip tarjetaChip;
    private EditText txtMontoCarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cargar_saldo);
        tarjetaChip = (TarjetaChip) getIntent().getSerializableExtra("tarjetaChip");

        txtMontoCarga = (EditText) findViewById(R.id.txtMontoCarga);
    }


    public void cargarSaldos(View view) {
        Integer monto = Integer.valueOf(txtMontoCarga.getText().toString());

        if (monto >= 1000){
            int saldo = tarjetaChip.getSaldo() + monto;
            tarjetaChip.setSaldo(saldo);
            String texto = "Su saldo ahora es de "+ String.valueOf(tarjetaChip.getSaldo());
            Toast.makeText(this,texto,Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Monto mínimo $1.000",Toast.LENGTH_LONG).show();
            txtMontoCarga.setText("");
        }

        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("tarjetaChip",tarjetaChip);
        startActivity(intent);
    }
}