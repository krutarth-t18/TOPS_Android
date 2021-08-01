package com.company;

public class oop_basic_B38 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.super_class();  // calling method of parent class by object of parent class
        c.child_class();  // calling method of child class by object of child class
        c.super_class();  // calling method of parent class by object of child class
    }
}

class Parent{
    public void super_class(){
        System.out.println("This is a parent class.");
    }
}

class Child extends Parent{
    public void child_class(){
        System.out.println("This is a child class.");
    }
}
