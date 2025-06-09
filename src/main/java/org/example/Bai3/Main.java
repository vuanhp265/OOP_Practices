package org.example.Bai3;

import org.example.Bai1.Circle;
import org.example.Bai1.Square;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        org.example.Bai3.Rectangle rectangle1 = new Rectangle() {

            @Override
            public double area() {
                return 0;
            }

            @Override
            public double perimeter() {
                return 0;
            }
        };
        int areaRecInt = rectangle1.area(2,4);
        System.out.println("Area rectangle =" + areaRecInt);
    }
}