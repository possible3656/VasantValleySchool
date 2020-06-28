package com.example.vasantvalleyschool.Registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.vasantvalleyschool.R;
import com.example.vasantvalleyschool.Ui.Home;

public class SignUp extends AppCompatActivity {

    EditText nameSignup,emailSignUp,phoneNumberSignUp,passwordSignUp,repasswordSignUp;
    ProgressBar progressBarSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        nameSignup=findViewById(R.id.nameSignup);
        emailSignUp=findViewById(R.id.emailSignUp);
        phoneNumberSignUp=findViewById(R.id.phoneNumberSignUp);
        passwordSignUp=findViewById(R.id.passwordSignUp);
        repasswordSignUp=findViewById(R.id.repasswordSignUp);
        progressBarSignUp=findViewById(R.id.progressBarSignUp);

// aak text view referal code ka v banoo
        //kidhr


    }

    public void GotoLogInActivity(View view) {
        startActivity(new Intent(SignUp.this, Login.class));
    }

    public void SignUp(View view) {
        userValidation();

        //startActivity(new Intent(SignUp.this, Home.class));
    }

    private void userValidation() {
        final String username = nameSignup.getText().toString().trim();
        final String email = emailSignUp.getText().toString().trim();
        final String password = passwordSignUp.getText().toString().trim();
        final String re_password = repasswordSignUp.getText().toString().trim();
        final String referal_code = repasswordSignUp.getText().toString().trim();
        final String phone = phoneNumberSignUp.getText().toString().trim();
    }
}