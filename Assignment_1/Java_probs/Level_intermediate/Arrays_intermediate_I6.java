package com.company;

public class Arrays_intermediate_I6 {
    public static void main(String[] args) {
        String str[] = {"Aman", "Karan", "Bhavik", "Vishal", "Dev", "Dhruv", "Rutvik", "Vishal", "Karan"};
        Arrays_intermediate_I6 dps = new Arrays_intermediate_I6();
        dps.duplicate_string(str,str.length);
    }

    void duplicate_string(String str[], int lng){
        for(int i=0;i<lng;i++){
            for(int j=i+1;j<lng;j++){
                if(str[i].equals(str[j])) System.out.print(str[i]+" ");
            }
        }
    }
}
