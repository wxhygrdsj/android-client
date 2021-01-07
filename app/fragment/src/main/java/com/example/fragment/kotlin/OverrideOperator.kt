package com.example.fragment.kotlin

class Money(val value:Int){
    operator fun plus(money: Money):Money{
        val sum=value+money.value
        return Money(sum)
    }
}
fun main(){
    val m1=Money(3)
    val m2=Money(5)
    val m3=m1+m2
    println(m3.value)
}