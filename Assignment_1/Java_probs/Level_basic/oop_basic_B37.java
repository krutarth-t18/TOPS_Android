package com.company;

public class oop_basic_B37 {
    public static void main(String[] args) {
        oop_basic_B37 area = new oop_basic_B37();
        double length_for_rectangle = 10, breadth_for_rectangle = 15;
        double length_for_square = 8;
        area.Area(length_for_rectangle,breadth_for_rectangle);
        area.Area(length_for_square);
    }

    public void Area(double l, double b){
        System.out.println("The area of rectangle is: " + l*b);
    }

    public void Area(double l){
        System.out.println("The area if square is: "+ l*l);
    }
}
