package com.example.gassimon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registrar_Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText nombre,apellido,user,password;
    private Button btnCrear,btnCancelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_);

        nombre = findViewById(R.id.txt_nombre2);
        apellido = findViewById(R.id.txt_apellido2);
        user= findViewById(R.id.text_usuario2);
        password=findViewById(R.id.text_pass2);
        btnCrear = findViewById(R.id.btn_crear_cuenta);
        btnCancelar = findViewById(R.id.btn_cancelar);
        btnCrear.setOnClickListener(this);
        btnCancelar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_crear_cuenta:

            break;
            case R.id.btn_cancelar:
                startActivity(new Intent(getApplicationContext(), login_Activity.class));
                finish();
            break;
        }
    }
}