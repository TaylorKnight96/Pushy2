package com.example.largeproject.pushy.Project;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.view.Menu;

import com.example.largeproject.pushy.R;
import com.example.largeproject.pushy.Utils.BottomNavigationViewHelper;
import com.example.largeproject.pushy.Utils.Project;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import java.util.ArrayList;

public class ProjectActivity extends AppCompatActivity {

    private static final String TAG = "ProjectActivity";
    private static final int ACTIVITY_NUM = 1;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        listView = (ListView) findViewById(R.id.projectListView);

        //CustomListAdapter adapter = new CustomListAdapter(this, R.layout.activity_project_card, projects);
        //listView.setAdapter(adapter);

        setupBottomNavigationView();
        setupViewPager();

    }

    private void setupViewPager()
    {
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new BackFragment());
        adapter.addFragment(new NameFragment());
        adapter.addFragment(new AddFragment());
        ViewPager viewPager = (ViewPager) findViewById(R.id.container);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        //tabLayout.getTabAt(0).setIcon(R.drawable.ic_back);
        tabLayout.getTabAt(1).setText("Projects");
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_add);

    }


    //Bottom navigation bar setup
    private void setupBottomNavigationView()
    {
        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationBar");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavigationViewHelper.enableNavigation(ProjectActivity.this, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        android.view.MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }

}
