package controller;

import java.io.IOException;

public interface IEmployee<E> {
    void showAll();

//    void addEmployee();

    void addEmployee(String typeEmploye) throws IOException;

    void updateEmployee();

    void removeEmployee();

    void findEmployee();
}
