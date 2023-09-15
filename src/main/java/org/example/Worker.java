package org.example;

public class Worker extends Employee{
    private double fixedMonthlyPayment;

    protected Worker(String surName, String name, double salary) {

        super(surName, name, salary);
        fixedMonthlyPayment = salary;
    }

    @Override
    public double calculateSalary() {
        return fixedMonthlyPayment;
    }
}
