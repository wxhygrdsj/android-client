package com.example.chapter04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter04.activity.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout3)
        val intent: Intent =(Intent(this,ListFruits2Activity::class.java))
        startActivity(intent)


    }
}
