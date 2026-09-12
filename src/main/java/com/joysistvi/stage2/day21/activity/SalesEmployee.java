package com.joysistvi.stage2.day21.activity;

public class SalesEmployee extends Employee {

    private double commission;

    public SalesEmployee(
            String name,
            double baseSalary,
            double commission
    ) {
        super(name, baseSalary);
        this.commission = commission;
    }

    @Override
    public double computeSalary() {
        return baseSalary + commission;
    }

    /**
     * Stretch Goal 3:
     * Identifies the specific employee type at runtime.
     *
     * @return the employee type
     */
    @Override
    public String getEmployeeType() {
        return "Sales Employee";
    }
}