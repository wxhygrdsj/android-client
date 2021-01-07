package com.example.activitylife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_single_task.*
import kotlinx.android.synthetic.main.activity_single_top.*

class singleTaskActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_task)
        Log.d("singleTakActivity",this.toString())
        Log.d("singleTakActivity",javaClass.simpleName)
        button9.setOnClickListener {
            var intent = Intent(this, singleTaskActivity::class.java)
            startActivity(intent)
        }
        button11.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}