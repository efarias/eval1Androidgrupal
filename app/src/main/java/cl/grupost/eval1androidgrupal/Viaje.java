package cl.grupost.eval1androidgrupal;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Viaje implements Serializable {
    int valor;
    String tipo;
    String hora;

    public Viaje(int valor, String tipo, String hora) {
        this.valor = valor;
        this.tipo = tipo;
        this.hora = hora;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "valor=" + valor +
                ", tipo='" + tipo + '\'' +
                ", hora='" + hora + '\'' +
                '}';
    }
}
