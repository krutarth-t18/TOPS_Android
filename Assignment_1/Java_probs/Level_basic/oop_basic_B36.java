package com.company;

public class oop_basic_B36 {
    public static void main(String[] args){
        int num = 18;
        char ch = 'A';
        oop_basic_B36 method = new oop_basic_B36();
        method.Method(num,ch);
        method.Method(ch,num);

    }

    void Method(int num, char ch){
        System.out.println("Printing number and character by method one: "+num+" "+ch);
    }

    void Method(char ch, int num){
        System.out.println("Printing number and character by method two: "+num+" "+ch);
    }
}
