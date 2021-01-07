package com.example.intentdemo2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        button2.setOnClickListener {
            val name=intent.getStringExtra("name")
            val password=intent.getStringExtra("password")
            //Toast.makeText(this,"用户名为:$name,密码为:$password",Toast.LENGTH_LONG).show()
            var msg=""
            if(name.equals("zhangsan")&&password.equals("12345678")){
                msg="用户名与密码正确"
            }else{
                msg="用户名与密码错误"
            }
            var intent2=Intent()
            intent2.putExtra("msg",msg)
            setResult(Activity.RESULT_OK,intent2)
            finish()


        }
    }
}