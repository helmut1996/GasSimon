package com.example.gassimon;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class DaoUsuario {
    Context c;
    usuario u;
    ArrayList<usuario> lista;
    SQLiteDatabase sql;
    String bd ="BDGassimon";
    String tableU ="create table if not exists Usuarios(id Integer primary key autoincrement,usuario text,pass text,nombre text,apellido text)";

    public DaoUsuario(Context c){
        this.c=c;
        c.openOrCreateDatabase(bd,c.MODE_PRIVATE,null);
        sql.execSQL(tableU);
        u=new usuario();
    }

    public boolean insertUsuario(usuario u){
        if (buscar(u.getUsuario())==0){
            ContentValues cv = new ContentValues();
            cv.put("usuario",u.getUsuario());
            cv.put("pass",u.getPassword());
            cv.put("nombre",u.getNombre());
            cv.put("apellido",u.getApellido());
            return (sql.insert("Usuarios",null,cv)>0);
        }else {
            return false;
        }
    }

    public int buscar(String u) {
        int i =0;
        lista=selectUsuario();
        for (usuario us:lista ) {
            if (us.getUsuario().equals(u)){
                i++;
            }
        }
        return i;
    }

    public  ArrayList<usuario>selectUsuario(){
        ArrayList<usuario> Lista = new ArrayList<usuario>();
        lista.clear();
        Cursor cr = sql.rawQuery("select * from Usuarios",null);
        if (cr!=null&&cr.moveToFirst()){
            do {

                usuario u =new usuario();
                u.setId(cr.getInt(0));
                u.setUsuario(cr.getString(1));
                u.setPassword(cr.getString(2));
                u.setNombre(cr.getString(3));
                u.setApellido(cr.getString(4));
                lista.add(u);
            }while (cr.moveToNext());
        }
        return lista;
    }

}
