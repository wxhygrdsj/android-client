package com.example.networkdemo.kotLinlearning

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking{
        launch{
            for(i in 1..10){
                println("coroutine1"+i)
            }
        }
        launch{
            for(i in 1..10){
                println("coroutine2"+i)
            }
        }
    }
}
