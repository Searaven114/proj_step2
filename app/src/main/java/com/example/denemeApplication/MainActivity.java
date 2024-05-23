package com.example.denemeApplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.logging.Logger;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("(INFO)", "------MainActivity.onCreate has been invoked !-------");


        Button btnSignIn = findViewById(R.id.loginButton);
        TextView a = findViewById(R.id.textViewSignUp);

        btnSignIn.setOnClickListener(v -> {

            Log.i("(INFO)","USER PRESSED \"loginButton\"");
            Intent i = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(i);
        });

        a.setOnClickListener(v -> {
            Log.i("(INFO)","USER PRESSED \"textViewSignUp\"");

            Intent i = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(i);

        });














    }
}
