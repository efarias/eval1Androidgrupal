package cl.grupost.eval1androidgrupal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtSaldo;
    private TextView txtSerie;
    private TarjetaChip tarjetaChip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tarjetaChip = (TarjetaChip) getIntent().getSerializableExtra("tarjetaChip");


        txtSaldo = (TextView) findViewById(R.id.txtSaldo);

        txtSaldo.setText(String.valueOf(tarjetaChip.getSaldo()));
    }

    public void ActcargarSaldo(View view) {
        Intent intent = new Intent(this,CargarSaldo.class);
        intent.putExtra("tarjetaChip",tarjetaChip);
        startActivity(intent);
    }
}