package com.company;

public class Arrays_advance_A1 {
    public static void main(String[] args) {
        String batch1[] = {"Bhargav","Dhruv","Vivek","Rutvik","Hiten","Mihir","Hardik","Vishal"};
        String batch2[] = {"Dev","Taj","Rutvik","Malay","Hardik","Dipak","Mayur"};
        Arrays_advance_A1 check = new Arrays_advance_A1();
        check.common(batch1,batch2);
    }

    void common(String batch1[], String batch2[]){

        for(int i=0;i<batch1.length;i++){
            for(int j=0;j<batch2.length;j++){
                if(batch1[i] == batch2[j]) System.out.print(batch1[i]+" ");
            }
        }

    }
}
