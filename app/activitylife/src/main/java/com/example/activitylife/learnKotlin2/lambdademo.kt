package com.example.activitylife.learnKotlin2

fun main(){
    /**
     * val variable:(type,type,..)->Type={
     *      v1,v2,..->
     * }
     * (type1,type2)->type3相当于类型=右边相当于lambda表达式的实现
     * v1,v2,..相当于形参
     * ->右边相当于函数体
     */
    /**
     * 求1-n之和
     */
    val sumN:(Int)->Int={
        n ->
        var sum:Int=0
        for(i in 1..n){
            sum+=i
        }
        //lambda表达式最后一行是返回值
        sum
    }
    println(sumN(100))
    //求两个最大值
    val max:(Int,Int)->Int={
        a,b->
        if(a>b)
            a
        else
            b
    }
    println(max(50, 6))
    /**
     * lambda第二种形式
     * val:variable={n1:Type,n2:Type->
     * }
     */
    var sumN2={n:Int->
        var sum=0
        for(i in 1..n){
            sum+=i
        }
        sum
    }
    println(sumN2(100))
    var max2={a:Int,b:Int->
        if(a>b)
            a
        else
            b
    }
    println(max2(15, 20))
}