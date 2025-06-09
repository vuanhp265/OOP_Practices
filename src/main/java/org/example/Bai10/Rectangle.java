package org.example.Bai10;

public abstract class Rectangle extends Shape{
    public double width;
    public double length;
    @Override
    public double area() {
        return width*length;
    }
}
