package com.example.activitylife

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

/**
 * kotlin 中如果类没有open，不允许被继承
 */
open class BaseActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("BaseActivity",javaClass.simpleName)
        ActivityController.addActivity(this)

    }

    override fun onDestroy() {
        super.onDestroy()
        ActivityController.removeActivity(this)
    }
}