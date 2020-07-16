package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Forgot extends AppCompatActivity {
    private EditText etEmail2;
    private Button btnReset;

    private String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);

        etEmail2 = findViewById(R.id.etEmail2);
        btnReset = findViewById(R.id.btnReset);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = etEmail2.getText().toString().trim();

                validate();
            }
        });

    }

    private void validate() {
        if(email.isEmpty()){
            etEmail2.setError("Provide a Valid Email");
    }else{
            Toast.makeText(getApplication(), "Password Reset was successful", Toast.LENGTH_LONG).show();
        }
  }
}