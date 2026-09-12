package com.joysistvi.stage2.day21.activity;

public class RegularEmployee extends Employee {

    private static final int FIX_ATTENDANCE_BONUS = 1000;

    public RegularEmployee(
            String name,
            double baseSalary
    ) {
        super(name, baseSalary);
    }

    @Override
    public double computeSalary() {
        return baseSalary + FIX_ATTENDANCE_BONUS;
    }

    /**
     * Stretch Goal 3:
     * Identifies the specific employee type at runtime.
     *
     * @return the employee type
     */
    @Override
    public String getEmployeeType() {
        return "Regular Employee";
    }
}