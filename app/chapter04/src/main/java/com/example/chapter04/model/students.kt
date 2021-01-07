package com.example.chapter04.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.view.get
import com.example.chapter04.R
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_students.*

class students : AppCompatActivity() {
    private val sex= listOf("男","女")
    private val major= listOf("软件工程","软件技术","计算机应用技术","计算机科学与技术")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students)
        var adapter = ArrayAdapter(this, android.R.layout.simple_selectable_list_item, sex)
        adapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1)
        spinner2.setAdapter(adapter)
        var adapter1 = ArrayAdapter(this, android.R.layout.simple_selectable_list_item, major)
        adapter1.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1)
        spinner3.setAdapter(adapter1)
//        var adapter2 = ArrayAdapter(this, android.R.layout.simple_selectable_list_item, sex)
//        adapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1)
//        spinner2.setAdapter(adapter)

        button4.setOnClickListener {
            var stuNo=stuno.text.toString()
            var stuName=stuname.text.toString()
            var classes=spinner3.selectedItem.toString()
            var genDer=spinner2.selectedItem.toString()


            var student=Student(stuNo,stuName,classes,genDer,"daa","151511","dda","45")


            var gson= Gson()
            var toJson=gson.toJson(student)
            Toast.makeText(this,toJson,Toast.LENGTH_LONG).show()
        }
    }
}