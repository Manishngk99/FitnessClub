package com.example.fitnessclub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btnLogin;
    private EditText etusername, etpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding
        btnLogin = findViewById(R.id.btnLogin);
        etusername = findViewById(R.id.etUsername);
        etpassword = findViewById(R.id.etPassword);


        btnLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


    }
}
