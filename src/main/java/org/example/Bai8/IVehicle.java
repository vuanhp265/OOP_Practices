package org.example.Bai8;

public interface IVehicle {
    public void start();
    public void accelerate();
    public void brake();
}
class Car implements IVehicle {

    @Override
    public void start() {
        System.out.println("Car start");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Car brake");
    }
}
class Bike implements IVehicle {
    @Override
    public void start() {
        System.out.println("Bike start");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Bike brake");
    }
}
class Truck implements IVehicle {

    @Override
    public void start() {
        System.out.println("Truck start");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Truck brake");
    }
}

