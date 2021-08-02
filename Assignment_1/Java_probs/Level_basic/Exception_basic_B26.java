package com.company;

import java.util.Scanner;

public class Exception_basic_B26 {
    public static void main(String[] args) {
        Operation op = new Operation();
        op.asking();
    }
}

class Operation{
    void asking(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        div(a,b);
    }
    void div(int a,int b){
        try{
            int div = a/b;
            System.out.print("The division is: "+div);
        }
        catch(Exception ex) {
            ex.printStackTrace();

        }
    }
}
