package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    private EditText etName,etEmail3, etPassword2, etConfirmPassword;
    private TextView tvSignUp;
    private Button btnRegister;

    private  String email, name, password, confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = findViewById(R.id.etName);
        etPassword2 = findViewById(R.id.etPassword2);
        etEmail3 = findViewById(R.id.etEmail3);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        tvSignUp = findViewById(R.id.tvSignUp);
        btnRegister = findViewById(R.id.btnRegister);

        validate();
    }

    private void validate() {
        if(email.isEmpty()){
            etEmail3.setError("Enter a valid Email");
        }else if(name.isEmpty()){
            etName.setError("Please Enter your name");
        }else if(confirmPassword != password || password.length() < 4){
            etConfirmPassword.setError("please enter a correct password");
        }else if(password.isEmpty()){
            etPassword2.setError("enter your password");
        }else {
            Toast.makeText(getApplication(), "Registration successful", Toast.LENGTH_LONG).show();
        }
    }
}