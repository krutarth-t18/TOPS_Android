package com.company;
import java.util.Scanner;

public class Fundamentals_basic_B20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number "+i+": ");
            int a = sc.nextInt();
            sum += a;
        }
        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+sum/5);

    }
}
