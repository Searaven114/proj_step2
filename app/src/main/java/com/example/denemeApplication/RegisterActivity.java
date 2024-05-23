package com.example.denemeApplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


    Button register = findViewById(R.id.btnRegister);
    Button back = findViewById(R.id.btnBackRegister);

    EditText username = findViewById(R.id.registerUsername);
    EditText password = findViewById(R.id.registerPassword);
    EditText confirmpassword = findViewById(R.id.registerPasswordConfirm);
    EditText email = findViewById(R.id.registerEmailAddress);
    EditText phone = findViewById(R.id.registerPhone);

    register.setOnClickListener(v -> {
        //TODO -> Check if the username already exists in the database (will be revealed once DTO gets sent and reply is received)
        //TODO -> Check if the password matches with the initially confirmation password (do the logic here)
    });

    back.setOnClickListener( v -> {
        finish();
    });





    }
}

/*
    public UserRegistrationDTO(String username, String password, String email, String phone) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }



    DtoValidator replies:

    "USER REGISTRATION CANNOT BE COMPLETED DUE TO USERNAME CANNOT BE EMPTY"
    "USER REGISTRATION CANNOT BE COMPLETED DUE TO PASSWORD MUST BE AT LEAST 3 CHARACTERS"
    "USER REGISTRATION CANNOT BE COMPLETED DUE TO EMAIL CANNOT BE EMPTY"
    "USER REGISTRATION CANNOT BE COMPLETED DUE TO PHONE CANNOT BE EMPTY"

    Eğer isim çakısmasi varsa "USER REGISTRATION CANNOT BE COMPLETED DUE TO USERNAME ALREADY EXISTS" döner !
    */