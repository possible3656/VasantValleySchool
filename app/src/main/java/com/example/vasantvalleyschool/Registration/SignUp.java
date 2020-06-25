package com.example.vasantvalleyschool.Registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.vasantvalleyschool.R;
import com.example.vasantvalleyschool.Ui.Home;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void GotoLogInActivity(View view) {
        startActivity(new Intent(SignUp.this, Login.class));
    }

    public void SignUp(View view) {
        //todo add sign up code here
        startActivity(new Intent(SignUp.this, Home.class));
    }
}