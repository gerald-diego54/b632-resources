package com.joysistvi.stage2.day22.model.employee;

import com.joysistvi.stage2.day22.contract.Bonusable;
import com.joysistvi.stage2.day22.model.Employee;

public class SalesEmployee extends Employee implements Bonusable {

    private static final double SALARY_DEDUCTION_RATE = 0.12;
    private static final double BONUS_RATE = 0.10;

    public double commission;

    public SalesEmployee(String name, double baseSalary, double commission) {
        super(name, baseSalary);
        this.commission = commission;
    }

    @Override
    public double computeBonus() {
        return commission * BONUS_RATE;
    }

    @Override
    public boolean isEligibleForBonus() {
        return true;
    }

    @Override
    public double computeSalary() {
        return baseSalary + commission;
    }

    @Override
    public String getEmployeeType() {
        return "Sales Employee";
    }

    @Override
    public double computeDeductions() {
        return computeSalary() * SALARY_DEDUCTION_RATE;
    }
}
