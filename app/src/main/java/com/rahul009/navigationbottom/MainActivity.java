package com.rahul009.navigationbottom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.rahul009.navigationbottom.Fragments.CameraFragment;
import com.rahul009.navigationbottom.Fragments.HomeFragment;
import com.rahul009.navigationbottom.Fragments.MenuFragment;
import com.rahul009.navigationbottom.Fragments.MoreFragment;
import com.rahul009.navigationbottom.Fragments.PituresFragment;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottomnavigation);
FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
transaction.replace(R.id.Container,new HomeFragment());
transaction.commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
        switch (item.getItemId()){
            case R.id.ic_home:

                transaction.replace(R.id.Container,new HomeFragment());
          break;
            case R.id.camera:

                transaction.replace(R.id.Container,new CameraFragment());

                break;
            case R.id.pitures:

                transaction.replace(R.id.Container,new PituresFragment());
                break;
            case R.id.menu:

                transaction.replace(R.id.Container,new MenuFragment());

                break;
            case R.id.more:
                transaction.replace(R.id.Container,new MoreFragment());

                break;
        }
        transaction.commit();
                return true;
            }
        });

    }
}