package com.company;
import java.util.Scanner;

public class Fundamentals_basic_B34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Range rng = new Range();
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        boolean range = rng.range(num1,num2);
        System.out.println(range);
    }
}

class Range{
    public static boolean range(double a, double b){

        if(a <= 1 && a >= 0) if (b <= 1 && b >= 0) return  true;

        return false;
    }
}
