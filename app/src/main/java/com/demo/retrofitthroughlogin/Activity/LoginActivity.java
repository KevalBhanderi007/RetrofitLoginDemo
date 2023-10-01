package com.demo.retrofitthroughlogin.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.demo.retrofitthroughlogin.R;

public class LoginActivity extends AppCompatActivity {


    EditText loginpassword,loginemail;

    Button login;

    TextView notregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        loginpassword = findViewById(R.id.loginpassword);
        loginemail = findViewById(R.id.loginemail);
        login = findViewById(R.id.login);
        notregister = findViewById(R.id.notregister);


        notregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, HomeActivity.class));

            }
        });

    }
}