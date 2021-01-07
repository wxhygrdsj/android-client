package com.example.chapter04.test;

public class Outer2 {

    private String str="hello";
    public static void printStr(String str){
        System.out.print(str);
    }
    public class Inner{
        /**
         * 内部类可以访问外部类的成员与方法
         */
        public void str2(){
            printStr(str);
        }
    }
    public static void main(String[] args){
        new Outer2().new Inner().str2();
    }
}
