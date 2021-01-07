package com.example.networkdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.networkdemo.model.ResultOV
import com.example.networkdemo.model.ResultObject
import com.example.networkdemo.utils.FileUtil
import com.example.networkdemo.utils.HttpUtil
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import java.io.IOException
import java.io.InputStream
import java.net.CacheResponse
import java.net.HttpURLConnection
import java.net.URL
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submit.setOnClickListener {
            //startActivity(Intent(this,FifthActivity::class.java))
            val data="username=${et_username.text.toString()}&password=${et_password.text.toString()}"
            Toast.makeText(this,data,Toast.LENGTH_LONG).show()
//            val requestData=HashMap<String,String>()
//            requestData.put("username",et_username.text.toString())
//            requestData.put("password",et_password.text.toString())
            sendRequestWithHttpURLConnection(data)
            //sendRequestWithOkHttp("http://106.15.192.167:8080/userLogin","post",requestData)
//            HttpUtil.sendOkHttpRequest("http://106.15.192.167:8080/userLogin",requestData,object:Callback{
//                override fun onFailure(call: Call, e: IOException) {
//                    Log.e("MainActivity","发生错误了")
//                }
//
//                override fun onResponse(call: Call, response: Response) {
//                    val resultData=response.body?.string()
//                    var fromJson = Gson().fromJson<ResultOV>(resultData, ResultOV::class.java)
//                    if(fromJson.result=="ok"){
//
//                    }else{
//
//                    }
//                }
//
//            })
        }
    }
//    private fun sendRequestWithOkHttp(url:String,method:String,data:Map<String,String>){
//        thread {
//            try {
//                val client=OkHttpClient()
//                val userName=data.get("username").toString()
//                val password=data.get("password").toString()
//                val requestBody=FormBody.Builder()
//                    .add("username",userName)
//                    .add("password",password)
//                    .build()
//                val request= Request.Builder()
//                    .url(url)
//                    .post(requestBody)
//                    .build()
//                val response=client.newCall(request).execute()
//                val responseData=response.body?.string()
//                if(responseData!=null){
//                    //dealRseponse(responseData)
//                    Log.e("Okhttp",responseData)
//                }
//            }catch (e:Exception){
//                e.printStackTrace()
//            }
//        }
//    }
//    private fun dealRseponse(responseData:String){
//        Log.d("MainActivity",responseData)
//        Toast.makeText(this,responseData,Toast.LENGTH_LONG).show()
//        var result= Gson().fromJson(responseData,ResultObject::class.java)
//        if(result.result=="ok"){
//            val intentOK:Intent=(Intent(this,SecondActivity::class.java))
//            startActivity(intentOK)
//        }else{
//            //
//            val intentError:Intent=(Intent(this,ThirdActivity::class.java))
//            startActivity(intentError)
//        }
//    }
    private fun sendRequestWithHttpURLConnection(data:String):Unit{
        thread {
            var conn:HttpURLConnection?=null;
            try {
                var url= URL("http://8.135.69.192:8080/stuprogram_war/returnStudentsServlet")
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
                    var result=FileUtil.getStringFromInputStream(input)
                    Log.e("MainActivity",result);
                    var resultOV = Gson().fromJson<ResultOV>(result, ResultOV::class.java)
                    Log.e("MainActivity",resultOV.classes);
                    if(result=="100"){
                        //跳转到second
                        val intentOK:Intent=(Intent(this,SecondActivity::class.java))
                        startActivity(intentOK)
                    }else{
                        //
                        val intentError:Intent=(Intent(this,ThirdActivity::class.java))
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
/**
 * var url=URL("http://106.15.192.167/userLogin")
 * val con=url.openConnection() as HttpURLConnection
 * conn.requestMethod="POST"
 * conn.connectionTiemout=8000
 * conn.readTiemout=8000
 */
