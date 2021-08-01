package com.company;

public class Arrays_advance_A2 {
    public static void main(String[] args) {
        int arr[] = {23,34,46,16,73,15,6,45,53};
        Arrays_advance_A2 avg = new Arrays_advance_A2();
        avg.average(arr,arr.length-2);
    }

    void average(int avg[],int lng){
        System.out.print("The array elements are: ");
        for(int i=0;i<avg.length;i++) System.out.print(avg[i]+" ");
        int max = avg[0];
        int min = avg[0];

        for(int i=1;i<avg.length;i++){
            if(max < avg[i]) max = avg[i];

            if(min > avg[i]) min = avg[i];
        }

        System.out.println();
        int sum = 0;

        for(int i=0;i<avg.length;i++){

            if(avg[i] == max || avg[i] == min)  continue;

            sum += avg[i];
        }

        System.out.print("The average value of an array elements except smallest and largest element is: "+ sum/lng);

    }
}
