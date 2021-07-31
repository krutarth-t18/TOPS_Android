package com.company;
import java.util.Scanner;

public class Arrays_intermediate_I1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter your array elements: ");
        for(int i=0;i<arr.length;i++) arr[i] = sc.nextInt();

        System.out.print("\nWhich element you want to remove? ");
        int index = sc.nextInt();

        System.out.print("The remaining array is: ");
        for(int i=0;i<arr.length;i++) {

            if(arr[i] == index) continue;
            System.out.print(arr[i] + " ");

        }
            
    }
}
