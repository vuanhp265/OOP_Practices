package org.example;

public abstract class Employee {

    public Employee(String name) {
        System.out.println();
        this.name = name;
    }

    public String name;
}
    class AdministrativeEmployee extends Employee{
    double monthlySalary;

    public AdministrativeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }
}
class ProductionEmployee extends Employee {
    int unitsProduced;
    double ratePerUnit;

    public ProductionEmployee(String name, int unitsProduced, double ratePerUnit) {
        super(name);
        this.unitsProduced = unitsProduced;
        this.ratePerUnit = ratePerUnit;
    }

    public double calculateSalary() {
        return unitsProduced * ratePerUnit;
    }
}
