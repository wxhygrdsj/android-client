package com.example.networkdemo.kotLinlearning

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import edu.njfu.sas.model.User

fun main(){
    val users= arrayListOf<User>()
    users.add(User("zhangsan","123456"))
    users.add(User("lisi","123456"))
    val json=Gson().toJson(users)
    val user2=Gson().fromJson<List<User>>(json,object:TypeToken<List<User>>(){}.type)
    for (u in user2){
        println(u.username+" +"+u.password)
    }
}