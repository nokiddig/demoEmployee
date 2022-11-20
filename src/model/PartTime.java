package src.model;

import src.model.Employee;

public class PartTime extends Employee {
    private int hour;

    public PartTime() {
    }

    public PartTime(String name, int age, int salary, int hour) {
        super(name, age, salary);
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    @Override
    public String toString() {
        return "PartTime: " + getName();
    }
}
