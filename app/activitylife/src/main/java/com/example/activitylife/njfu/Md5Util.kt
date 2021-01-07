package com.example.activitylife.njfu

import java.math.BigInteger
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

object Md5Util {
    fun stringToMD5(plainText: String): String? {
        var secretBytes: ByteArray? = null
        secretBytes = try {
            MessageDigest.getInstance("md5").digest(
                plainText.toByteArray()
            )
        } catch (e: NoSuchAlgorithmException) {
            throw RuntimeException("没有这个md5算法！")
        }
        var md5code: String = BigInteger(1, secretBytes).toString(16)
        for (i in 0 until 32 - md5code.length) {
            md5code = "0$md5code"
        }
        return md5code
    }
    fun getRandom():Int{
        return(1..9).random()
    }
}

fun main(){
    println(Md5Util.stringToMD5("123456"))
    println(Md5Util.getRandom())
}

