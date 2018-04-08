package com.example.largeproject.pushy;

import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.view.Menu;
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

        ArrayList<Project> projects = new ArrayList<>();
        projects.add(new Project("OOP", "#63bb91"));
        projects.add(new Project("CS2", "#63bb91"));
        projects.add(new Project("OS", "#63bb91"));
        projects.add(new Project("Discrete", "#63bb91"));

        //CustomListAdapter adapter = new CustomListAdapter(this, R.layout.activity_project_card, projects);
        //listView.setAdapter(adapter);

        setupBottomNavigationView();

    }
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
