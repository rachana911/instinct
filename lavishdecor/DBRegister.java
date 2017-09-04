package com.example.rachanagajjar.lavishdecor;

/**
 * Created by rachanagajjar on 01-May-17.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class DBRegister extends SQLiteOpenHelper

{
    public static final String COLUMN_1 = "user_name";
    public static final String COLUMN_2 = "email";
    public static final String COLUMN_3 = "phone";
    public static final String COLUMN_4 = "password";
    public static final String COLUMN_5 = "confirm_password";
    public static final String DATABASE_NAME = "Register.db";
    public static final String TABLE_NAME = "register";
    public static final int DATABASE_VERSION = 2;
    public static final String Create = "CREATE TABLE " +TABLE_NAME+"("+COLUMN_1+" TEXT,"+COLUMN_2+ " text,"+COLUMN_3+"number,"+COLUMN_4+"Password,"+COLUMN_5+"confirm_password);";
    public SQLiteDatabase db;

    public DBRegister (Context context)
    {
        super(context,TABLE_NAME,null,DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public boolean saveData(String name, String email, String phone, String password, String cpassword){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COLUMN_1, name);
        contentValues.put(COLUMN_2, email);
        contentValues.put(COLUMN_3, phone);
        contentValues.put(COLUMN_4, password);
        contentValues.put(COLUMN_5, cpassword);


        db.insert(TABLE_NAME,null,contentValues);
        db.close();
        return true;


    }



}


