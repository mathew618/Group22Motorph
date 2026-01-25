/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Model;

/**
 *
 * @author LENOVO
 */
public class EmpSalary extends Salary {
    
    @Override
    public double getNetPay(){
        return getTotalEarnings() - getTotalDeductions();
    }
    
}
