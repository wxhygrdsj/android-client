package com.example.intentdemo2

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val button13=findViewById<Button>(R.id.button13)
//        button13.setOnClickListener {
//
//        }
        button13.setOnClickListener {
            val intent= Intent(this,ThirdActivity::class.java)
            /**
             * 像intent加载数据
             * putExtra
             */
            intent.putExtra("name","zhangsan")
            intent.putExtra("password","123456")
            startActivity(intent)

        }

        button4.setOnClickListener {
            val intent= Intent(this,ThirdActivity::class.java)
            /**
             * 像intent加载数据
             * putExtra
             * 增加一个选项，知道intent标号
             */

            intent.putExtra("name","zhangsan")
            intent.putExtra("password","12345678")
            startActivityForResult(intent,1)

        }
        button5.setOnClickListener {
            //创建一个URI对象
            val uri= Uri.parse("http://www.sina.com.cn")
            val intent=Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }
        button6.setOnClickListener {
            //创建一个URI对象
            val uri= Uri.parse("tel:10086")
            val intent=Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }
        button7.setOnClickListener {
            //创建一个URI对象
            val uri= Uri.parse("geo:39.899533,116.036476")
            val intent=Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }
        button8.setOnClickListener {
            //创建一个URI对象
            val uri= Uri.parse("smsto:10086")
            val intent=Intent(Intent.ACTION_VIEW,uri)
            intent.putExtra("sms_body","nimenhao!")
            startActivity(intent)
        }
        button9.setOnClickListener {
            //创建一个URI对象
            val uri= Uri.parse("mailto:1724225@qq.com")
            val intent=Intent(Intent.ACTION_VIEW,uri)
            intent.putExtra(Intent.EXTRA_SUBJECT,"交作业")
            intent.putExtra(Intent.EXTRA_TEXT,"Please")
            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when(requestCode){
            1->if(resultCode==Activity.RESULT_OK){
                var resultMsg = data?.getStringExtra("msg")
                Log.d("MainActivity",resultMsg.toString())
                
            }
        }
    }

}
