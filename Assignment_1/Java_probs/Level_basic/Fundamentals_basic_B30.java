package com.company;

public class Fundamentals_basic_B30 {
    public static void main(String[] args) {
        Numbers nb = new Numbers();
        nb.numbers();
    }
}

class Numbers{
    public static void numbers(){
        int i=1;
        while(i<=100){
            if((i%3==0 || i%5==0) || (i%3==0 && i%5==0)){
                System.out.println(i);
            }
            i++;
        }
    }
}
