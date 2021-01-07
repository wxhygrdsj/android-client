package com.example.fragment.kotlin

object StringUtil{
    fun letterCount(str:String):Int{
        var count=0
        for(char in str){
            if(char.isLetter()){
                count++;
            }
        }
        return count;
    }

}
fun main(){
    var str="hello world!"
    println(StringUtil.letterCount(str))
    println(str.letterCount())
}
fun String.letterCount():Int{
    var count=0
    for(char in this){
        if(char.isLetter()){
            count++;
        }
    }
    return count;
}