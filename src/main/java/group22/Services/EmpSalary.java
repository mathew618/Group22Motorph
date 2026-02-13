/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Services;

import group22.Model.Salary;

public class EmpSalary extends Salary {

    @Override
    public double calculateRegularAmount() {
        return getRegularHoursWorked() * getRegularRate();
    }

    @Override
    public double calculateOvertimeAmount() {
        return getOvertimeHoursWorked() * getOvertimeRate();
    }

    @Override
    public double calculateBonusAmount() {
        return getBonusHoursWorked() * getBonusRate();
    }

    @Override
    public double calculateTotalEarnings() {
        return calculateRegularAmount()
                + calculateOvertimeAmount()
                + calculateBonusAmount();
    }

    @Override
    public double calculateNetPay() {
        return calculateTotalEarnings() - calculateTotalDeductions();
    }

//overloading aspect
    public double calculateNetPay(double additionalDeduction) {
        return calculateTotalEarnings()
                - (calculateTotalDeductions() + additionalDeduction);
    }

}
