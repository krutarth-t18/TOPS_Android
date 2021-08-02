package com.company;

import java.util.Scanner;

public class oop_intermediate_I3 {
    public static void main(String[] args) {
        Marks mks = new Marks();
        mks.asking();
    }
}

class Marks{
    void asking(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int mks = sc.nextInt();
        grade(mks);
    }
    void grade(int marks){
        if(marks >= 91 && marks <=100) System.out.println("You got AA grade.");

        else if(marks >= 81 && marks <=90) System.out.println("You got AB grade.");

        else if(marks >= 71 && marks <=80) System.out.println("You got BB grade.");

        else if(marks >= 61 && marks <=70) System.out.println("You got BC grade.");

        else if(marks >= 51 && marks <=60) System.out.println("You got CD grade.");

        else if(marks >= 41 && marks <=50) System.out.println("You got DD grade.");

        else if(marks <= 40) System.out.println("You are fail.");
    }
}
