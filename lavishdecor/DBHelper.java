package com.example.rachanagajjar.lavishdecor;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBHelper extends SQLiteOpenHelper {
    public static final String COLUMN_1 = "Username";
    public static final String COLUMN_2 = "Password";
    public static final String DATABASE_NAME = "Login.db";
    public static final String TABLE_NAME = "Login";
    public static final int DATABASE_VERSION = 1;
    public static final String Create = "CREATE TABLE " + TABLE_NAME + "(" + COLUMN_1 + " TEXT, " + COLUMN_2 + " TEXT);";
    public SQLiteDatabase db;

    public DBHelper(Context context) {
        super(context, TABLE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public boolean saveData(String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COLUMN_1, username);
        contentValues.put(COLUMN_2, password);

        db.insert(TABLE_NAME, null, contentValues);
        db.close();
        return true;
    }
}