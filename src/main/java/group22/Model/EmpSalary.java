/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Model;

public class EmpSalary extends Salary implements SalaryOperations {

@Override
    public double calculateRegularAmount() {
        double amount = getRegularHoursWorked() * getRegularRate();
        setRegularAmount(amount);
        return amount;
    }

    @Override
    public double calculateOvertimeAmount() {
        double amount = getOvertimeHoursWorked() * getOvertimeRate();
        setOvertimeAmount(amount);
        return amount;
    }

    @Override
    public double calculateBonusAmount() {
        double amount = getBonusHoursWorked() * getBonusRate();
        setBonusAmount(amount);
        return amount;
    }

    @Override
    public double calculateTotalEarnings() {
        double total = calculateRegularAmount() + calculateOvertimeAmount() + calculateBonusAmount();
        setTotalEarnings(total);
        return total;
    }

    @Override
    public double calculateTotalDeductions() {
        double total = getWithholdingTax() + getSssDeduction() + getPhilHealthDeduction() + getPagIbigDeduction();
        setTotalDeductions(total);
        return total;
    }

    @Override
    public double calculateNetPay() {
        double net = calculateTotalEarnings() - calculateTotalDeductions();
        setNetPay(net);
        return net;
    }
}
    
