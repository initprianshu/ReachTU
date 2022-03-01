package com.example.first_activity;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class help extends SQLiteOpenHelper {

    public help(@Nullable Context context) {
        super(context,"dbname.db" , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String dbquery= "CREATE TABLE tbname (id INTEGER PRIMARY KEY AUTOINCREMENT, question TEXT)";
        db.execSQL(dbquery);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + "tbname");
        onCreate(db);

    }
    public boolean addone ( querydatabase h) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cb = new ContentValues();
        cb.put("question",h.getQuestion());
        long insert = db.insert("tbname",null,cb);
        if (insert == -1 ) {
            return false;
        }
        else return true;
    }

}
