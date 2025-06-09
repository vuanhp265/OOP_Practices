package org.example.Bai1;

public class Rectangle extends Geometry {
    public double length;
    public double width;
    @Override
    public double area() {
        return length*width;
    }
    public int area(int Width, int Length) {
        System.out.println("INT");
        return Width * Length;
    }
    double area(double Width, double Length) {
        System.out.println("DOUBLE");
        return Width * Length;
    }
    double plus(double x, double y){
        return x+y;
    }
    @Override
    public double perimeter() {
        return (length+width)*2;
    }
}
