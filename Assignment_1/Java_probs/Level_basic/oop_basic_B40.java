package com.company;

public class oop_basic_B40 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.area(10,20);
        sq.area(15);
        sq.perimeter(10,15);
        sq.perimeter(15);
    }
}

class Rectangle{
    
    void area(double length, double breadth){
        System.out.println("The area of a rectangle is: "+ (length*breadth));
    }
    void perimeter(double length, double breadth){
        System.out.println("The perimeter of rectangle is: "+ (2*length + 2*breadth));
    }
    
}

class Square extends Rectangle{
    void area(double length){
        System.out.println("The area of a square is: "+ (length*length));
    }
    void perimeter(double length){
        System.out.println("The perimeter of square is: "+ (4*length));
    }
}