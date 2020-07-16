package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginpage extends AppCompatActivity {
    private EditText  etEmail, etPassword;
    private Button btnLogin;
    private TextView tvForgot, tvRegister;

    private String email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        tvForgot = findViewById(R.id.tvForgot);
        tvRegister = findViewById(R.id.tvRegister);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = etEmail.getText().toString().trim();
                password = etPassword.getText().toString().trim();


                validate();
            }
        });
    }

    private void validate() {
        if (email.isEmpty()) {
            etEmail.setError("Email is Empty");
        } else if (password.isEmpty() || password.length() < 4) {
            etPassword.setError("Enter your password or password less than four");
        } else {
            Toast.makeText(getApplication(), "logIn successful", Toast.LENGTH_LONG).show();

        }
    }
}
