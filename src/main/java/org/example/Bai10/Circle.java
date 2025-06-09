package org.example.Bai10;

public abstract class Circle extends Shape {
    public double radius;

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
