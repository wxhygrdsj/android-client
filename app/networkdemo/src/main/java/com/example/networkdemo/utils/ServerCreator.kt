package com.example.networkdemo.utils

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServerCreator {
    private const val BASE_URL="http://106.15.192.167:8080/"
    private val retrofit=Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun <T> create(serviceClass:Class<T>):T= retrofit.create(serviceClass)
    inline fun <reified  T> create():T=create(T::class.java)

}