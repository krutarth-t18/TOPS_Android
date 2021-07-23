package com.company;
import java.util.Scanner;

public class Fundamentals_basic_B27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character: ");
        char ch = sc.next().charAt(0);
        System.out.println("The ascii value of this character is: "+(int)ch);
    }
}
