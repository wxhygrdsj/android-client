package com.example.activitylife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_single_top.*

class singleTopActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_top)
        Log.d("singleTopActivity",this.toString())
        Log.d("singleTopActivity",javaClass.simpleName)
        button8.setOnClickListener {
            var intent = Intent(this, singleTopActivity::class.java)
            startActivity(intent)
        }
        button10.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}