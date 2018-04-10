package com.example.largeproject.pushy.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.example.largeproject.pushy.Charts.ChartsActivity;
import com.example.largeproject.pushy.Home.HomeActivity;
import com.example.largeproject.pushy.Project.ProjectActivity;
import com.example.largeproject.pushy.R;
import com.example.largeproject.pushy.Settings.SettingsActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHelper";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx)
    {
        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationBar");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view)
    {
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.ic_home:
                        Intent intent1 = new Intent(context, HomeActivity.class);
                        context.startActivity(intent1);
                        break;
                    case R.id.ic_projects:
                        Intent intent2 = new Intent(context, ProjectActivity.class);
                        context.startActivity(intent2);
                        break;
                    case R.id.ic_charts:
                        Intent intent3 = new Intent(context, ChartsActivity.class);
                        context.startActivity(intent3);
                        break;
                    case R.id.ic_settings:
                        Intent intent4 = new Intent(context, SettingsActivity.class);
                        context.startActivity(intent4);
                        break;
                }
                return false;
            }
        });
    }
}
