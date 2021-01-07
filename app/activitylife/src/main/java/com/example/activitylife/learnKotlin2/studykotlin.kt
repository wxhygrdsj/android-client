package learnKotlin

import java.lang.StringBuilder

fun main(){
    val fruits= listOf("apple","pear","grape","banana","watermelon")
//    val strBuilder=StringBuilder()
//    /**
//     * java  String 常量
//     *      StringBuffer 变量
//     *      StringBuilder 变量
//     *
//     */
//    strBuilder.append("水果列表:\n")
//    for(fruit:String in fruits){
//        strBuilder.append(fruit).append("\n")
//    }
//    strBuilder.append("开始吃水果")
//    println(strBuilder.toString())

    val result=with(StringBuilder()){
        append("水果列表:\n")
        for(fruit:String in fruits){
        append(fruit).append("\n")
     }
        append("开始吃水果")
        toString()
    }
    println(result)

    val result2=StringBuilder().run{
        append("水果列表:\n")
        for(fruit:String in fruits){
            append(fruit).append("\n")
        }
        append("开始吃水果")
        toString()
    }
    println(result2)

    val result3=StringBuilder().apply{
        append("水果列表:\n")
        for(fruit:String in fruits){
            append(fruit).append("\n")
        }
        append("开始吃水果")
    }
    println(result3.toString())
}