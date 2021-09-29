package cl.grupost.eval1androidgrupal;

import java.io.Serializable;

public class TarjetaChip implements Serializable {
    public int idTarjeta;
    public int saldo;

    public TarjetaChip(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "TarjetaChip{" +
                "idTarjeta=" + idTarjeta +
                ", saldo=" + saldo +
                '}';
    }

    public void cargarSaldo(int monto){
        this.saldo = this.getSaldo()+monto;
    }
}
