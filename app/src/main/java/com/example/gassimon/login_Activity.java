package com.example.gassimon;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login_Activity extends AppCompatActivity implements View.OnClickListener {
    private Button login,registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        login = findViewById(R.id.btn_login);
        registrar = findViewById(R.id.btn_registrar);
        login.setOnClickListener(this);
        registrar.setOnClickListener(this);
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

