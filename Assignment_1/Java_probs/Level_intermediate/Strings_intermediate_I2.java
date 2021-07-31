package com.company;
import java.util.Scanner;

public class Strings_intermediate_I2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String str = sc.nextLine();
        System.out.print("Enter 2nd String: ");
        String startwith = sc.nextLine();
        Strings_intermediate_I2 start = new Strings_intermediate_I2();
        start.StartWith(str,startwith);

    }
    void StartWith(String str, String first){
        boolean bn = str.startsWith(first);
        System.out.println(str + "starts with "+ first+ " ? "+ bn);
    }
}
