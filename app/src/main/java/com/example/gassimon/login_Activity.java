package com.example.gassimon;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login_Activity extends AppCompatActivity implements View.OnClickListener {
    private Button btnlogin,btnregistrar;
    private EditText user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        btnlogin = findViewById(R.id.btn_login);
        btnregistrar = findViewById(R.id.btn_registrar);
        user= findViewById(R.id.txt_usuaerio);
        pass=findViewById(R.id.text_pass);
        btnlogin=findViewById(R.id.btn_login);
        btnregistrar=findViewById(R.id.btn_registrar);
        btnlogin.setOnClickListener(this);
        btnregistrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_login:
                startActivity(new Intent(getApplicationContext(),Menu_Activity.class));
                break;
            case R.id.btn_registrar:
                startActivity(new Intent(getApplicationContext(), Registrar_Activity.class));
                break;
        }

    }
}

