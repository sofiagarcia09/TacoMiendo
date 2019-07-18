package mnqobi.tacomiendo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class menuFragment extends Fragment {

    private ArrayList<Platillo> platillos;

    public menuFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View masVendidos =  inflater.inflate(R.layout.fragment_menu, container, false);

        platillos = new ArrayList<Platillo>();
        registrarMasVendidos();

        Adapter adaptadorPlatillos = new AdaptadorPlatillo(getContext(),platillos);
        ListView lista = masVendidos.findViewById(R.id.list_masVendidos);
        lista.setAdapter((ListAdapter) adaptadorPlatillos);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(),"Platillo "+ platillos.get(position).getNombre(),Toast.LENGTH_SHORT).show();
            }
        });
        return masVendidos;
    }

    private void registrarMasVendidos(){
        platillos.add(new Platillo("Camarones Tismados","$ 5.0",R.drawable.camarones));
        platillos.add(new Platillo("Rosca Herbórea","$ 3.2",R.drawable.rosca));
        platillos.add(new Platillo("Sushi Extremo","$ 12.0",R.drawable.sushi));
        platillos.add(new Platillo("Sandwich","$ 9.0",R.drawable.sandwich));
        platillos.add(new Platillo("Lomo de cerdo Austral","$ 34.0",R.drawable.lomo_cerdo));
    }

}
