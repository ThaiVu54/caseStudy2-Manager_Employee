package model;

public class PartTimeEmployee extends Employee {
    private double workTime;

    public PartTimeEmployee(){

    }
    public PartTimeEmployee(double workTime) {
        this.workTime = workTime;
    }

    public PartTimeEmployee(int id, String name, int age, String gender, String phone, String email, String address, double salary, boolean status, double workTime) {
        super(id, name, age, gender, phone, email, address, salary, status);
        this.workTime = workTime;
    }

//    public PartTimeEmployee(int id, String name, int age, String gender, String phone, String email, String address, double salary, double totalSalary, boolean status, double workTime) {
//        super(id, name, age, gender, phone, email, address, salary, totalSalary, status);
//        this.workTime = workTime;
//    }

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
        return "Nhân viên PartTime: " + super.toString() + ", giờ làm việc: " + workTime + "h, danh thu: " + getTotalSalary() + "";
    }
}
