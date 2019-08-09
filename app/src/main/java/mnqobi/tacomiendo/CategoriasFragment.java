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
public class CategoriasFragment extends Fragment {


    public CategoriasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View categoriasFragment = inflater.inflate(R.layout.fragment_categorias, container, false);


        ViewPager viewPager = categoriasFragment.findViewById(R.id.pagerCategorias);
        CategoriasFragment.MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getFragmentManager());
        viewPager.setAdapter(myPagerAdapter);
        TabLayout tabLayout =categoriasFragment.findViewById(R.id.tablaLayoutCategorias);
        tabLayout.setupWithViewPager(viewPager);

        return categoriasFragment;
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
                    tabFragment = new PlatillosFragment();

                    break;
                case 1:
                    tabFragment = new BebidasFragment();

                    break;
                case 2:
                    tabFragment = new PostresFragment();

                    break;
            }
            return tabFragment;
        }

        @Override
        public int getCount() {
            // Show 2 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            String section = null;

            switch (position) {
                case 0:
                    section = "Platillos";
                    break;
                case 1:
                    section = "Bebidas";
                    break;
                case 2:
                    section = "Postres";
                    break;
            }
            return section;
        }
    }

}
