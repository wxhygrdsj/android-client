package com.example.talk_demo.test

import java.lang.Exception
import java.lang.IllegalArgumentException

sealed class Result
class Success(val msg:String):Result()
class Failure(val error:Exception):Result()

/**
 * 密封类
 * 当密封类作为对象作为变量时，编译器自动检查密封类的子类
 */

fun getResultMsg(result: Result)=when(result){
    is Success->result.msg
    is Failure->result.error
//    else->throw  IllegalArgumentException()
}

fun main() {
    val s=Success("ok")
    val f=Failure(Exception("there is a error!"))
    println(getResultMsg(s));
    println(getResultMsg(f));

}
