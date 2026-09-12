package com.joysistvi.stage2.day21.activity;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = {
                new RegularEmployee("Ana", 15000),
                new SalesEmployee("Ben", 12000, 5000),
                new ContractualEmployee("Cruz", 160, 75),
                new ManagerEmployee("Gerald", 100000)
        };

        for (Employee employee : employees) {

            employee.printPayslip();
            System.out.println();
        }

        /*
         * Stretch Goal 2:
         * Demonstrates method overloading by calling
         * computeSalary() with and without a tax parameter.
         */

        ManagerEmployee managerEmployee = new ManagerEmployee("Gerald", 100000);

        System.out.printf("Employee without tax: %.2f", managerEmployee.computeSalary());
        System.out.println();
        System.out.printf("Employee with tax: %.2f", managerEmployee.computeSalary(0.20));
        System.out.println();
    }
}