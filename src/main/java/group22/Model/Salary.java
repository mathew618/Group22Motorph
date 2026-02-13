/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Model;

public abstract class Salary implements SalaryOperations {

    // Regular
    private double regularHoursWorked;
    private double regularRate;

    // Overtime
    private double overtimeHoursWorked;
    private double overtimeRate;

    // Bonus
    private double bonusHoursWorked;
    private double bonusRate;

    // Deductions
    private double withholdingTax;
    private double sssDeduction;
    private double philHealthDeduction;
    private double pagIbigDeduction;

    public double getRegularHoursWorked() {
        return regularHoursWorked;
    }

    public void setRegularHoursWorked(double regularHoursWorked) {
        this.regularHoursWorked = regularHoursWorked;
    }

    public double getRegularRate() {
        return regularRate;
    }

    public void setRegularRate(double regularRate) {
        this.regularRate = regularRate;
    }

    public double getOvertimeHoursWorked() {
        return overtimeHoursWorked;
    }

    public void setOvertimeHoursWorked(double overtimeHoursWorked) {
        this.overtimeHoursWorked = overtimeHoursWorked;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    public double getBonusHoursWorked() {
        return bonusHoursWorked;
    }

    public void setBonusHoursWorked(double bonusHoursWorked) {
        this.bonusHoursWorked = bonusHoursWorked;
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    public double getWithholdingTax() {
        return withholdingTax;
    }

    public void setWithholdingTax(double withholdingTax) {
        this.withholdingTax = withholdingTax;
    }

    public double getSssDeduction() {
        return sssDeduction;
    }

    public void setSssDeduction(double sssDeduction) {
        this.sssDeduction = sssDeduction;
    }

    public double getPhilHealthDeduction() {
        return philHealthDeduction;
    }

    public void setPhilHealthDeduction(double philHealthDeduction) {
        this.philHealthDeduction = philHealthDeduction;
    }

    public double getPagIbigDeduction() {
        return pagIbigDeduction;
    }

    public void setPagIbigDeduction(double pagIbigDeduction) {
        this.pagIbigDeduction = pagIbigDeduction;
    }

    @Override
    public double calculateTotalDeductions() {
        return withholdingTax + sssDeduction + philHealthDeduction + pagIbigDeduction;
    }

    // Let subclasses define how earnings are calculated
    @Override
    public abstract double calculateRegularAmount();

    @Override
    public abstract double calculateOvertimeAmount();

    @Override
    public abstract double calculateBonusAmount();

    @Override
    public abstract double calculateTotalEarnings();

    @Override
    public abstract double calculateNetPay();

}
