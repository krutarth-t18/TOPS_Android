package com.company;

public class Fundamentals_basic_B33 {
    public static void main(String[] args) {
        PrimeNum pn = new PrimeNum();
        int sum = pn.prime_100();
        System.out.println("The sum of first 100 prime numbers is: "+sum);
    }

}

class PrimeNum{
    public static int prime_100(){
        int k = 2;
        int sum = 0,cnt = 0;
        while (true) {
            if(cnt == 100) break;

            int flag = 0;
            for (int i = 2; i < k; i++) {
                if (k % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if(flag != 1){
                sum += k;
                cnt++;
            }

            k++;
        }
        return sum;
    }
}
