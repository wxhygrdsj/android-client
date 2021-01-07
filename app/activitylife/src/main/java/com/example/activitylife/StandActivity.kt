package com.example.activitylife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_stand.*

class StandActivity : BaseActivity() {//standard
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stand)
        Log.d("StandActivity",this.toString())
    Log.d("StandActivity",javaClass.simpleName)
        button3.setOnClickListener {
            var intent = Intent(this, StandActivity::class.java)
            startActivity(intent)
        }
    }
}