package com.company;
import java.util.Scanner;

public class Fundamentals_basic_B28 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Compute cp = new Compute();
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int compute = cp.compute(num);
        System.out.println("The computation of number "+num+" like (n + nn + nnn) is : "+compute);
    }
}

class Compute{
    public static int compute(int num){
        int a = num; //2
        int b = (a*10)+a; //(2*10) + 2 = 22
        int c = (b*10)+a; //(22*10) + 2 = 222
        return a+b+c;
    }
}