package com.company;
import java.util.Scanner;

public class oop_basic_B42 {
    public static void main(String[] args) {
        Complex cmp = new Complex();
        cmp.taking_ip();
    }
}

class Complex{

    void taking_ip(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real and imaginary value of 1st complex number: ");
        double real1 = sc.nextDouble();
        double img1 = sc.nextDouble();
        System.out.print("Enter the real and imaginary value of 2nd complex number: ");
        double real2 = sc.nextDouble();
        double img2 = sc.nextDouble();
        sum(real1, real2, img1, img2);
        difference(real1, real2, img1, img2);
        product(real1, real2, img1, img2);
    }
    void sum(double real1,double real2, double img1, double img2){
         double real_sum = real1 + real2;
         double img_sum = img1 + img2;
         System.out.print("The sum of this two complex number is: ");
         if(img_sum >0 ) System.out.println((int)real_sum +"+"+(int)img_sum+"i");

         else System.out.println((int)real_sum +""+(int)img_sum+"i");
    }
    void difference(double real1,double real2, double img1, double img2){
        double real_diff = real1 - (real2);
        double img_diff = img1 - (img2);
        System.out.print("The difference of this two complex number is: ");
        if(img_diff > 0) System.out.println((int) real_diff +"+"+(int)img_diff+"i");

        else System.out.println((int) real_diff +""+(int)img_diff+"i");

    }
    void product(double real1,double real2, double img1, double img2){
        double product1 = real1*real2;
        double product2 = real1*img2;
        double product3 = img1*real2;
        double product4 = -(img1*img2);

        double real_part = product1 + product4;
        double img_part = product2 + product3;
        System.out.print("The multiplication of this two complex number is: ");
        System.out.println((int)real_part +""+(int)img_part+"i");

    }

}
