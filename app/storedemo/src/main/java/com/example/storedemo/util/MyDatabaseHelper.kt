package com.example.storedemo.util

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDatabaseHelper(val context:Context,name :String,version:Int):
    SQLiteOpenHelper(context,name,null,version) {
    private val createBook="create table tb_book("+
            "id integer not null primary key autoincrement,"+
            "author text,"+
            "price real,"+
            "pages integer"+
            "bookname text";
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(createBook)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

}