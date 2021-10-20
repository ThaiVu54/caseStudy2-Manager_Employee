package controller;

import model.Employee;
import model.FullTimeEmployee;
import model.PartTimeEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ManagerEmployee implements IEmployee<Employee> {
    private List<Employee> employees = new ArrayList<>();
    private String fileName;
    Employee fullEmployee = new FullTimeEmployee();
    Employee partEmployee = new PartTimeEmployee();
    Scanner scannerInt = new Scanner(System.in);
    Scanner scannerLine = new Scanner(System.in);


    public ManagerEmployee(String fileName) {
        this.fileName = fileName;
    }

    public ManagerEmployee() {
    }

    public ManagerEmployee(List<Employee> employees) {
        this.employees = employees;
    }

    public Employee create(String typeEmployee) {
        int id = getID();
        String name = getName();
        int age = getAge();
        String gender = getGender();
        String phone = getPhone();
        String email = getEmail();
        String address = getAdress();
        double salary = getSalary();
        double totalSalary = getTotalSalary();
        boolean status = isStatus();
//        double workTime = getWorkTime();

//        if (typeEmployee.equals("fulltime")) {
//            return new FullTimeEmployee(id, name, age, gender, phone, email, address, salary, status);
//        }
//        if (typeEmployee.equals("parttime")) {
//            System.out.println("Nhập số giờ làm việc: ");
//            workTime = scannerInt.nextInt();
//            return new PartTimeEmployee(id, name, age, gender, phone, email, address, salary, status, workTime);
//        }
//        return typeEmployee;
        if (Objects.equals(typeEmployee, "NhanVienFullTime")) {
            return new FullTimeEmployee(id, name, age, gender, phone, email, address, salary, status);
        } else {
            System.out.println("Nhập số giờ làm việc: ");
            double workTime = scannerInt.nextInt();
            return new PartTimeEmployee(id, name, age, gender, phone, email, address, salary, status, workTime);
        }
    }

    private double getWorkTime() {
        return 0;
    }

    private boolean isStatus() {
        return false;
    }

    private double getTotalSalary() {
        return 0;
    }

    private double getSalary() {
        return 0;
    }

    private String getAdress() {
        return null;
    }

    private String getEmail() {
        return null;
    }

    private String getPhone() {
        return null;
    }

    private String getGender() {
        return null;
    }

    private int getAge() {
        return 0;
    }

    private String getName() {
        return null;
    }

    private int getID() {
        return 0;
    }

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
