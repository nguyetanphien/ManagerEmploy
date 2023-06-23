package util;

import model.Employ;

import java.util.ArrayList;
import java.util.Scanner;

public class Programmer extends Employ {



    private int overtimeHours;

    public Programmer() {
    }

    public Programmer(String code, String fullName, int age, String phoneNumber, String email, int basicSalary, int overtimeHours) {
        super(code, fullName, age, phoneNumber, email, basicSalary);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double salary() {
        return getBasicSalary() + overtimeHours * 400000;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.printf("Enter Over Time Hours: ");
        overtimeHours=scanner.nextInt();

    }

    @Override
    public void output() {
        super.output();
        System.out.println("Over time hours: "+getBasicSalary());
    }
    @Override
    public String toString() {
        return "Programmer{" + super.toString() + " " +
                "overtimeHours=" + overtimeHours +
                '}';
    }

    @Override
    public double Salary() {
        return overtimeHours+getBasicSalary()*400000;
    }
}
