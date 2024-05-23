package com.example.denemeApplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import java.util.logging.Logger;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("(INFO)", "------MainActivity.onCreate has been invoked !-------");


        Button btnSignIn = findViewById(R.id.loginButton);

        btnSignIn.setOnClickListener(v -> {

            Log.i("(INFO)","USER PRESSED \"loginButton\"");
            Intent i = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(i);
        });














    }
}
