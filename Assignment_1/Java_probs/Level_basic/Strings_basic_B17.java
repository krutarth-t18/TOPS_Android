package com.company;
import java.util.Scanner;

public class Strings_basic_B17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        System.out.print("There is total "+str.length()+" characters in your string," +
                "\nWhich index of character do you want to know? ");
        int index = sc.nextInt();
        System.out.println("The character at position "+ index +" is : "+ ch[index]);
    }
}
