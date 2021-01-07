package com.example.java_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.networkdemo.utils.FileUtil
import java.net.HttpURLConnection
import java.net.URL
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submit.setOnClickListener {
            val data="username=${et_username.text.toString()}&password=${et_password.text.toString()}"
            Toast.makeText(this,data, Toast.LENGTH_LONG).show()

            sendRequestWithHttpURLConnection(data)

        }
    }
    private fun sendRequestWithHttpURLConnection(data:String):Unit{
        thread {
            var conn: HttpURLConnection?=null;
            try {
                var url= URL("http://8.135.69.192:8080/stuprogram_war/loginServlet")
                conn=url.openConnection() as HttpURLConnection
                conn.requestMethod="POST"
                conn.connectTimeout=8000
                conn.readTimeout=8000
                var output=conn.outputStream
                output.write(data.toByteArray())
                output.flush()
                var responseCode = conn.responseCode
                //Log.e("MainActivity", responseCode.toString());
                if(responseCode==200){
                    //InputStream
                    var input=conn.inputStream;
                    var result= FileUtil.getStringFromInputStream(input)
                    Log.e("MainActivity",result);
                    //var resultOV = Gson().fromJson<ResultOV>(result, ResultOV::class.java)
                    if(result=="100"){
                        //跳转到second
                        val intentOK: Intent =(Intent(this,success::class.java))
                        startActivity(intentOK)
                    }else{
                        //
                        val intentError: Intent =(Intent(this,fail::class.java))
                        startActivity(intentError)
                    }
                }
            }catch (e:Exception){
                e.printStackTrace()
            }finally {

            }
        }
    }
}
