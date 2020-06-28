package com.example.gassimon;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu_Activity extends AppCompatActivity implements View.OnClickListener {
    private Button usuario,inventario,info,agregar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_);

        agregar = findViewById(R.id.btn_agregar);
        inventario=findViewById(R.id.btn_inventario);
        usuario = findViewById(R.id.btn_usuarios);
        info = findViewById(R.id.btn_info);

        agregar.setOnClickListener(this);
        usuario.setOnClickListener(this);
        inventario.setOnClickListener(this);
        info.setOnClickListener(this);
    }
    //metodo pata mostar y ocultar el menu
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }
    //metodo para asignar las funciones correspondientes a las opciones
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.menu_peerfil)
        {
            startActivity( new Intent(getApplicationContext(),PerfilActivity.class));
        }else if(id == R.id.menu_secion){
            Toast.makeText(this, "Cerrar sesion!!!", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_agregar:
                startActivity(new Intent(getApplicationContext(),Agregar_Inventario_Activity.class));
                break;
            case R.id.btn_inventario:
                startActivity(new Intent(getApplicationContext(),Lista_Inventario_Activity.class));
                break;
            case R.id.btn_usuarios:
                startActivity(new Intent(getApplicationContext(),Lista_Usuarios_Activity.class));
                break;
            case R.id.btn_info:
               mostrarDialog();
                break;
        }
    }

//metodo para venta emergente
    private void mostrarDialog() {
        AlertDialog.Builder alert =new AlertDialog.Builder(this);
        alert.setIcon(R.drawable.logo1);
        alert.setTitle("Gasimon");
        alert.setMessage("Esta aplicacion fue creada por Helmut Josue Colindres Brenes ");
        alert.create().show();
    }
}