package com.company;

public class oop_basic_B41 {
    public static void main(String[] args) {
        Triangle tri = new Triangle();
        tri.area(3,4,5);
    }
}

class Triangle{
    public void area(double a, double b,double c){
        double perimeter = (a+b+c)/2;
        double sqroot = (perimeter)*(perimeter-a)*(perimeter-b)*(perimeter-c);
        double area = Math.sqrt(sqroot);
        System.out.println("The area of Triangle is: "+area);
        System.out.println("The perimeter of Triangle is: "+perimeter);
    }

}
