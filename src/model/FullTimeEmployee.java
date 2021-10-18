package model;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee() {
    }

    public FullTimeEmployee(int id, String name, int age, String gender, String phone, String email, String address, double salary, boolean status) {
        super(id, name, age, gender, phone, email, address, salary, status);
    }

//    public FullTimeEmployee(int id, String name, int age, String gender, String phone, String email, String address, double salary, double totalSalary, boolean status) {
//        super(id, name, age, gender, phone, email, address, salary, totalSalary, status);
//    }

    @Override
    public double getTotalSalary() {
        return this.getSalary() * 10;
    }

    @Override
    public String toString() {
        return "Nhân viên Fulltime: " + super.toString() + " ,doanh thu: " + getTotalSalary() + "";
    }
}
