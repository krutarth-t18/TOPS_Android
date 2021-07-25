package com.company;

public class Arrays_basic_B11sorting_string {
    public static void main(String[] args) {
        String str = "bhavik";
        char ch[] = str.toCharArray();

        for(int i = 0;i<ch.length/2;i++){
            for(int j = 0;j<ch.length-1;j++) {
                if (ch[j] > ch[j + 1]) {
                    char temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
            }
        }

        for(int i=0;i<ch.length;i++) System.out.print(ch[i]+" ");
    }
}
