package mnqobi.tacomiendo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorPlatillo extends ArrayAdapter {

    private Context contexto;
    private ArrayList <Platillo> platillos;

    public AdaptadorPlatillo(Context contexto, ArrayList<Platillo> platillos) {
        super(contexto, R.layout.item_aliment,platillos);
        this.contexto = contexto;
        this.platillos = platillos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(contexto);
        View item = inflater.inflate(R.layout.item_aliment, null);
        ImageView imagenPlatillo = item.findViewById(R.id.img_alm);
        imagenPlatillo.setImageResource(platillos.get(position).getImg_pla());
        TextView nombrePlatillo= item.findViewById(R.id.tv_nom);
        nombrePlatillo.setText(platillos.get(position).getNombre());
        TextView precioPlatillo = item.findViewById(R.id.tv_pre);
        precioPlatillo.setText(platillos.get(position).getPrecio());

        return item;
    }
}
