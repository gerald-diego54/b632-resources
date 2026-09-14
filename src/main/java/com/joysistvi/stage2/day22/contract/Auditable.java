package com.joysistvi.stage2.day22.contract;

public interface Auditable {
    String generateEmployeeId();

    void logSalaryComputation(String employeeId);
}
