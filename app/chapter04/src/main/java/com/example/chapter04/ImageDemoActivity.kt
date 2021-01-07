package com.example.chapter04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import com.example.chapter04.activity.*
import com.example.chapter04.adapter.FruitAdapter
import com.example.chapter04.model.Student
import com.example.chapter04.model.students
import com.example.chapter04.wiget.TitleLayout
import kotlinx.android.synthetic.main.activity_image_demo.*
import kotlinx.android.synthetic.main.activity_process_bar.*

class ImageDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_demo)
        //button2.setOn
        //var s=new Student("1122111","adda","180154","男","daa","151511","dda","45")
        var sign=false;
        button2.setOnClickListener {
            if(sign==false){
                imageView.setImageResource(R.drawable.huaji)
                sign=true
            }else{
                imageView.setImageResource(R.drawable.wtf)
                sign=false
            }
        }
        button3.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }

}