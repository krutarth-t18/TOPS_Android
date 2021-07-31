package com.company;
import java.util.Scanner;

public class Strings_intermediate_I1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String str = sc.next();
        System.out.print("Enter 2nd String: ");
        String endwith = sc.next();
        Strings_intermediate_I1 end = new Strings_intermediate_I1();
        end.EndWith(str,endwith);


    }

    void EndWith(String str, String last){

        boolean bn = str.endsWith(last);
        System.out.println(str +" ends with "+ last+" ? "+bn);

    }
}
