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
    DaoUsuario dao;
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
        dao = new DaoUsuario(this);
        btnCrear.setOnClickListener(this);
        btnCancelar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_crear_cuenta:
                usuario u =new usuario();
                u.setUsuario(user.getText().toString());
                u.setPassword(password.getText().toString());
                u.setNombre(nombre.getText().toString());
                u.setApellido(apellido.getText().toString());
                if (!u.isNull()){
                    Toast.makeText(this,"ERROR!campos vacios",Toast.LENGTH_LONG).show();
                }else if (dao.insertUsuario(u)){
                    Toast.makeText(this,"Registro de Usuario Exito!!!!",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(this,"Este usuario ya existe!!!!",Toast.LENGTH_LONG).show();
                }
            break;
            case R.id.btn_cancelar:
                startActivity(new Intent(getApplicationContext(), login_Activity.class));
                finish();
            break;
        }
    }
}