package com.company;

import java.util.Scanner;

public class oop_intermediate_I1 {
    public static void main(String[] args) {
        oop_intermediate_I1 fecto = new oop_intermediate_I1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        System.out.println("The factorial of a given number is: "+fecto.factorial(num));
    }

    int factorial(int n){
        if(n==1) return n;

        return n*factorial(n-1);
    }
}
