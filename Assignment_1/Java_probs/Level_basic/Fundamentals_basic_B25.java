package com.company;
import java.util.Scanner;

public class Fundamentals_basic_B25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Digits dg = new Digits();
        System.out.print("Input an integer number less than ten billion: ");
        int num = sc.nextInt();
        int digits = dg.total_digits(num);
        System.out.println("Number of digits in the number: "+digits);
    }
}

class Digits{
    public static int total_digits(int n){
        int cnt = 0;
        while(n!=0){
            int rem = n%10;
            cnt++;
            n = n/10;
        }
        return cnt;
    }
}
