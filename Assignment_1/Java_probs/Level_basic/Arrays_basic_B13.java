package com.company;
import java.util.*;

public class Arrays_basic_B13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of an array:");
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("The average value of an array is: "+ sum/n);
    }
}
//{1,2,3,4,5}