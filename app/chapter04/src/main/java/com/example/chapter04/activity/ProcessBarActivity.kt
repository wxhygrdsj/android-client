package com.example.chapter04.activity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.chapter04.R
import kotlinx.android.synthetic.main.activity_process_bar.*

class ProcessBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_process_bar)
        button5.setOnClickListener {
            if(progressBar.visibility== View.VISIBLE){
                progressBar.visibility= View.GONE
            }else{
                progressBar.visibility= View.VISIBLE
            }
        }
        button6.setOnClickListener {
            progressBar2.progress+=5
        }
        button7.setOnClickListener {
            progressBar2.progress-=5
        }
        //alertdialog
        button8.setOnClickListener {
            val context:ProcessBarActivity=this
            var block: AlertDialog.Builder.() -> Unit = {
                setTitle("提示信息")
                setMessage("helloworld")
                setCancelable(false)
                //确定按钮
                setPositiveButton("确定") { dialog: DialogInterface?, which: Int ->
                    Toast.makeText(context, "OK", Toast.LENGTH_LONG).show()
                    Log.d("ok", "ok")
                }
                //否定按钮
                setNegativeButton("取消"){
                    dialog, which ->
                    Toast.makeText(context,"cancel",Toast.LENGTH_LONG).show()
                    Log.d("cancel","cancel")
                }
                    
                
            }
            var dialog:AlertDialog.Builder = AlertDialog.Builder(context).apply(block)
            dialog.show()

        }
    }
}