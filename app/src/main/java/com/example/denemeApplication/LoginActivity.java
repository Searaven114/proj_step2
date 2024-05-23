package com.example.denemeApplication;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
//Bu dosyan düzeni ne!!!!!
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
        Button btnBack = findViewById(R.id.btnBackRegister);

        EditText usernameET = findViewById(R.id.registerUsername);
        EditText passwordET = findViewById(R.id.registerPasswordRetype);

        btnBack.setOnClickListener(v -> {
            finish();
        });

        btnSignIn.setOnClickListener(v -> {

            String inputUsername = usernameET.getText().toString();

            String inputPassword = passwordET.getText().toString();

            //TODO Forgot password ekle zaman olursa (https://www.baeldung.com/spring-security-registration-i-forgot-my-password)
            if (userpass.containsKey(inputUsername)) {

                // Check if the password matches
                if (userpass.get(inputUsername).equals(inputPassword)) {

                    Toast.makeText(LoginActivity.this, "Login successful", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(LoginActivity.this, NavigationHubActivity.class);
                    startActivity(intent);

                    // apply finish() if you want to finish LoginActivity so user can't go back to it
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "Invalid password", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(LoginActivity.this, "User not found", Toast.LENGTH_SHORT).show();
            }






        });








    }


}

