package controller;

import model.Employee;
import model.FullTimeEmployee;
import model.PartTimeEmployee;

import java.util.ArrayList;
import java.util.List;

public class ManagerEmployee implements IEmployee<Employee> {
    private List<Employee> employees = new ArrayList<>();
    Employee fullEmployee = new FullTimeEmployee();
    Employee partEmployee = new PartTimeEmployee();

    public ManagerEmployee() {
    }

    public ManagerEmployee(List<Employee> employees) {
        this.employees = employees;
    }

//    public Employee create(Employee employee){
//
//    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void showAll() {
        for (Employee employee : employees
        ) {
            System.out.println(employee);
            System.out.println();
        }
    }


    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void updateEmployee() {

    }

    @Override
    public void removeEmployee() {

    }

    @Override
    public void findEmployee() {

    }

}
