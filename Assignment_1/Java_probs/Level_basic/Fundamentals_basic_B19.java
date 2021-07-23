package com.company;

public class Fundamentals_basic_B19 {
    public static void main(String[] args) {
        NaturalNumbers nb = new NaturalNumbers();
        nb.number();
    }
}
class NaturalNumbers{
    void number(){
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

    }
}
