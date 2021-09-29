package cl.grupost.eval1androidgrupal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorViaje extends RecyclerView.Adapter<AdaptadorViaje.ViewHolder> {

    private ArrayList<Viaje> viajes;

    public AdaptadorViaje(ArrayList<Viaje> viajes){
        this.viajes = viajes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_viajes,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.valor.setText(viajes.get(position).getValor());
        holder.hora.setText(viajes.get(position).getHora());
        holder.serie.setText(viajes.get(position).getSerie());

    }

    @Override
    public int getItemCount() {
        return viajes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView valor;
        private TextView hora;
        private TextView serie;

        public ViewHolder(View itemView){
            super(itemView);

            valor = itemView.findViewById(R.id.tvMonto);
            hora = itemView.findViewById(R.id.tvHora);
            serie = itemView.findViewById(R.id.tvSerie);
        }
    }
}
