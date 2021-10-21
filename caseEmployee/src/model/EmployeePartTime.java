package model;

public class EmployeePartTime extends Employee {
    private double workTime;

    public EmployeePartTime() {
    }

    public EmployeePartTime(double workTime) {
        this.workTime = workTime;
    }

    public EmployeePartTime(int id, String name, int age, String gender, String phone, String email, String address, double salary, boolean status, double workTime) {
        super(id, name, age, gender, phone, email, address, salary, status);
        this.workTime = workTime;
    }

    public double getWorkTime() {
        return workTime;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }

    @Override
    public double getTotalSalary() {
        return this.getSalary() * getWorkTime();
    }

    @Override
    public String toString() {
        return "Nhân viên parttime: " + super.toString() + ", giờ làm việc: " + workTime + "h, doanh thu: " + getTotalSalary() + "";
    }
}
