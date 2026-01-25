/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Model;

public abstract class Salary {
    private double regularHoursWorked;
    private double regularRate;
    private double regularAmount;
    
    //overtime
    private double overtimeHoursWorked;
    private double overtimeRate;
    private double overtimeAmount;
    
    //bonus
    private double bonusHoursWorked;
    private double bonusRate;
    private double bonusAmount;
    
    //deductions
    private double withholdingTax;
    private double sssDeduction;
    private double philHealthDeduction;
    private double pagIbigDeduction;
    
    //totals
    private double totalEarnings;
    private double totalDeductions;
    private double netPay;
    
    //constructors
    public Salary(){
    }

    //getters
    public double getRegularHoursWorked() {
        return regularHoursWorked;
    }

    public void setRegularHoursWorked(double regularHoursWorked) {
        this.regularHoursWorked = regularHoursWorked;
        calculateRegularAmount();
        calculateTotals();
    }

    public double getRegularRate() {
        return regularRate;
    }

    public void setRegularRate(double regularRate) {
        this.regularRate = regularRate;
        calculateRegularAmount();
        calculateTotals();
    }

    public double getRegularAmount() {
        return regularAmount;
    }

    public void setRegularAmount(double regularAmount) {
        this.regularAmount = regularAmount;
    }

    public double getOvertimeHoursWorked() {
        return overtimeHoursWorked;
    }

    public void setOvertimeHoursWorked(double overtimeHoursWorked) {
        this.overtimeHoursWorked = overtimeHoursWorked;
        calculateBonusAmount();
        calculateTotals();
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
        calculateOvertimeAmount();
        calculateTotals();
    }

    public double getOvertimeAmount() {
        return overtimeAmount;
    }

    public void setOvertimeAmount(double overtimeAmount) {
        this.overtimeAmount = overtimeAmount;
        calculateOvertimeAmount();
        calculateTotals();
    }

    public double getBonusHoursWorked() {
        return bonusHoursWorked;
    }

    public void setBonusHoursWorked(double bonusHoursWorked) {
        this.bonusHoursWorked = bonusHoursWorked;
        calculateBonusAmount();
        calculateTotals();
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
        calculateBonusAmount();
        calculateTotals();
    }

    public double getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public double getWithholdingTax() {
        return withholdingTax;
    }

    public void setWithholdingTax(double withholdingTax) {
        this.withholdingTax = withholdingTax;
        calculateTotals();
    }

    public double getSssDeduction() {
        return sssDeduction;
    }

    public void setSssDeduction(double sssDeduction) {
        this.sssDeduction = sssDeduction;
        calculateTotals();
    }

    public double getPhilHealthDeduction() {
        return philHealthDeduction;
    }

    public void setPhilHealthDeduction(double philHealthDeduction) {
        this.philHealthDeduction = philHealthDeduction;
        calculateTotals();
    }

    public double getPagIbigDeduction(){
        return pagIbigDeduction;
    }
    
    public void setPagIbigDeduction(double pagIbigDeduction){
        this.pagIbigDeduction = pagIbigDeduction;
        calculateTotals();
    }
    
    public double getTotalEarnings() {
        return totalEarnings;
    }

    public void setTotalEarnings(double totalEarnings) {
        this.totalEarnings = totalEarnings;
    }

    public double getTotalDeductions() {
        return totalDeductions;
    }

    public void setTotalDeductions(double totalDeductions) {
        this.totalDeductions = totalDeductions;
    }

    public void setNetPay(double netpay) {
        this.netPay = netpay;
    }
    
    //calculations
    private void calculateRegularAmount(){
        this.regularAmount = this.regularHoursWorked * this.regularRate;
    }
    private void calculateOvertimeAmount(){
        this.overtimeAmount = this.overtimeHoursWorked * this.overtimeRate;
    }
    private void calculateBonusAmount(){
        this.bonusAmount = this.bonusHoursWorked * this.bonusRate;
    }
    private void calculateTotals(){
        this.totalEarnings = regularAmount + overtimeAmount + bonusAmount;
        this.totalDeductions = withholdingTax + sssDeduction + philHealthDeduction + pagIbigDeduction;
        this.netPay = totalEarnings - totalDeductions;
    }
    
    public abstract double getNetPay();
        
}

