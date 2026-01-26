/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package group22.Model;

/**
 *
 * @author LENOVO
 */
public interface SalaryOperations { 
    double getRegularAmount();
    double getOvertimeAmount();
    double getBonusAmount();
    double getTotalEarnings();
    double getTotalDeductions();
    double getNetPay();

    // Calculation methods
    double calculateRegularAmount();
    double calculateOvertimeAmount();
    double calculateBonusAmount();
    double calculateTotalEarnings();
    double calculateTotalDeductions();
    double calculateNetPay();
}
