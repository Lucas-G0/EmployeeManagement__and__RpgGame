package com.EmployeeManagement;

public class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String name, String cpf, double salary, double bonus) {
        super(name, cpf, salary);
        this.bonus = bonus;
    }

    @Override
    public double calcSalary(){
        return super.calcSalary()+(this.getSalary()*this.bonus)/100;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Bonus: " + this.bonus);
    }
}
