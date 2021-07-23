package com.company;

public class Fundamentals_basic_B22 {
    public static void main(String[] args) {
        int sum = 1;
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();
        }
    }
}
/*
1
2 3
4 5 6
7 8 9 10
 */