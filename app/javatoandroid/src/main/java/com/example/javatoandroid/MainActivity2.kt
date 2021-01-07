package com.example.javatoandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import com.example.javatoandroid.model.ResultOV
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.listiewlayout.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
        val myjson=intent.getStringExtra("myjson")
        Log.e("madad888888a",myjson.toString())
        val gson = Gson()
        val typeOf = object : TypeToken<List<ResultOV>>() {}.type
        val students = gson.fromJson<List<ResultOV>>(myjson, typeOf)
        val allstudentsname=ArrayList<String>()
        val allstudents=ArrayList<ResultOV>()
        for(app in students){
            allstudentsname.add(app.stuName)
            allstudents.add(app)
        }
        for(i in allstudents){
            Log.e("--------------",i.stuName)
        }
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, allstudentsname)
        listView.adapter = adapter
        listView.setOnItemClickListener { parent, view, position, id ->
            val namestu=allstudentsname[position]
            val intentfromlist=Intent(this,personalinformation::class.java)
            //intentfromlist.putExtra("name",namestu)
            for(s in allstudents){
                if(namestu==s.stuName){
                    Log.e("-----------",gson.toJson(s))
                    intentfromlist.putExtra("student",gson.toJson(s))
                }
            }
            startActivity(intentfromlist)
        }
    }
}