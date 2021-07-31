package com.company;
import java.util.Scanner;

public class Arrays_intermediate_I2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<arr.length;i++) arr[i] = sc.nextInt();

        int arr1[] = new int[arr.length];
        for(int j=0;j<arr1.length;j++) arr1[j] = arr[j];

        System.out.print("The copied array is: ");
        for(int k=0;k<arr1.length;k++) System.out.print(arr1[k]+" ");

    }
}
