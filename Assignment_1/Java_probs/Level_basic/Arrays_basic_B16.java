package com.company;
import java.util.*;

public class Arrays_basic_B16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(max < arr[i]) max = arr[i];

            if(min > arr[i]) min = arr[i];
        }
        System.out.println("The minimum element of array is: "+min);
        System.out.println("The maximum element of array is: "+max);
    }
}
