package com.EmployeeManagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int choice;
        List employees = new ArrayList<Employee>();
        do {
            System.out.println("Employee Management System");
            System.out.println("\n--------------------------------------\n");
            Scanner sc = new Scanner(System.in);


            System.out.println("\nPress *1* to add new employee\n");
            System.out.println("\nPress *2* to show all employee information\n");
            System.out.println("\nPress *3* to exit\n");
            System.out.println("\n---------------------------------------\n");
            do {choice = sc.nextInt();} while (choice < 1 || choice > 3);

            switch (choice) {
                case 1 -> { // add new employee
                    System.out.println("\n---------------------------------------\n");
                    System.out.println("\nReport employee name:\n");
                    String name = sc.next();

                    System.out.println("\nReport employee CPF:\n");
                    String cpf = sc.next();

                    System.out.println("\n---------------------------------------\n");
                    System.out.println("\nReport employee tipe:\n");
                    System.out.println("\nPress *1* to add Full time employee\n");
                    System.out.println("\nPress *2* to add Half-time employee\n");
                    System.out.println("\nPress *3* to add Trainee employee\n");
                    System.out.println("\n---------------------------------------\n");
                    int choice2;
                    do {
                        choice2 = sc.nextInt();
                    } while (choice2 < 1 || choice2 > 3);

                    switch (choice2) {
                        case 1 -> { // full time employee
                            System.out.println("\n---------------------------------------\n");
                            System.out.println("\nReport employee base salary:\n");
                            double salary = sc.nextDouble();
                            System.out.println("\nReport employee bonus:\n");
                            double bonus = sc.nextDouble();

                            FullTimeEmployee employee = new FullTimeEmployee(name, cpf, salary, bonus);
                            employees.add(employee);
                            System.out.println("\nEmployee added successfully!\n");
                            System.out.println("\n---------------------------------------\n");
                        }
                        case 2 -> { // half-time employee
                            System.out.println("\n---------------------------------------\n");
                            System.out.println("\nReport employee hour value:\n");
                            double salary = sc.nextDouble();
                            System.out.println("\nReport employee hours worked:\n");
                            double hours = sc.nextDouble();

                            HalfTimeEmployee employee = new HalfTimeEmployee(name, cpf, salary, hours);
                            employees.add(employee);
                            System.out.println("\nEmployee added successfully!\n");
                            System.out.println("\n---------------------------------------\n");
                        }
                        case 3 -> { // trainee employee
                            System.out.println("\n---------------------------------------\n");
                            System.out.println("\nReport trainee school name:\n");
                            String school = sc.next();
                            System.out.println("\nReport trainee scholarship:\n");
                            double scholarship = sc.nextDouble();

                            TraineeEmployee employee = new TraineeEmployee(name, cpf, school, scholarship);
                            employees.add(employee);
                            System.out.println("\nEmployee added successfully!\n");
                            System.out.println("\n---------------------------------------\n");
                        }
                    }
                }
                case 2 -> {
                    int i = 0;
                    System.out.println("\n");
                    for (Object employee : employees) {
                        Employee emp = (Employee) employee;
                        System.out.println("\n----------------------------------------\n");
                        emp.showInfo();
                        System.out.println("\n--------------------------------------\n");
                    }
                    System.out.println("\nEnd\n");
                    System.out.println("\n---------------------------------------\n");
                }
                case 3 -> {
                    System.out.println("Exiting....");
                }
                default -> {
                    System.out.println("\nInvalid choice!\n");
                }
            }
        } while (choice != 3);
    }
}