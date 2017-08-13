package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.pets.data.PetContract.PetEntry;

/**
 * Created by Paul on 8/13/2017.
 * Copyright Paul 2017
 */

public class PetDbHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Pets.db";

    private static final String SQL_CREATE_DATABASE = "CREATE TABLE " + PetEntry.TABLE_NAME + "( " +
            PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            PetEntry.COLUMN_PET_NAME + " STRING, " +
            PetEntry.COLUMN_PET_BREED + " STRING, " +
            PetEntry.COLUMN_PET_GENDER + " INTEGER, " +
            PetEntry.COLUMN_PET_WEIGHT + " INTEGER " + ")";


    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_DATABASE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
