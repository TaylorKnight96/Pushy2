package com.example.largeproject.pushy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.darwindeveloper.horizontalscrollmenulibrary.custom_views.HorizontalScrollMenuView;
import com.darwindeveloper.horizontalscrollmenulibrary.extras.MenuItem;

public class HomeActivity extends AppCompatActivity {

    HorizontalScrollMenuView menu;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        menu = findViewById(R.id.menu);
        txtView = findViewById(R.id.txtText);

        // Creates menu
        initMenu();
        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        }); */
    }

    private void initMenu()
    {
        menu.addItem("Home", R.drawable.ic_home);
        menu.addItem("Projects", R.drawable.ic_projects);
        menu.addItem("Charts", R.drawable.ic_charts);
        menu.addItem("Settings", R.drawable.ic_settings);

        menu.setOnHSMenuClickListener(new HorizontalScrollMenuView.OnHSMenuClickListener() {
            @Override
            public void onHSMClick(MenuItem menuItem, int position) {
                Toast.makeText(HomeActivity.this, ""+menuItem.getText(), Toast.LENGTH_SHORT).show();
                txtView.setText(menuItem.getText());
            }
        });
    }

}
