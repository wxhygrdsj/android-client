package com.example.activitylife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d("SecondActivity",javaClass.simpleName)
        button2.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        button14.setOnClickListener {
            ActivityController.finishAll()
            //this.finish()
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("secondActivity","secondActivity Restart()方法被调用")
    }
}