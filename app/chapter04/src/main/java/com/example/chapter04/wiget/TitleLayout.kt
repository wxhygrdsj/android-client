package com.example.chapter04.wiget

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.Toast
import com.example.chapter04.R
import kotlinx.android.synthetic.main.title.view.*
import java.util.jar.Attributes

class TitleLayout (context:Context,attrs:AttributeSet):LinearLayout(context,attrs){
    init{
        var from=LayoutInflater.from(context)
        from.inflate(R.layout.title,this)
        titleBack.setOnClickListener {
            var activity:Activity=context as Activity
            activity.finish()
        }
        titleEdit.setOnClickListener {
            Toast.makeText(context,"你点击了Edit Button",Toast.LENGTH_LONG).show()
        }
    }
}