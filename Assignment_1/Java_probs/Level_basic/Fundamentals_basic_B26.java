package com.company;
import java.util.Scanner;

public class Fundamentals_basic_B26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String with letters,digits and numbers: ");
        String str = sc.nextLine();
        int cnt1 = 0,cnt2,cnt3;
        cnt2 = cnt3 = cnt1;
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] >= 65 && ch[i] <= 90) cnt1++;

            else if(ch[i] >= 97 && ch[i] <= 122) cnt1++;

            if(ch[i] >= 48 && ch[i] <= 57) cnt2++;

            if(ch[i] == ' ') cnt3++;
        }

        System.out.println("There are total "+ cnt1 +" letters, "+ cnt2 +" digits and "+ cnt3+ " spaces in your String");
    }
}
