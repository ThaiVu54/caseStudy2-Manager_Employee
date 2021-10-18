package model;

public class PartTimeEmployee extends Employee{
    private double hours;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String name, int age, String code, String phone, String email, double hours) {
        super(name, age, code, phone, email);
        this.hours = hours;
    }

    public PartTimeEmployee(double hours) {
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return
                "PartTimeEmployee{"+
                "hours=" + hours +
                '}';
    }
}
