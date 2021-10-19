package controller;

import model.Employee;

public interface IEmployee<E> {
    void showAll();

    void addEmployee(Employee employee);

    void updateEmployee();

    void removeEmployee();

    void findEmployee();
}
