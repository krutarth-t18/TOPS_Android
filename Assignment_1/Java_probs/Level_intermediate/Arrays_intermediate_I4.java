package com.company;
import java.util.Scanner;

public class Arrays_Intermediate_I4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter your array elements: ");
        for(int i=0;i<arr.length;i++) arr[i] = sc.nextInt();

        for(int j=0;j<arr.length/2;j++){

            int temp = arr[j];
            arr[j] = arr[arr.length-j-1];
            arr[arr.length-j-1] = temp;

        }

        System.out.print("The reverse array is: ");
        for(int k=0;k<arr.length;k++) System.out.print(arr[k]+" ");
    }
}
