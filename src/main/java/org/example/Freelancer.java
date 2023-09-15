package org.example;

public class Freelancer extends Employee {
    protected double hourlyPayment;

    protected Freelancer(String surName, String name, double hourlyPayment) {
        super(surName, name);
        this.hourlyPayment = hourlyPayment;
        super.setSalary(this.calculateSalary());
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * hourlyPayment;
    }
}
