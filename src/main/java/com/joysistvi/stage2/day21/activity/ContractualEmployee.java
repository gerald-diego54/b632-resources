package com.joysistvi.stage2.day21.activity;

public class ContractualEmployee extends Employee {

    private final double hoursWorked;
    private final double hourlyRate;

    public static final int DEFAULT_BASE_SALARY = 0;

    public ContractualEmployee(
            String name,
            double hoursWorked,
            double hourlyRate
    ) {
        super(name, DEFAULT_BASE_SALARY);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double computeSalary() {
        return hoursWorked * hourlyRate;
    }

    /**
     * Stretch Goal 3:
     * Identifies the specific employee type at runtime.
     *
     * @return the employee type
     */
    @Override
    public String getEmployeeType() {
        return "Contractual Employee";
    }
}