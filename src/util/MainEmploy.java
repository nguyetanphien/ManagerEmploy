package util;

import model.Employ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEmploy {
    public static List<Employ> arrayList = new ArrayList<>();

    public static void printMenu(Scanner scanner) {
        while (true) {
            System.out.println("Please fill in the choose number");
            System.out.println("1. InputProgrammer");
            System.out.println("2. InputVerifer.");
            System.out.println("3. Show Employee");
            System.out.println("4. Exit");

            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("InputProgrammer");
                    InputProgrammer(scanner);
                    break;
                case 2:
                    System.out.println("InputVerifer");
                    InputVerifer(scanner);
                    break;
                case 3:
                    System.out.println("Show Employee");
                    Output();
                    break;

                case 4:
                    System.out.println("Exit");
                    System.exit(0);
            }
        }
    }

    public static void InputProgrammer(Scanner scanner) {
        Programmer employProgrammer = new Programmer();
        scanner.nextLine();
        System.out.print("Employee Code:  ");
        employProgrammer.setCode(scanner.nextLine());

        System.out.printf("Full Name");
        employProgrammer.setFullName(scanner.nextLine());
        System.out.printf("Age: ");
        employProgrammer.setAge(scanner.nextInt());

        System.out.printf("Phone number: ");
        employProgrammer.setPhoneNumber(scanner.nextLine());
        scanner.nextLine();
        System.out.printf("Email: ");
        employProgrammer.setEmail(scanner.nextLine());
        System.out.printf("Basic salary: ");
        employProgrammer.setBasicSalary(scanner.nextInt());
        System.out.printf("Overtime hours: ");
        employProgrammer.setOvertimeHours(scanner.nextInt());
        arrayList.add(employProgrammer);
    }

    public static void InputVerifer(Scanner scanner) {
        Verifier employVerifier = new Verifier();
        scanner.nextLine();
        System.out.print("Employee Code:  ");
        employVerifier.setCode(scanner.nextLine());

        System.out.printf("Full Name");
        employVerifier.setFullName(scanner.nextLine());
        System.out.printf("Age: ");
        employVerifier.setAge(scanner.nextInt());

        System.out.printf("Phone number: ");
        employVerifier.setPhoneNumber(scanner.nextLine());
        scanner.nextLine();
        System.out.printf("Email: ");
        employVerifier.setEmail(scanner.nextLine());
        System.out.printf("Basic salary: ");
        employVerifier.setBasicSalary(scanner.nextInt());
        System.out.printf("Error number detected: ");
        employVerifier.setErrorNumberDeteced(scanner.nextInt());
        arrayList.add(employVerifier);
    }

    public void OutputVerifer() {
        Verifier employVerifier = new Verifier();
        System.out.print("Employee Code:  " + employVerifier.getCode());
        System.out.printf("Full Name" + employVerifier.getFullName());
        System.out.printf("Age: " + employVerifier.getAge());
        System.out.printf("Phone number: " + employVerifier.getPhoneNumber());
        System.out.printf("Email: " + employVerifier.getEmail());
        System.out.printf("Basic salary: " + employVerifier.getBasicSalary());
        System.out.printf("Error number detected: ");
        arrayList.add(employVerifier);
    }

    public static void Output() {
        System.out.println("employees whose salaries are lower than the average salary of the employees in the company.");
        for (Employ e : arrayList) {
            if (e.Salary() < averageSalary())
                System.out.println(e);
        }

    }

    public static double averageSalary() {
        double sum = 0;
        for (Employ e : arrayList) {
            sum = sum + e.Salary();
        }
        return sum / arrayList.size();
    }


}
