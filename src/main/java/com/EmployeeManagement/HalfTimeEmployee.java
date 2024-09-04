package com.EmployeeManagement;

public class HalfTimeEmployee extends Employee {
    private double workedHours;
    private double hourValue;

    public HalfTimeEmployee(String name, String cpf, double hourValue, double workedHours) {
        super(name, cpf, hourValue);
        this.workedHours = workedHours;
        this.hourValue = hourValue;
    }

    @Override
    public double calcSalary(){
        return this.workedHours * this.hourValue;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Worked Hours: " + this.workedHours);
        System.out.println("Total Salary: " + this.calcSalary());
    }
}
