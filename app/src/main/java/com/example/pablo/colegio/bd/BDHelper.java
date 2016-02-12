package com.example.pablo.colegio.bd;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.pablo.colegio.Calendario;
import com.example.pablo.colegio.Mensaje;
import com.example.pablo.colegio.Nino;
import com.example.pablo.colegio.Tutoria;
import com.example.pablo.colegio.Usuario;

import java.util.List;

/**
 * Created by pablo on 05/02/2016.
 */
public class BDHelper extends SQLiteOpenHelper {
    String sql1 =
            "Create table Usuario(" +
                    "email varchar(50) primary key," +
                    "password varchar(40)," +
                    "tipo int (1))";
    String sql2 =
            "Create table Profesor(" +
                    "email varchar(50) primary key," +
                    "nombre varchar(40)," +
                    "apellidos varchar(100))";
    String sql3 =
            "Create table Padre(" +
                    "email varchar(50) primary key," +
                    "nombre varchar(40)," +
                    "apellidos varchar(100))";
    String sql4 =
            "Create table Nino(" +
                    "id int(10) primary key auto-increment," +
                    "email varchar(50) primary key," +
                    "nombre varchar(40)," +
                    "Profesor varchar(50) references Profesor(email)," +
                    "Padre varchar(50) references Padre(email)," +
                    "Clase varchar(2))";
    String sql5 =
            "Create tabla Mensaje(" +
                    "id int(10) primary key auto-increment," +
                    "titulo varchar(50)," +
                    "mensaje varchar(255)," +
                    "Profesor varchar(50) references Profesor(email)," +
                    "Nino int(10) references Nino(id))";
    String sql6 =
            "Create tabla Calendario(" +
                    "id int(10) primary key auto-increment," +
                    "fecha varchar(5)," +
                    "hora varchar(5)," +
                    "Padre varchar(50) references Padre(email)," +
                    "Profesor varchar(50) references Profesor(email))";
    public BDHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sql1);
        db.execSQL(sql2);
        db.execSQL(sql3);
        db.execSQL(sql4);
        db.execSQL(sql5);
        db.execSQL(sql6);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    List<Mensaje> leermensajes(){
        String sql ="Select * from mensaje where nino='?'";
        return null;
    }
    List<Calendario>vercalendario(){
        String sql ="Select * from calendario where profesor='?'";
        return null;
    }
    void crearusuario(Usuario usuario){
        String sql ="Insert into Usuario(email,password,tipo)values(?,?,?)";
    }
    void mandarmensaje(Mensaje mensaje){
        String sql ="Insert into Mensaje(titulo,mensaje,profesor,nino)values(?,?,?,?)";
    }
    void seleccionartutoria(Tutoria tutoria){
        String sql ="Select * from tutoria where profesor='?'";
    }
    void seleccionarmensaje (Mensaje mensaje){
        String sql ="Select * from mensaje where nino='?'";
    }
    void asignarnino (Nino nino){
        String sql ="Insert into Nino(id,email,nombre,profesor,padre,clase)values(?,?,?,?,?,?)";
    }
    List<Nino>verlistanino;{
        String sql ="Select * from nino where clase='?'";
    }
    List<Mensaje>mostrarmensajes(){
        String sql ="Select * from mensaje where nino='?'";
        return null;
    }
    Tutoria vertutoria(){
        String sql ="Select * from tutoria where profesor='?'";
        return null;
    }
    Tutoria cancelartutoria(){
        String sql ="delete from tutorias" +
                "where id=?";
        return null;
    }
}
