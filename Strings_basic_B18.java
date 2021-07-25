package com.company;
import java.util.Scanner;

public class Strings_basic_B18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "TOPS";
        System.out.print("Enter your name with first underscore: ");
        String name = sc.next();
        System.out.println("Hello "+ (str+name)+".");

    }
}
                                