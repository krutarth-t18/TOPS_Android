package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Fundamentals_basic_B16 {
    /*
    B16 :- WRITE A PROGRAM THAT TAKES THREE NUMBERS FROM THE USERS AND PRINT THE GREATEST NUMBER.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Greater gt = new Greater();
        System.out.print("Enter number 1: ");
        int num0 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 3: ");
        int num2 = sc.nextInt();
        int max = gt.bigger_number(num0,num1,num2); //Method by using math.max function
        int Max = gt.greater_number(num0,num1,num2); //Method without using math.max function
        System.out.println("The greater number is: " + max);
    }
}

class Greater{
    public int bigger_number(int a,int b,int c){
        /*
        WITH MATH METHOD
         */
        int max0 = Math.max(a,b);
        int max1 = Math.max(max0,c);
        return max1;
    }

    public int greater_number(int a, int b, int c) {
        /*
        WITHOUT MATH METHOD
         */
        if (a > b && a > c) return a;

        else if (b > a && b > c) return b;

        else return c;
    }

}
