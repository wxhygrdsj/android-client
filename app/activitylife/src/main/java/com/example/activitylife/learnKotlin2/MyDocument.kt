package com.example.activitylife.learnKotlin2

import java.io.InputStream
import java.io.OutputStream

/**
 * 类实现接口,使用 :
 * java中extends,implements
 */
class MyDocument:Document{
    override val version: String
        get() = "1.0"
    override val Size: Long
        get() = 10000

    override fun saveDoc(out: OutputStream) {
        TODO("Not yet implemented")
        println("文件已保存")
    }
    override fun loadDoc(input: InputStream) {
        println("文件已装载")
    }
    override fun getDescription(): String {
        //return super.getDescription()
        return "这是关于kotlin编程的文档"
    }
}
fun main(){
    val doc=MyDocument()
    println(doc.getDescription())
    println(doc.version)
    println(doc.Size)
}