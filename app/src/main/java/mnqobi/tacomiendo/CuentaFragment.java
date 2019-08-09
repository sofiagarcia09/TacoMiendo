package mnqobi.tacomiendo;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class CuentaFragment extends Fragment {


    public CuentaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View cuentaFragment = inflater.inflate(R.layout.fragment_cuenta, container, false);


        ViewPager viewPager = cuentaFragment.findViewById(R.id.pager);
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getFragmentManager());
        viewPager.setAdapter(myPagerAdapter);TabLayout tabLayout = (TabLayout) cuentaFragment.findViewById(R.id.tablaLayout);
        tabLayout.setupWithViewPager(viewPager);

        return cuentaFragment;
    }



    public class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            Fragment tabFragment = null;

            switch (position){
                case 0:
                    tabFragment = new PerfilFragment();
                    break;
                case 1:
                    tabFragment = new DireccionesFragment();
                    break;
                case 2:
                    tabFragment = new TarjetasFragment();
                    break;
            }
            return tabFragment;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            String section = null;

            switch (position) {
                case 0:
                    section = "Cuenta";
                    break;
                case 1:
                    section = "Direcciones";
                    break;
                case 2:
                    section = "Tarjetas";
                    break;
            }
            return section;
        }
    }

}
