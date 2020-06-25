package com.example.gassimon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login_Activity extends AppCompatActivity implements View.OnClickListener {
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        login = findViewById(R.id.btn_login);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(getApplicationContext(),Menu_Activity.class));
    }
}