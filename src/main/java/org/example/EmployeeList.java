package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeList implements Iterable<Employee> {
    public ArrayList<Employee> employeeList;
    int currentIndex;

    public EmployeeList() {
        employeeList = new ArrayList<>();
        currentIndex = 0;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);

    }

    public Employee getEmployee(int index) {
        return employeeList.get(index);
    }

    @Override
    public Iterator<Employee> iterator() {
        return employeeList.iterator();
    }

/*    @Override
    public void forEach(Consumer<? super Employee> action) {
        Iterable.super.forEach(action);
    }*/
}
