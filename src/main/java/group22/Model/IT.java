/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Model;

/**
 *
 * @author mathe
 */
public class IT extends Employee {

    public IT(String empNumber, String lastName, String firstName, String birthdate, String address, String phone, String status, String position, String sss, String tin, String philHealth, String pagIbig, String basicSalary, String grossSemiMonthly, String hourlyRate) {
        super(empNumber, lastName, firstName, birthdate, address, phone, status, position, sss, tin, philHealth, pagIbig, basicSalary, grossSemiMonthly, hourlyRate);
    }

    @Override
    public double calculateSalary() {
        return Double.parseDouble(getBasicSalary());
    }
    
    @Override
    public String getEmployeeType() {
        return empType;
    }
}
