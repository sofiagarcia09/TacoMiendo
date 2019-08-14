package mnqobi.tacomiendo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Objects;

public class MainActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolbar();

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        setFragmentByDefault();
        navigationView.setNavigationItemSelectedListener(this);
    }

  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.main, menu);
      return super.onCreateOptionsMenu(menu);

  }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            drawerLayout.openDrawer(GravityCompat.START);
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        boolean fragmentTransaction = false;
        Fragment fragment = null;

        switch (item.getItemId()){
            case R.id.nav_home:
                fragment = new menuFragment();
                fragmentTransaction = true;
                break;
            case R.id.nav_user:
                fragment = new CuentaFragment();
                fragmentTransaction = true;
                break;

            case R.id.nav_cat:
                fragment = new CategoriasFragment();
                fragmentTransaction = true;
                break;

            case R.id.nav_manage:
                fragment = new ConfiguracionFragment();
                fragmentTransaction = true;
                break;

        }
        if(fragmentTransaction){
            changeFragment(fragment, item);
            drawerLayout.closeDrawers();
        }
        return  true;
    }

    //setting up the toolbar
    public void setToolbar(){
        Toolbar myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        Objects.requireNonNull(getSupportActionBar()).setHomeAsUpIndicator(R.drawable.ic_menu_nav);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    //metodo que coloca el fragmento principal
    public void setFragmentByDefault(){
        changeFragment(new menuFragment(), navigationView.getMenu().getItem(0));
    }

    //metodo que nos permite cambiar un fragmento
    public void changeFragment(Fragment fragment, MenuItem item){
        getSupportFragmentManager().beginTransaction().replace(R.id.plantilla_principal, fragment).commit();
        item.setChecked(true);
        Objects.requireNonNull(getSupportActionBar()).setTitle(item.getTitle());
    }
}
