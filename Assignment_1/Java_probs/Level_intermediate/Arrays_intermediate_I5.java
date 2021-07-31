package com.company;

public class Arrays_intermediate_I5 {
    public static void main(String[] args){
        int arr2[] = { 1, 2, 3, 1, 3, 6, 6};
        Arrays_intermediate_I5 dp = new Arrays_intermediate_I5();
        dp.duplicates(arr2,arr2.length);
    }

    void duplicates(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]) System.out.print(arr[j]+" ");
            }
        }

    }
}
