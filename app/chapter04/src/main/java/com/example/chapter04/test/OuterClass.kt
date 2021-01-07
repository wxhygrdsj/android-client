package com.example.chapter04.test
class OuterClass{
    private lateinit var name:String
    var count=0
    fun add(){
        count++
    }
    inner class Inner{
        fun doSomeThin():Int{
            add()
            this@OuterClass.add()
            return this@OuterClass.count
        }
    }
}

fun main(){
    val out=OuterClass()
    val inner=out.Inner()
    println(inner.doSomeThin())
/**
*延迟变量初始化
 * 可以通过lateinit关键字，对变量进行延迟初始化
 * 在调用前确保变量被初始化了
*/
}

