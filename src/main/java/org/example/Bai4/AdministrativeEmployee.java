package org.example.Bai4;

class AdministrativeEmployee extends Employee {
    double monthlySalary;

    public AdministrativeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }
}
