package model;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Employ {
    private String code;
    private String fullName;
    private int age;
    private String phoneNumber;
    private String email;
    private int basicSalary;



    public Employ() {
    }

    public Employ(String code, String fullName, int age, String phoneNumber, String email, int basicSalary) {
        this.code = code;
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.basicSalary = basicSalary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employ: ");
        System.out.printf("Enter code: ");
        code = scanner.nextLine();
        System.out.printf("Enter FullName: ");
        fullName = scanner.nextLine();
        System.out.printf("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Enter Phone Number: ");
        phoneNumber = scanner.nextLine();
        System.out.printf("Enter email: ");
        email = scanner.nextLine();
        System.out.printf("Enter Basic Salary: ");
        basicSalary = scanner.nextInt();
    }
    public void output(){
        System.out.println("Code Employ: "+getCode());
        System.out.println("Full Name: "+getFullName());
        System.out.println("Age: "+getAge());
        System.out.println("Phone Number: "+getPhoneNumber());
        System.out.println("Email: "+getEmail());
        System.out.println("Basic Salary: "+getBasicSalary());
    }
    @Override
    public String toString() {
        return
                "code='" + code + '\'' +
                        ", fullName='" + fullName + '\'' +
                        ", age=" + age +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        ", email='" + email + '\'' +
                        ", basicSalary=" + basicSalary
                ;
    }
    public abstract double Salary();
}
