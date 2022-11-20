package src.model;

import src.model.Employee;

public class FullTime extends Employee {
    private double numberSalary;
    private int numberYear;

    public FullTime() {
    }

    public FullTime(String name, int age, int salary, double numberSalary, int numberYear) {
        super(name, age, salary);
        this.numberSalary = numberSalary;
        this.numberYear = numberYear;
    }

    public double getNumberSalary() {
        return numberSalary;
    }

    public void setNumberSalary(double numberSalary) {
        this.numberSalary = numberSalary;
    }

    public int getNumberYear() {
        return numberYear;
    }

    public void setNumberYear(int numberYear) {
        this.numberYear = numberYear;
    }

    @Override
    public String toString() {
        return "FullTime: " + getName();
    }
}
