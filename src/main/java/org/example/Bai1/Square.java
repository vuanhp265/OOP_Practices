package org.example.Bai1;

public class Square extends Geometry {

    public double side;
    @Override
    public double area() {
        return Math.pow(this.side,2);
    }

    @Override
    public double perimeter() {
        return 4*side;
    }
}
