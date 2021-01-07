package com.example.networkdemo.model

class Student(val stuNo:String,
              val stuName:String,
              val classes:String,
              val gender:String,
              val department:String,
              val tel:String,
              val dormNo:String,
              val photoPath:String
) {
    override fun toString(): String {
        return stuNo+","+stuName+","+classes+","+gender+","+tel;
}}