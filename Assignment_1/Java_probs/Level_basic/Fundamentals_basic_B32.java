package com.company;
import java.util.Scanner;

public class Fundamentals_basic_B32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckDigit cd = new CheckDigit();
        System.out.print("Enter the first number between 25 to 75: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number between 25 to 75: ");
        int num2 = sc.nextInt();
        boolean equal = cd.checking_digits(num1,num2);
        System.out.println(equal);
    }
}

class CheckDigit{
    public static boolean checking_digits(int num1,int num2){
        boolean val = false;
        int a,b,c,d;
        a = num1%10;
        b = num1/10;
        c = num2%10;
        d = num2/10;
        if(a == c || a == d) val = true;

        if(b == c || b == d) val = true;

        return val;
        
    }
}