package com.company;
import java.util.Scanner;

public class Fundamentals_basic_B18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        year yr = new year();
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        yr.leapyear(year);
    }
}
//year % 4 == 0 , year % 400 == 0, year % 100 !=0
class year{
    public void leapyear(int year){

        if(year % 4 == 0){
            if(year % 100 != 0) System.out.println("This is not a leap year");

            else if (year % 400 == 0) System.out.println("This is a leap year");

            else System.out.println("This is not a leap year");
        }
        else System.out.println("This is not a leap year");

    }
}