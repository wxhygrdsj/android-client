package com.example.myapplicationc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.layout.*

class MainActivity : AppCompatActivity() {
    private val data= listOf("apple","daaa","banana","dwwsf")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
        val adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data)
        listView.adapter=adapter
    }
}
