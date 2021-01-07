package com.example.activitylife

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_fourth.*

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        button16.setOnClickListener {
            //获取值
            var userName = intent.getStringExtra("userName")
            var password=intent.getStringExtra("password")
            //吐司
            Toast.makeText(this,"${userName},${password}",Toast.LENGTH_LONG).show()


        }
    }
    companion object{
        fun startActivity(context:Context,data1:String,data2:String){
            val intent= Intent(context,FourthActivity::class.java)
            intent.putExtra("userName",data1)
            intent.putExtra("password",data2)
            context.startActivity(intent)

        }
    }
}