package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //获取button
        var btnSecond01 : Button = findViewById(R.id.btn_second01);
        //添加事件
        btnSecond01.setOnClickListener{
            //添加吐司Toast
            /*
             * 第一个参数Context,this 代表activity
             * 第二个参数,代表要显示的文字
             * 第三个参数代表显示的时间长短
             */
            Toast.makeText(this,"南京林业大学软件工程专业！",Toast.LENGTH_LONG).show()
            //跳转到第一个activity
            val intent =Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        //获取按钮
        var btnSecond02=findViewById<Button>(R.id.btnSecond02)
        btnSecond02.setOnClickListener{
            finish();
        }


    }
}