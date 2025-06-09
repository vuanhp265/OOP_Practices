package org.example.Bai1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Please input side \r\n");
        double side = 10;
        Square square = new Square();
        square.side = side;
        double area = square.area();
        System.out.println("Area = " + area);

        Circle circle = new Circle();
        circle.radius = 10;
        double areaCircle = circle.area();
        System.out.println("Area circle = " + areaCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.length = 10;
        rectangle.width = 5;
        double p_rectangle = rectangle.perimeter();
        System.out.println("Perimeter rectangle = " + p_rectangle);
        double a_rectangle = rectangle.area();
        System.out.println("Area rectangle = " + a_rectangle);

        Rectangle rectangle1 = new Rectangle();
        int areaRecInt = rectangle1.area(2,4);
        System.out.println("Area rectangle INT =" + areaRecInt);
    }
}