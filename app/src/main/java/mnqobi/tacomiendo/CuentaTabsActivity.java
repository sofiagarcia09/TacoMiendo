package mnqobi.tacomiendo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;


public class CuentaTabsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta_tabs);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(CuentaTabsActivity cuentaTabsActivity, FragmentManager fm) {
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
            // Show 2 total pages.
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