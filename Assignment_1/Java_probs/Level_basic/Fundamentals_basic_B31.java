package com.company;
import java.util.Scanner;

public class Fundamentals_basic_B31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Check ck = new Check();
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        boolean value = ck.check_sum(num1,num2,num3);
        System.out.println("The result is: "+value);
    }
}

class Check{
    public static boolean check_sum(int a, int b, int c){
        int add = a+b;
        if(c == add) return true;
        else return false;
    }
}
