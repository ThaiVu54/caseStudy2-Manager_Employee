package controller;

import model.Employee;
import model.NameRegex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    static Scanner scannerInt = new Scanner(System.in);
    static Scanner scannerLine = new Scanner(System.in);
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
        while (true){
            try{
                System.out.println("Nhập số điện thoại（づ￣3￣）づ╭❤️～:");
                String phone = scannerLine.nextLine();
            }catch (Exception e){
                System.err.println("Nhập sai rồi (～￣▽￣)～!");
            }
        }
    }

    private static String getGender() {
        while (true) {
            try {
                System.out.println("Nhập giới tính （づ￣3￣）づ╭❤️～:");
                String gender = scannerLine.nextLine();
                return gender;
            } catch (Exception e) {
                System.err.println("Nhập không đúng (～￣▽￣)～!");
            }
        }
    }

    private static int getAge() {
        while (true) {
            try {
                System.out.println("Nhập tuổi （づ￣3￣）づ╭❤️～: ");
                int age = scannerInt.nextInt();
                return age;
            } catch (Exception e) {
                System.err.println("Nhập không đúng (～￣▽￣)～!");
            }
        }
    }

    private static String getName() {
        String name;
        while (true) {
            System.out.println("Nhập tên （づ￣3￣）づ╭❤️～: ");
            name = scannerLine.nextLine();
            if (NameRegex.validate(name)) {
                return name;
            }
        }
    }

    private static int getId() {
        while (true) {
            try {
                System.out.println("Nhập id （づ￣3￣）づ╭❤️～: ");
                int id = scannerInt.nextInt();
                for (Employee employee : employees
                ) {
                    if (employee.getId() == id) {
                        throw new Exception();
                    }
                }
                return id;
            } catch (Exception e) {
                System.err.println("Id đã tồn tại (～￣▽￣)～!");
            }
        }
    }
}
