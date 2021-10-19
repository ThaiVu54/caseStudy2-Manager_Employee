package controller;

import model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    static Scanner scanner = new Scanner(System.in);
    private String nameFile;
    static List<Employee> employees = new ArrayList<>();

    public EmployeeManager(String nameFile) {
        this.nameFile = nameFile;
    }

    public static Employee create(String typeEmployee) {
        int id = getId();
        String name = getName();
        int age = getAge();
        String gender = getGender();
        String phone = getPhone();
        String mail = getMail();
        String address = getAdress();
        double salary = getSalary();

    }

    private static double getSalary() {
        return 0;
    }

    private static String getAdress() {
        return null;
    }

    private static String getMail() {
        return null;
    }

    private static String getPhone() {
        return null;
    }

    private static String getGender() {
        return null;
    }

    private static int getAge() {
        return 0;
    }

    private static String getName() {
        return null;
    }

    private static int getId() {
        while (true) {
            try {
                System.out.println("Nhập id: ");
                int id = Integer.parseInt(String.valueOf(scanner.nextInt()));
                for (Employee employee : employees
                ) {
                    if (employee.getId() == id){
                        throw new Exception();
                    }
                }
                return id;
            } catch (Exception e) {
                System.err.println("Id đã tồn tại");
            }
        }
    }
}
