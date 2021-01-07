package com.example.chapter04.test;

public class StaticTest {
    public static void  print(){
        System.out.print("daaa");
    }
    public static void main(String[] args){
        /**
         * main()是static方法，不能直接调用类中的非静态方法
         * 静态的方法 ，可以引用类中的静态成员或静态方法
         */
        print();
    }
}
