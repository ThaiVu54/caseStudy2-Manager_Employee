package controller;

import model.Employee;

public interface IEmployee<E> {
    void showAll();

//    void addEmployee();

    void addEmployee(String typeEmploye);

    void updateEmployee();

    void removeEmployee();

    void findEmployee();
}
