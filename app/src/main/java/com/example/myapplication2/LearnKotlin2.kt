package com.example.myapplication2

fun main(){
    val a:Int=5;
    val b:Int=6;
    println(add(a,b));
    //printrectangel(6);
    print(hello("zhangsan"))
    print2("kusx")
    var rt=Rectangle
    rt.printArea(23,45);
    printArea(23,45)
    fizzbuzz4(0,50)
    foo(12)
    foo2(1)
    println(lagernum(3,5))
    println(getScore("Tom"))
    println(sum100())
    //object
    //创建对象不需要new
    val p1=Person()
    p1.name="张三"
    p1.age=18
    p1.eat()
    val p3=Student3("hh",19)
    p3.doHomework()
    p3.readBooks()
}

fun add(num1:Int,num2:Int):Int{
    return num1+num2;
}
/*fun printrectangel(n:Int){
    for(i in 1..n){
        for(j in 1..n){
            print("#");
        }
        println("");
    }
}*/

fun hello(name: String):String = "hello $name";
//fun hello():String{
//    return "hello world";
//}
//函数没有返回值，使用Unit,相当于java中的void
fun print2(str:String):Unit{

    println(str);
}
object Rectangle{
    fun printArea(width:Int,height:Int):Unit{
        val area= calculateArea(width,height)
        println("The area is $area")

    }
    fun calculateArea(width: Int,height: Int):Int{
        return width*height
    }
}
fun printArea(width: Int,height: Int):Unit{
    fun calculateAre(width: Int,height: Int):Int=width*height
    var area=calculateAre(width,height)
    println("the area is $area")
}
fun fizzbuzz4(start:Int,end:Int):Unit{
    for(k in start..end){
        fun isFizz():Boolean=k%3==0
        fun isBuzz():Boolean=k%5==0
        when{
            isFizz() &&isBuzz()-> println("Fizz Buzz")
            isFizz()-> println("Fizz")
            isBuzz()-> println("Buzz")
            else -> println(k)
        }
    }
}
fun foo(k:Int):Unit{
    require(k>10,{"5should"})
    println("$k")
}
fun foo2(a:Int):Unit{
    check(a<5,{"ashould"})
    println(a);
}
fun lagernum(num1:Int,num2:Int)=if(num1>num2) num1 else num2
fun getScore(name:String)=when(name){
     "Tom"->86
     "Jim"->77
     else->0
 }
fun sum100():Int{
    var sum=0
    for(i in 1..100)//1 until 100 左闭右开
        sum+=i
    return sum
}
//定义对象
class Person{
    var name=""
    var age=0
    fun eat(){
        println(name+" i: "+age)
        println("$name i: $age")
    }
}
interface  Study{
    fun readBooks()
    fun doHomework()
}
class Student3(val name:String,val age:Int):Study{
    override fun readBooks() {
        println(name+" is reading")
    }

    override fun doHomework() {
        println(name+" is doing homework")

    }
}

