package com.company;

import java.util.Arrays;

public class Arrays_advance_A4 {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    }
}
