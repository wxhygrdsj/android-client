package com.example.activitylife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_single_instance.*

class singleInstanceActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_instance)
        Log.d("singleInstanceActivity",this.toString())
        Log.d("singleInstanceActivity","TaskId is ${taskId}")
        button12.setOnClickListener {
            var intent = Intent(this, singleInstanceActivity::class.java)
            startActivity(intent)
        }
        button13.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        Log.d("singleInstance",javaClass.simpleName)
    }
}