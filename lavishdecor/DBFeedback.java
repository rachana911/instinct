package com.example.rachanagajjar.lavishdecor;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.Telephony;
import android.widget.EditText;
import android.widget.RatingBar;

public class DBFeedback extends SQLiteOpenHelper
{
    public static final String COLUMN_1 = "Feedback";
    public static final String COLUMN_2 = "rate";
    public static final String DATABASE_NAME = "Feedback.db";
    public static final String TABLE_NAME = "Feedback_info";
    public static final int DATABASE_VERSION = 1;
    public static final String Create = "CREATE TABLE " + TABLE_NAME + "(" + COLUMN_1 + " TEXT, " + COLUMN_2 + " FLOAT);";
    /* CREATE TABLE TABLE_NAME (COLumn_1 text ,
                              COLUMN_2 float);*/
    public SQLiteDatabase db;

    public DBFeedback(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public boolean saveData(String Feedback, float rate)
    {
        db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COLUMN_1, String.valueOf(Feedback));
        contentValues.put(COLUMN_2, String.valueOf(rate));
        db.insert(TABLE_NAME,null,contentValues);
        db.close();
        return true;

    }


}
