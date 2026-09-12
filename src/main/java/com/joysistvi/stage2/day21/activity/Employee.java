package com.joysistvi.stage2.day21.activity;

public class Employee {

    protected String name;
    protected double baseSalary;

    public Employee(
            String name,
            double baseSalary
    ){

        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double computeSalary(){ return baseSalary; }

    public void printPayslip(){

        System.out.printf("%s's salary: %.2f", name, computeSalary());
        System.out.println();
        System.out.printf("Employee type: %s", getEmployeeType());
        System.out.println();
    }

    public String getEmployeeType(){ return "Employee"; }
}
