package org.example.Bai1;

public class Circle extends Geometry {
    public double radius;
    @Override
    public double area() {
        return Math.PI*Math.pow(this.radius,2);
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
