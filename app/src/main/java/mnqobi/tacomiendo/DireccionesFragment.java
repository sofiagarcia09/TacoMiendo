package mnqobi.tacomiendo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DireccionesFragment extends Fragment {

    private ArrayList<Direcciones> direcciones;


    public DireccionesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View direc =  inflater.inflate(R.layout.fragment_direcciones, container, false);

        direcciones = new ArrayList<Direcciones>();
        registrarDirecciones();

        Adapter adaptadorDirecciones = new AdaptadorDirecciones(getContext(),direcciones);
        ListView lista = direc.findViewById(R.id.list_direcciones);
        lista.setAdapter((ListAdapter) adaptadorDirecciones);
        return direc;
    }

    private void registrarDirecciones() {
        direcciones.add(new Direcciones("Felipe Angeles Sur 48", "Zitácuaro", "Michoacan", "61514"));
        direcciones.add(new Direcciones("Abasolo Oriente 33", "Zitácuaro", "Michoacan", "61514"));
        direcciones.add(new Direcciones("Maple 85", "Zitácuaro", "Michoacan", "61514"));
        direcciones.add(new Direcciones("Hidalgo Oriente 28", "Zitácuaro", "Michoacan", "61514"));
    }
}
