package com.EmployeeManagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }

    public static void main(String[] args) {
        int choice;
        List employees = new ArrayList<Employee>();
        do {
            System.out.println("Employee Management System");
            Scanner sc = new Scanner(System.in);


            System.out.println("\n\nPress 1 to add new employee");
            System.out.println("\n\nPress 2 to show all employee information");
            System.out.println("\n\nPress 3 to escape");
            do {choice = sc.nextInt();} while (choice < 1 || choice > 3);

            clearConsole();
            if (choice == 1) {
                System.out.println("\nReport employee name: ");
                String name = sc.next();

                System.out.println("\nReport employee CPF: ");
                String cpf = sc.next();

                System.out.println("\nReport employee tipe");
                System.out.println("\nPress 1 to add Full Time Employee");
                System.out.println("Press 2 to add Half Time Employee");
                System.out.println("Press 3 to add Trainee Employee");
                int choice2;
                do {choice2 = sc.nextInt();} while (choice2 < 1 || choice2 > 3);

                if (choice2 == 1) {
                    clearConsole();
                    System.out.println("\nReport employee base salary: ");
                    double salary = sc.nextDouble();
                    System.out.println("\nReport employee bonus: ");
                    double bonus = sc.nextDouble();

                    FullTimeEmployee employee = new FullTimeEmployee(name, cpf, salary, bonus);

                    employees.add(employee);

                    System.out.println("\nEmployee added successfully!");
                } else if (choice2 == 2) {
                    clearConsole();
                    System.out.println("\nReport employee hour value: ");
                    double salary = sc.nextDouble();
                    System.out.println("\nReport employee hours worked: ");
                    double hours = sc.nextDouble();

                    HalfTimeEmployee employee = new HalfTimeEmployee(name, cpf, salary, hours);

                    employees.add(employee);

                    System.out.println("\nEmployee added successfully!");
                } else {
                    clearConsole();
                    System.out.println("\nReport trainee school name: ");
                    String school = sc.next();
                    System.out.println("\nReport trainee scholarship: ");
                    double scholarship = sc.nextDouble();

                    TraineeEmployee employee = new TraineeEmployee(name, cpf, school, scholarship);

                    employees.add(employee);

                    System.out.println("\nEmployee added successfully!");
                }
            } else {
                int i = 0;
                System.out.println("\n");
                for (Object employee: employees){
                    Employee emp = (Employee) employee;
                    emp.showInfo();
                    System.out.println("\n");
                }
                System.out.println("\n\nEnd\n\n");
            }
        } while (choice != 3);
    }
}