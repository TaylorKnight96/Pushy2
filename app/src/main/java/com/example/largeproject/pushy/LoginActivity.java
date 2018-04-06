package com.example.largeproject.pushy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText UsernameEt, PasswordEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        UsernameEt = (EditText)findViewById(R.id.etUsername);
        PasswordEt = (EditText)findViewById(R.id.etPassword);
    }

    public void OnLogin(View view)
    {
        String username = UsernameEt.getText().toString();
        String password = PasswordEt.getText().toString();
        String type = "login";
        startActivity(new Intent(LoginActivity.this, HomeActivity.class));
        //BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        //backgroundWorker.execute(type, username, password);

        // Some made up data
        User currentUser = new User();
        currentUser.projects.add(new Project("OOP", "#a5c268"));
        currentUser.projects.add(new Project("OS", "#a5c268"));
        currentUser.projects.add(new Project("CS2", "#a5c268"));
        currentUser.getProject("OOP").tasks.add(new Task("Assignment 1", 1));
        currentUser.getProject("OOP").tasks.add(new Task("Assignment 2", 2));

    }

}
