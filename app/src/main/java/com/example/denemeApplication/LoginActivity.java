package com.example.denemeApplication;


import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Log.i("(INFO)", "------LoginActivity.onCreate has been invoked !-------");

        HashMap<String, String> userpass = new HashMap<>();
        userpass.put("reconcraft", "1234");
        userpass.put("fuat", "avni");
        userpass.put("ali", "1");

        Button btnSignIn = findViewById(R.id.btnSignIn);
        Button btnBack = findViewById(R.id.btnBack);

        EditText usernameET = findViewById(R.id.username);
        EditText passwordET = findViewById(R.id.password);

        btnBack.setOnClickListener(v -> {
            finish();
        });

        btnSignIn.setOnClickListener(v -> {

            String inputUsername = usernameET.getText().toString();

            String inputPassword = passwordET.getText().toString();

            if (userpass.containsKey(inputUsername)) {
                // Check if the password matches
                if (userpass.get(inputUsername).equals(inputPassword)) {
                    Toast.makeText(LoginActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                    // You can also start a new activity here if the login is successful
                } else {
                    Toast.makeText(LoginActivity.this, "Invalid password", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(LoginActivity.this, "User not found", Toast.LENGTH_SHORT).show();
            }


        });








    }


}

