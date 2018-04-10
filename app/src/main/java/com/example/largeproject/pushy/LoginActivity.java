package com.example.largeproject.pushy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.largeproject.pushy.Home.HomeActivity;

public class LoginActivity extends AppCompatActivity {

    EditText UsernameEt, PasswordEt;
    TextView askToRegisterTv;


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

        Intent homeIntent = new Intent(this, HomeActivity.class);
        startActivity(homeIntent);

        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, username, password);

    }
}
