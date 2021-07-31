package com.company;
import java.util.Scanner;

public class Arrays_intermediate_I3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter your array elements: ");
        for(int i=0;i<arr.length;i++) arr[i] = sc.nextInt();

        System.out.print("Enter the value and position number that you want to insert.\n");
        int value = sc.nextInt();
        int position = sc.nextInt();
        int arr1[] = new int[n+1];
        arr1[position] = value;
        for(int i=0;i<position;i++) arr1[i] = arr[i];

        for(int j=position+1;j<arr1.length;j++) arr1[j] = arr[j-1];

        for(int k=0;k<arr1.length;k++) System.out.print(arr1[k]+" ");

    }
}
