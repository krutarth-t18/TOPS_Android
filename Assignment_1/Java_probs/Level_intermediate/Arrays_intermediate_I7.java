package com.company;
import java.util.Arrays;

public class Arrays_intermediate_I7 {
    public static void main(String[] args) {
        int arr[] = {5,60,23,50,46,12,45};
        Arrays_intermediate_I7 max = new Arrays_intermediate_I7();
        max.second(arr);
    }

    void second(int arr[]){
        Arrays.sort(arr);
        System.out.println("The 2nd largest element is: " + arr[arr.length-2]);

        // THIS APPROACH IS TO EASY FIRST FIND THE MAXIMUM NUMBER THEN FIND THE 2ND LARGEST NUMBER BY USING THIS MAXIMUM NUMBER.
        /*int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max < arr[i]) max = arr[i];
        }
        int second_max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] == max) continue;

            if(second_max < arr[i]) second_max = arr[i];
        }
        System.out.println(second_max);   */

    }
}
