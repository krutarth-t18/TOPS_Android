package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Fundamentals_basic_B35 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Digit dg = new Digit();
        System.out.print("Enter non-negative six digit number: ");
        int dig = sc.nextInt();
        dg.numTodig(dig);
    }
}

class Digit{
    public static void numTodig (int num){

        int a = num;
        int cnt = 0;
        while(num!=0){ //THIS LOOP IS FOR COUNTING THE NUMBER OF DIGITS IN THE NUMBER
            cnt++;
            num /= 10;
        }

        double div = Math.pow(10,cnt-1); //CREATING A div VARIABLE FOR DIVIDING THE NUMBER

        while(cnt!=0){
            System.out.print(((a/(int)div)%10)+" "); //PRINTING EVERY SINGLE DIGIT FROM LEFT TO RIGHT
            div = div/10;
            cnt--;
        }

    }
}