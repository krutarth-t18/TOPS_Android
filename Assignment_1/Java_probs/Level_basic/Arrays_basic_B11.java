package com.company;
import java.util.Scanner;

public class Arrays_basic_B11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements of array");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<arr.length/2;i++){
            for(int j = 0;j<arr.length-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("The sorted array is:");
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");

    }
}
