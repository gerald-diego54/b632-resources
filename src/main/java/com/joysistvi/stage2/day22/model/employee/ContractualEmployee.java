package com.joysistvi.stage2.day22.model.employee;

import com.joysistvi.stage2.day22.contract.Auditable;
import com.joysistvi.stage2.day22.model.Employee;

public class ContractualEmployee extends Employee implements Auditable {

    private static final double SALARY_DEDUCTION_RATE = 0.05;

    private final double hourlyRate;

    public ContractualEmployee(String name, double baseSalary, double hourlyRate) {
        super(name, baseSalary);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double computeSalary() {
        return baseSalary * hourlyRate;
    }

    @Override
    public String getEmployeeType() {
        return "Contractual Employee";
    }

    @Override
    public double computeDeductions() {
        return computeSalary() * SALARY_DEDUCTION_RATE;
    }

    @Override
    public String generateEmployeeId() {
        return "CON-" + name.toUpperCase();
    }

    @Override
    public void logSalaryComputation(String employeeId) {
        System.out.println("Audit Log: " + generateEmployeeId() + " salary computed.");
    }
}
