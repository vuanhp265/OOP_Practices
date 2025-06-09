package org.example.Bai3;

import org.example.Bai1.Geometry;

public abstract class Rectangle extends Geometry {
    int area(int Width, int Length) {
        System.out.println("INT");
        return Width * Length;
    }
}
