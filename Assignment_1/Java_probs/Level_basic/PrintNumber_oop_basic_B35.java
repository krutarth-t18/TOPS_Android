package com.company;

public class PrintNumber_oop_basic_B35 {
    public static void main(String[] args) {
        PrintNumber_oop_basic_B35 pn = new PrintNumber_oop_basic_B35();
        byte b = 4;
        long l = 513647064;
        pn.printn(23); //int
        pn.printn(3.142353345);  //double
        pn.printn(l);   //long
        pn.printn("Krutarth Trivedi"); //String
        pn.printn(b);  //byte
        pn.printn('z');      //char
    }

    void printn(int n) {
        System.out.println("This is int: "+n);
    }
    void printn(double n){
        System.out.println("This is double: "+n);
    }
    void printn(long n){
        System.out.println("This is long: "+n);
    }
    void printn(String n){
        System.out.println("This is String: "+n);
    }
    void printn(byte n){
        System.out.println("This is byte: "+n);
    }
    void printn(char n){
        System.out.println("This is char: "+n);
    }
}
