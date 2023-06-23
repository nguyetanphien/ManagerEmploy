package util;

import model.Employ;

import java.util.Scanner;

public class Verifier extends Employ {
    private int errorNumberDeteced;

    public Verifier() {
    }


    public Verifier(String code, String fullName, int age, String phoneNumber, String email, int basicSalary, int errorNumberDeteced) {
        super(code, fullName, age, phoneNumber, email, basicSalary);
        this.errorNumberDeteced = errorNumberDeteced;
    }

    public int getErrorNumberDeteced() {
        return errorNumberDeteced;
    }

    public void setErrorNumberDeteced(int errorNumberDeteced) {
        this.errorNumberDeteced = errorNumberDeteced;
    }

    public double salary() {
        return getBasicSalary() + errorNumberDeteced * 150000;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.printf("Enter error number deteced: ");
        errorNumberDeteced = scanner.nextInt();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Error number deteced: " + getErrorNumberDeteced());
    }

    @Override
    public String toString() {
        return "Verifier{" + super.toString() + " " +
                "errorNumberDeteced=" + errorNumberDeteced +
                '}';
    }

    @Override
    public double Salary() {
        return getBasicSalary() + errorNumberDeteced * 150000;
    }
}
