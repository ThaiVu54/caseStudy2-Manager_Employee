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
        String address = getAddress();
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
        if (Objects.equals(typeEmployee, "fulltime")) {
            return new FullTimeEmployee(id, name, age, gender, phone, email, address, salary, status);
        } else {
            System.out.println("Nhập số giờ làm việc: ");
            double workTime = scannerInt.nextInt();
            return new PartTimeEmployee(id, name, age, gender, phone, email, address, salary, status, workTime);
        }
    }

//    private double getWorkTime() {
//
//        return 0;
//    }

    private boolean isStatus() {
        System.out.println("Nhập trạng thái nhân viên (true-đang làm việc/false-đã nghỉ việc): ");
        boolean status = false;
        String status1 = scannerLine.nextLine();
        if (status1.equals("true")) {
            status = true;
        } else if (status1.equals("false")) {
            status = false;
        } else System.out.println("nhập sai");
        return status;
    }

    private double getTotalSalary() {
        double total = 0;
        for (Employee employee : employees
        ) {
            total += getSalary();
        }
        return total;
    }

    private double getSalary() {
        System.out.println("Nhập lương nhân viên: ");
        double salary = scannerInt.nextDouble();
        return salary;
    }

    private String getAddress() {
        System.out.println("Nhập địa chỉ nhân viên: ");
        String address = scannerLine.nextLine();
        return address;
    }

    private String getEmail() {
        System.out.println("Nhập email nhân viên: ");
        String email = scannerLine.nextLine();
        return email;
    }

    private String getPhone() {
        System.out.println("Nhập số điện thoại nhân viên: ");
        String phone = scannerLine.nextLine();
        return phone;
    }

    private String getGender() {
        System.out.println("Nhập giới tính nhân viên (nam/nu): ");
        String gender = scannerLine.nextLine();
        return gender;
    }

    private int getAge() {
        System.out.println("Nhập tuổi nhân viên: ");
        int age = scannerInt.nextInt();
        return age;
    }

    private String getName() {
        System.out.println("Nhập tên nhân viên: ");
        String name = scannerLine.nextLine();
        return name;
    }

    private int getID() {
        System.out.println("Nhập id: ");
        ;
        int id = scannerInt.nextInt();
        return id;
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

    public void showByTypeEmployee() {
        String choose = scannerLine.nextLine();
        if (choose == "fulltime") {
            for (Employee employee : employees
            ) {
                if (employee instanceof FullTimeEmployee) {
                    System.out.println(employee);
                }
            }
        } else {
            for (Employee employee : employees) {
                if (employee instanceof PartTimeEmployee) {
                    System.out.println(employee);
                }
            }
        }
    }

//    @Override
//    public void addEmployee() {
//
//    }


    @Override
    public void addEmployee(String typeEmploye) {
        Employee employee = create(typeEmploye);
        employees.add(employee);
    }

    @Override
    public void updateEmployee() {
        while(true){
                System.out.println("1.Chỉnh sửa trạng thái");
                System.out.println("2.Chỉnh sửa thông tin Nhân viên");
                int choice = scannerInt.nextInt();
                switch (choice){
                    case 1:
                        editStatusByName();
                        break;
                    case 2:
                        editByName();
                        break;
                }
        }
    }

    public void editStatusByName() {
        System.out.println("Nhập tên nhân viên cập nhật trạng thái: ");
        String name = scannerLine.nextLine();
        int check = -1;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().equals(name)) {
                check = i;
            }
        }
        if (check < 0) {
            System.out.println("Tên không có trong danh sách");
        } else {
            if (employees.get(check).isStatus() == true) {
                employees.get(check).setStatus(false);
                System.out.println(employees.get(check));
            } else {
                employees.get(check).setStatus(true);
                System.out.println(employees.get(check));
            }
        }
    }

    public void editByName() {
        System.out.println("Nhập tên nhân viên cần cập nhật: ");
        String nameE = scannerLine.nextLine();
        int check = -1;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().equals(nameE)) {
                check = i;
            }
        }
        if (check < 0){
            System.out.println("Tên không có trong danh sách!");
        }else {
            int id = getID();
            String name = getName();
            int age = getAge();
            String gender = getGender();
            String phone = getPhone();
            String email = getEmail();
            String address = getAddress();
            double salary = getSalary();
            boolean status = isStatus();
            employees.get(check).setId(id);
            employees.get(check).setName(name);
            employees.get(check).setAge(age);
            employees.get(check).setGender(gender);
            employees.get(check).setPhone(phone);
            employees.get(check).setEmail(email);
            employees.get(check).setAddress(address);
            employees.get(check).setSalary(salary);
            employees.get(check).setStatus(status);
            if (employees.get(check) instanceof PartTimeEmployee){
                System.out.println("Nhập số giờ làm việc: ");
                double workTime = scannerInt.nextDouble();
                ((PartTimeEmployee) employees.get(check)).setWorkTime(workTime);
            }
        }
    }


    @Override
    public void removeEmployee() {
        System.out.println("Nhập nhân viên cần xóa (theo id): ");
        int id = scannerInt.nextInt();
        int check = -1;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                check = i;
            }
        }
        if (check < 0) {
            System.out.println("id không tồn tại");
        } else {
            employees.remove(check);
            System.out.println("Đã xóa nhân viên");
        }
    }

    @Override
    public void findEmployee() {
        for (Employee employee :
                employees) {
            findByName();
        }
    }

    public void findByName() {
        System.out.println("Nhập tên tìm kiếm: ");
        String name = scannerLine.nextLine();
        int check = -1;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().contains(name)) {
                check = i;
                System.out.println(employees.get(i));
            }
        }
        if (check < 0) {
            System.out.println("Không có tên trong danh sách");
        }
    }

    public void displayByStatus() {
        System.out.println("1. Hiển thị nhân viên đang làm");
        System.out.println("2. Hiển thị nhân viên nghỉ làm");
        int choose = scannerInt.nextInt();
        if (choose == 1) {
            for (Employee employee :
                    employees) {
                if (employee.isStatus() == true) {
                    System.out.println(employee);
                }
            }
        } else {
            for (Employee employee :
                    employees) {
                if (employee.isStatus() == false) {
                    System.out.println(employee);
                }
            }
        }
    }

    public void checkStatus() {
        System.out.println("Nhập tên nhân viên cần kiểm tra trạng thái: ");
        String name = scannerLine.nextLine();
        int check = -1;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().equals(name)) {
                check = i;
            }
        }
        if (check < 0) {
            System.out.println("Tên này ko có trong danh sách nhân viên");
        } else {
            System.out.println("Nhân viên " + employees.get(check).getName() + ": " + employees.get(check).getStatus());
        }
    }
    public void showUser(){
        System.out.println(ManagerLogin.getTemp());
    }
}

//    @Override
//    public void findEmployee() {
//        System.out.println("Nhập id nhân viên tìm kiếm: ");
//        int id = scannerInt.nextInt();
//        int check = -1;
//        if (check)
//    }

//        }
