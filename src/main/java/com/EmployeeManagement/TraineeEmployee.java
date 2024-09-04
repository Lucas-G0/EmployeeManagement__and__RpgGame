package com.EmployeeManagement;

public class TraineeEmployee extends  Employee {
    private String schoolName;
    private double scholarship;

    public TraineeEmployee(String name, String cpf, String schoolName, double scholarship) {
        super(name, cpf, scholarship);
        this.schoolName = schoolName;
        this.scholarship = scholarship;
    }

    public String getSchool() {
        return schoolName;
    }

    @Override
    public double calcSalary(){
        return this.scholarship;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("School Name: " + this.schoolName);
    }
}
