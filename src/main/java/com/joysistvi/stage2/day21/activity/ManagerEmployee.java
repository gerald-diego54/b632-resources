package com.joysistvi.stage2.day21.activity;

public class ManagerEmployee extends Employee {

    private static final double FIXED_ALLOWANCE = 5000;

    public ManagerEmployee(
            String name,
            double baseSalary
    ) {
        super(name, baseSalary);
    }

    /**
     * Stretch Goal 1:
     * Adds a ManagerEmployee with a fixed PHP 5,000 allowance
     * without modifying the existing employee processing loop.
     *
     * @return manager's base salary plus PHP 5,000 allowance
     */
    @Override
    public double computeSalary() {
        return baseSalary + FIXED_ALLOWANCE;
    }

    /**
     * Stretch Goal 3:
     * Identifies the specific employee type at runtime.
     *
     * @return the employee type
     */
    @Override
    public String getEmployeeType() {
        return "Manager Employee";
    }

    /**
     * Stretch Goal 2:
     * Demonstrates method overloading by accepting a tax amount.
     *
     * @param taxRate tax amount to deduct from the computed salary
     * @return salary after deducting the tax
     */
    public double computeSalary(double taxRate) {
        double tax = computeSalary() * taxRate;
        return computeSalary() - tax;
    }
}