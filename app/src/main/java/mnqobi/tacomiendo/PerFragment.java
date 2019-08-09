package mnqobi.tacomiendo;



import android.os.Bundle;
import android.support.annotation.Nullable;
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
 *
 */
public class PerFragment extends Fragment {


    public PerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View perfil =  inflater.inflate(R.layout.fragment_per, container, false);

        PerFragment.SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this,getFragmentManager());
        ViewPager viewPager = perfil.findViewById(R.id.viewpager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = perfil.findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        return perfil;
    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(PerFragment perFragment, FragmentManager fm) {
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
