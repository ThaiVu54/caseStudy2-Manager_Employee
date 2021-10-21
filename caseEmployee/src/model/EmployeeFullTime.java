package model;

public class EmployeeFullTime extends Employee {
    public EmployeeFullTime() {
    }

    public EmployeeFullTime(int id, String name, int age, String gender, String phone, String email, String address, double salary, boolean status) {
        super(id, name, age, gender, phone, email, address, salary, status);
    }

    @Override
    public double getTotalSalary() {
        return this.getSalary() * 10;
    }

    @Override
    public String toString() {
        return "Nhân viên fulltime: " + super.toString() + " , doanh thu: " + getTotalSalary() + "";
    }
}
