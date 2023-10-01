package com.demo.retrofitthroughlogin.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.demo.retrofitthroughlogin.Fragment.DashboardFragment;
import com.demo.retrofitthroughlogin.Fragment.ProfileFragment;
import com.demo.retrofitthroughlogin.Fragment.UserFragment;
import com.demo.retrofitthroughlogin.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

  public static  final int main =165151 ;
    BottomNavigationView navbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        navbar = findViewById(R.id.navbar);
        navbar.setOnNavigationItemSelectedListener(this);
        loadFragment( new DashboardFragment());
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


        Fragment fragment= null;

        int itemId = menuItem.getItemId();
        if (itemId == R.id.dash) {
            fragment = new DashboardFragment();
        } else if (itemId == R.id.user) {
            fragment = new UserFragment();
        } else if (itemId == R.id.profile) {
            fragment = new ProfileFragment();
        }

        if (fragment!=null){
            loadFragment(fragment);
        }
        return true;
    }


    void  loadFragment(Fragment fragment){

        getSupportFragmentManager().beginTransaction().replace(R.id.relative,fragment).commit();
    }
}