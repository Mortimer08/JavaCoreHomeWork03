package org.example;

import org.example.comparators.EmployeeNameComparator;
import org.example.comparators.EmployeeSalaryComparator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee worker1 = new Worker("Иванов", "Иван", 30000);
        Employee freelancer1 = new Freelancer("Петров", "Петр", 1000);
        Employee worker2 = new Worker("Сидоров", "Иван", 35000);
        Employee freelancer2 = new Freelancer("Петров", "Денис", 800);
        Employee worker3 = new Worker("Смирнов", "Дмитрий", 60000);
        Employee freelancer3 = new Freelancer("Скалкин", "Валерий", 500);
        employees.add(worker1);
        employees.add(freelancer1);
        employees.add(worker2);
        employees.add(freelancer2);
        employees.add(worker3);
        employees.add(freelancer3);
        System.out.println("Sorting by Name:");
        employees.sort(new EmployeeNameComparator());
        for (Employee employee: employees) {
            System.out.println(employee);
        }
        System.out.println("Sorting by salary");
        employees.sort(new EmployeeSalaryComparator());
        for (Employee employee: employees) {
            System.out.println(employee);
        }

        EmployeeList employeeList = new EmployeeList();
        employeeList.addEmployee(worker1);
        employeeList.addEmployee(worker2);
        employeeList.addEmployee(worker3);
        employeeList.addEmployee(freelancer1);
        employeeList.addEmployee(freelancer2);
        employeeList.addEmployee(freelancer3);

        System.out.println("EmployeeList ang For each demonstration");
        for (Employee emp: employeeList) {
            System.out.println(emp);
        }
    }
}