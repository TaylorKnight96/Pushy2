package com.example.largeproject.pushy.Charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.widget.ListView;

import com.example.largeproject.pushy.R;
import com.example.largeproject.pushy.Utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class ChartsActivity extends AppCompatActivity {

    private static final String TAG = "ChartsActivity";
    private static final int ACTIVITY_NUM = 2;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: starting");

        setupBottomNavigationView();

    }

    private void setupBottomNavigationView()
    {
        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationBar");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavigationViewHelper.enableNavigation(ChartsActivity.this, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        android.view.MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }

}
