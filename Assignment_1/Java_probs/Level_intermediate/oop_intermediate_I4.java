package com.company;

public class oop_intermediate_I4 {
    public static void main(String[] args) {
        square sq = new square();
        sq.method1();
        sq.method2();
    }
}

class Shape{
    void method1(){
        System.out.println("This is shape.");
    }
}

class rectangle extends Shape{
    void method2(){
        System.out.println("This is Rectangle.");
    }
}

class Circle extends Shape{
    void method3(){
        System.out.println("This is Circle.");
    }
}

class square extends rectangle{
    void method4(){
        System.out.println("Square is a rectangle.");
    }

}
