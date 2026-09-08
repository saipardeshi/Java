package oop;

import java.util.ArrayList;
import java.util.List;

abstract class OOPEmployee {
    private String name;
    private double baseSalary;

    OOPEmployee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    abstract double calculateSalary();

    void printPayslip() {
        System.out.println(name + " -> Rs. " + calculateSalary());
    }
}

class OOPDeveloper extends OOPEmployee {
    double bonus;

    OOPDeveloper(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

class OOPManager extends OOPEmployee {
    double teamAllowance;

    OOPManager(String name, double baseSalary, double teamAllowance) {
        super(name, baseSalary);
        this.teamAllowance = teamAllowance;
    }

    double calculateSalary() {
        return getBaseSalary() + teamAllowance;
    }
}

public class OOPDemo {
    public static void main(String[] args) {
        List<OOPEmployee> empList = new ArrayList<>();
        empList.add(new OOPDeveloper("Harry", 40000, 5000));
        empList.add(new OOPManager("Aditi", 60000, 10000));

        for (OOPEmployee e : empList) {
            e.printPayslip();
        }
    }
}