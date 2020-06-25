package com.example.vasantvalleyschool.Registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.vasantvalleyschool.R;
import com.example.vasantvalleyschool.Ui.Home;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void LogInClicked(View view) {
        //todo add login code of firebase

        startActivity(new Intent(Login.this, Home.class));

    }

    public void GotoSignUpActivity(View view) {

    startActivity(new Intent(Login.this, SignUp.class));
}
}