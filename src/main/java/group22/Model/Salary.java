/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Model;

public abstract class Salary implements SalaryOperations {
    //rates
    private double regularHoursWorked;
    private double regularRate;
    private double regularAmount;
    //overtime
    private double overtimeHoursWorked;
    private double overtimeRate;
    private double overtimeAmount;
    //hours worked
    private double bonusHoursWorked;
    private double bonusRate;
    private double bonusAmount;
    //gov deductions
    private double withholdingTax;
    private double sssDeduction;
    private double philHealthDeduction;
    private double pagIbigDeduction;
    //totals
    private double totalEarnings;
    private double totalDeductions;
    private double netPay;

    // Constructor
    public Salary() {}

    // Getters and setters 
    public double getRegularHoursWorked(){ return regularHoursWorked; }
    public void setRegularHoursWorked(double regularHoursWorked){ this.regularHoursWorked = regularHoursWorked; }

    public double getRegularRate(){ return regularRate; }
    public void setRegularRate(double regularRate){ this.regularRate = regularRate; }

    public double getOvertimeHoursWorked(){ return overtimeHoursWorked; }
    public void setOvertimeHoursWorked(double overtimeHoursWorked){ this.overtimeHoursWorked = overtimeHoursWorked; }

    public double getOvertimeRate(){ return overtimeRate; }
    public void setOvertimeRate(double overtimeRate){ this.overtimeRate = overtimeRate; }

    public double getBonusHoursWorked(){ return bonusHoursWorked; }
    public void setBonusHoursWorked(double bonusHoursWorked){ this.bonusHoursWorked = bonusHoursWorked; }

    public double getBonusRate(){ return bonusRate; }
    public void setBonusRate(double bonusRate){ this.bonusRate = bonusRate; }

    public double getWithholdingTax(){ return withholdingTax; }
    public void setWithholdingTax(double withholdingTax){ this.withholdingTax = withholdingTax; }

    public double getSssDeduction(){ return sssDeduction; }
    public void setSssDeduction(double sssDeduction){ this.sssDeduction = sssDeduction; }

    public double getPhilHealthDeduction(){ return philHealthDeduction; }
    public void setPhilHealthDeduction(double philHealthDeduction){ this.philHealthDeduction = philHealthDeduction; }

    public double getPagIbigDeduction(){ return pagIbigDeduction; }
    public void setPagIbigDeduction(double pagIbigDeduction) { this.pagIbigDeduction = pagIbigDeduction; }

    // Getters for computations
    @Override
    public double getRegularAmount(){ return regularAmount; }
    protected void setRegularAmount(double regularAmount){ this.regularAmount = regularAmount; }

    @Override
    public double getOvertimeAmount(){ return overtimeAmount; }
    protected void setOvertimeAmount(double overtimeAmount){ this.overtimeAmount = overtimeAmount; }

    @Override
    public double getBonusAmount(){ return bonusAmount; }
    protected void setBonusAmount(double bonusAmount){ this.bonusAmount = bonusAmount; }

    @Override
    public double getTotalEarnings(){ return totalEarnings; }
    protected void setTotalEarnings(double totalEarnings){ this.totalEarnings = totalEarnings; }

    @Override
    public double getTotalDeductions(){ return totalDeductions; }
    protected void setTotalDeductions(double totalDeductions){ this.totalDeductions = totalDeductions; }

    @Override
    public double getNetPay(){ return netPay; }
    protected void setNetPay(double netPay){ this.netPay = netPay; }

    // Abstract calculation methods
    @Override
    public abstract double calculateRegularAmount();

    @Override
    public abstract double calculateOvertimeAmount();

    @Override
    public abstract double calculateBonusAmount();

    @Override
    public abstract double calculateTotalEarnings();

    @Override
    public abstract double calculateTotalDeductions();

    @Override
    public abstract double calculateNetPay();
        
}