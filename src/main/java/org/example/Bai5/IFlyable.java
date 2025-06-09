package org.example.Bai5;

public interface IFlyable {
    public void fly();
}
class Bird implements IFlyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
class Plane implements IFlyable {
    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }
}