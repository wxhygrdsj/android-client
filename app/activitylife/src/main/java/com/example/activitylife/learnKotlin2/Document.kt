package com.example.activitylife.learnKotlin2

import java.io.InputStream
import java.io.OutputStream

interface Document {
    val version:String
    val Size:Long
    val title:String
    get() = "No Name"
    //定义其他方法
    fun getDescription():String{
        return "this is a test!"
    }
    fun saveDoc(out:OutputStream)
    fun loadDoc(input:InputStream)
}
