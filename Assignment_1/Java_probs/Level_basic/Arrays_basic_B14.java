package com.company;
import java.util.Scanner;

public class Arrays_basic_B14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Specific sf = new Specific();

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of an array:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        System.out.print("Enter the specific value: ");
        int value = sc.nextInt();
        boolean check = sf.space_val(arr,value);
        System.out.println(check);
    }
}

class Specific{
    public static boolean space_val(int arr[],int value){
        for(int x : arr)
        if(x == value) return true;

        return false;
    }
}
