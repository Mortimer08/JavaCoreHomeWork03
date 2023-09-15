package org.example;

public abstract class Employee implements Comparable<Employee> {
    //region Static Fields
    private static int counter = 1000;

    //endregion
    //region Fields
    protected int id;
    protected String name;
    protected String surName;
    protected double salary;
    //endregion
    //region Constructors
    protected Employee(String surName, String name, double salary){
        this.surName = surName;
        this.name = name;
        this.setSalary(salary);
        id = counter++;
    }
    protected Employee(String surName, String name){
        this.surName = surName;
        this.name = name;
        id = counter++;
    }
    //endregion
    //region Getters and Setters


    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        if (salary < 30000) {
            throw new RuntimeException("Уровень заработной платы должен быть не менее 30000");
        }
        this.salary = salary;
    }

    //endregion
    protected abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) {
        return Double.compare(calculateSalary(), o.calculateSalary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
