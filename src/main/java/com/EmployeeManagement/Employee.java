package com.EmployeeManagement;

public class Employee {
    private String name;
    private String cpf;
    private double salary;

    public Employee(String name, String cpf, double salary) {
        this.cpf = cpf;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double calcSalary(){
        return this.salary;
    }

    public void showInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salary: " + this.salary);
    }
}
