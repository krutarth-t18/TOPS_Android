package com.company;
import java.util.Scanner;

public class Arrays_basic_B15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4,2,3,5,6};
        System.out.print("I have this elements in array: ");
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");

        System.out.println();

        System.out.print("Which index of element do you want to know? ");
        int element = sc.nextInt();

        for(int j = 0;j<arr.length;j++)
        if(arr[j] == element) System.out.println("The index of "+ element +" is: "+j);
    }
}
