package com.example.activitylife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.activitylife.njfu.Md5Util
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity","TaskId is ${taskId}")
        Log.d("MainActivity",javaClass.simpleName)
        button.setOnClickListener {
            /***
             * buttin.setOnClickListener(new ClickListener(){
             *         public void Onclick(){
             *
             * }
             * });
             *如果lambda表达式是参数列表的最后一个参数，可以把lambda表达式移除到小括号外面
             * button.setOnClickListener(){}
             * 如果java单方法接口，可以省略方法名称，如下:
             * button.setOnClickListener(){}
             * //OnClick,Context
             *
             * 如果无参，可以省略小括号
             * button.setOnClickListener{}
             */
            val intent= Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            var intent = Intent(this, StandActivity::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener {
            var intent = Intent(this, singleTopActivity::class.java)
            startActivity(intent)
        }
        button6.setOnClickListener {
            var intent = Intent(this, singleTaskActivity::class.java)
            startActivity(intent)
        }
        button7.setOnClickListener {
            var intent = Intent(this, singleInstanceActivity::class.java)
            startActivity(intent)
        }
        button15.setOnClickListener {
            val username="zhangsan"
            val password: String? =Md5Util.stringToMD5("123456")
            if (password != null) {
                FourthActivity.startActivity(this,username , password)
            }


        }
    }

    override fun onStart() {
        super.onStart()
        /**
         * Log.i info
         * Log.d debug 输出日志信息Logcat 选择debug
         * Log.e error Logcat选择Error查看错误
         * Log.w warning
         * Log.v verbose
         */
        Log.d("MainActivity","OnStart()方法被调用")
    }
    override fun onResume() {
        super.onResume()
        Log.d("MainActivity","OnResume()方法被调用")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","OnPause()方法被调用")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","OnStop()方法被调用")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","OnDestroy()方法被调用")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity","OnRestart()方法被调用")
    }



}
