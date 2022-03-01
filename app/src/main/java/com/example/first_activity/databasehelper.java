package com.example.first_activity;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class databasehelper extends SQLiteOpenHelper {


    public databasehelper(@Nullable Context context) {
        super(context,"rtud.db" ,null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String dbquery="CREATE TABLE tb(id INTEGER PRIMARY KEY AUTOINCREMENT,uname TEXT,email TEXT,pin INTEGER)";
        db.execSQL(dbquery);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion) {
        db.execSQL("DROP TABLE IF EXISTS "+db);
        onCreate(db);
    }
    public boolean add1(Usernamemodel um){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("uname",um.getname());
        cv.put("email",um.getemail());
        cv.put("pin",um.getpin());
        long insert=db.insert("tb",null,cv);
        if(insert==-1) return false;
        else return true;
    }
}
