package com.example.vasantvalleyschool.Registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.vasantvalleyschool.R;
import com.example.vasantvalleyschool.Ui.Home;

public class Login extends AppCompatActivity {
    EditText emailSignIn,passwordSignIn;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailSignIn=findViewById(R.id.emailSignIn);
        passwordSignIn=findViewById(R.id.passwordSignIn);
        progressBar=findViewById(R.id.progressBarSignIn);

    }

    public void LogInClicked(View view) {
        //todo add login code of firebase

        startActivity(new Intent(Login.this, Home.class));

    }

    public void GotoSignUpActivity(View view) {

    startActivity(new Intent(Login.this, SignUp.class));
}
}