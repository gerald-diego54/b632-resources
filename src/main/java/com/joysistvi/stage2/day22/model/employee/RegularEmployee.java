package com.joysistvi.stage2.day22.model.employee;

import com.joysistvi.stage2.day22.contract.Auditable;
import com.joysistvi.stage2.day22.contract.Bonusable;
import com.joysistvi.stage2.day22.model.Employee;

public class RegularEmployee extends Employee implements Bonusable, Auditable {

    private static final double ATTENDANCE_BONUS = 1000;
    private static final double SALARY_DEDUCTION_RATE = 0.10;
    private static final double BONUS_RATE = 0.05;

    public RegularEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public String generateEmployeeId() {
        return "REG-" + name.toUpperCase();
    }

    @Override
    public void logSalaryComputation(String employeeId) {
        System.out.println("Audit Log: " + generateEmployeeId() + " salary computed.");
    }

    @Override
    public double computeBonus() {
        return baseSalary * BONUS_RATE;
    }

    @Override
    public boolean isEligibleForBonus() {
        return true;
    }

    @Override
    public double computeSalary() {
        return baseSalary + ATTENDANCE_BONUS;
    }

    @Override
    public String getEmployeeType() {
        return "Regular Employee";
    }

    @Override
    public double computeDeductions() {
        return computeSalary() * SALARY_DEDUCTION_RATE;
    }
}
