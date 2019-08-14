package mnqobi.tacomiendo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorDirecciones extends ArrayAdapter {
    private Context contexto;
    private ArrayList<Direcciones> direcciones;

    AdaptadorDirecciones(Context contexto, ArrayList<Direcciones> direcciones) {
        super(contexto, R.layout.item_direcciones,direcciones);
        this.contexto = contexto;
        this.direcciones = direcciones;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater;
        inflater = LayoutInflater.from(contexto);
        @SuppressLint({"ViewHolder", "InflateParams"}) View item = inflater.inflate(R.layout.item_direcciones, null);
        TextView direccion= item.findViewById(R.id.tv_direccion);
        direccion.setText(direcciones.get(position).getDireccion());
        TextView municipio = item.findViewById(R.id.tv_municipio);
        municipio.setText(direcciones.get(position).getCiudad());
        TextView estado = item.findViewById(R.id.tv_estado);
        estado.setText(direcciones.get(position).getEstado());
        TextView cp = item.findViewById(R.id.tv_cp);
        cp.setText(direcciones.get(position).getCp());

        return item;
    }
}
