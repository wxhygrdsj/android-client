package com.example.chapter04.test;

public class Outer {

    private String str="hello";
    public static void printStr(String str){
        System.out.print(str);
    }
    static class Inner{
        /**
         * Inner是static类，不能使用Outer类中非静态的属性和方法
         */
        public void str2(){
            printStr("hello");
        }
    }
    public static void main(String[] args){
        new Outer.Inner().str2();
    }
}
