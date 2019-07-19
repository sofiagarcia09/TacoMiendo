package mnqobi.tacomiendo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PlatillosFragment extends Fragment {


    public PlatillosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View platillos =  inflater.inflate(R.layout.fragment_platillos, container, false);
        return platillos;
    }

}
