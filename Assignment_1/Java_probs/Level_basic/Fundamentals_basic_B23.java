package com.company;

public class Fundamentals_basic_B23 {
    public static void main(String[] args) {
        int flag = 1;
        int count;
        for(int i=0;i<5;i++){
            count = 0;

            for(int j=0;j<=i;j++){
                System.out.print(flag);
                if(flag == 1) flag = 0;
                else flag = 1;
                count++;
            }
            if(count % 2 == 0) flag = 1;

            System.out.println();
        }
    }
}

/*
1
01
101
0101
10101
 */