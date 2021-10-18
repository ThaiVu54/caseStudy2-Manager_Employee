package model;

public class FullTimrEmployee extends Employee {
    int bonus;
    int fine;
    int hardSalary;

    public FullTimrEmployee(String name, int age, String code, String phone, String email, int bonus, int fine, int hardSalary) {
        super(name, age, code, phone, email);
        this.bonus = bonus;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    @Override
    public String toString() {
        return "FullTimrEmployee{" +
                "bonus=" + bonus +
                ", fine=" + fine +
                ", hardSalary=" + hardSalary +
                '}';
    }

    public FullTimrEmployee(int bonus, int fine, int hardSalary) {
        this.bonus = bonus;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(int hardSalary) {
        this.hardSalary = hardSalary;
    }
}
