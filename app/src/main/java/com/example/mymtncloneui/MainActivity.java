package com.example.mymtncloneui;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        replaceFragment(getSupportFragmentManager(), new HomeFragment(), R.id.container);
        bottomNavigationView.setOnNavigationItemSelectedListener(menuItem ->{
            switch (menuItem.getItemId()){
                case R.id.navigation_home:
                    if (!menuItem.isChecked()) {
                        addFragment(new HomeFragment(), R.id.container, false, getResources().getString(R.string.home));
                        menuItem.setChecked(true);
                    }
                    break;
                case R.id.navigation_buy:
                    if (!menuItem.isChecked()) {
                        addFragment(new BuyFragment(), R.id.container, false, getResources().getString(R.string.buy));
                        menuItem.setChecked(true);
                    }
                    break;
                case R.id.navigation_send:
                    if (!menuItem.isChecked()) {
                        addFragment(new SendFragment(), R.id.container, false, getResources().getString(R.string.send));
                        menuItem.setChecked(true);
                    }
                    break;
                case R.id.navigation_help:
                    if (!menuItem.isChecked()) {
                        addFragment(new HelpFragment(), R.id.container, false, getResources().getString(R.string.help));
                        menuItem.setChecked(true);
                    }
                    break;
            }
            return false;
        });
    }

    protected void replaceFragment(final FragmentManager fragmentManager,
                                   final Fragment fragment,
                                   final int frameId) {
        if (!isFinishing()) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            if (fragment.isAdded()) {
                transaction.show(fragment);
            } else {
                transaction.replace(frameId, fragment);
            }
            commitTransaction(transaction);
        }
    }
    private void commitTransaction(final FragmentTransaction transaction) {
        transaction.commit();
    }

    public void addFragment(Fragment fragment, int containerId, boolean addToBackStack, String backStackName) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(containerId, fragment);
        if (addToBackStack) {
            fragmentTransaction.addToBackStack(backStackName);
        }
        fragmentTransaction.commit();
    }
}
