package org.example.Bai4;

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