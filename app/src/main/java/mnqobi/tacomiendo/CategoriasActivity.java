package mnqobi.tacomiendo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class CategoriasActivity extends AppCompatActivity{
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Categorias");
        setSupportActionBar(toolbar);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);


        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

    }



    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(CategoriasActivity cuentaTabsActivity, FragmentManager fm) {
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