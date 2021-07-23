package com.company;
import java.util.Scanner;

public class Fundamentals_basic_B17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VowelConsonant vc = new VowelConsonant();
        System.out.print("Enter any character: ");
        char ch = sc.next().charAt(0);
        vc.CheckChar(ch);
    }
}

class VowelConsonant{
    /*
    A=65, E=69, I=73, O=79, U= 85
    a=97, e=101, i=105, o=111, u=117
    A-Z = 65-90
    a-z = 97-122
     */
    public void CheckChar(char ch){
        if(ch>=65 && ch<= 90){
            if(ch == 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') System.out.println("Vowel");

            else System.out.println("Consonant");

        }
        else if(ch >= 97 && ch <= 122){
            if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') System.out.println("Vowel");

            else System.out.println("Consonant");
        }
        else System.out.println("This is not a Vowel as well as a Consonant");

    }

}