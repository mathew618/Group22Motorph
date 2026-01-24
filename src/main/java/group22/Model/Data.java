/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Model;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mathe
 */
public class Data {

    private static final DefaultTableModel payslipModel = new DefaultTableModel(
            new Object[]{"Employee Number", "Last Name", "First Name", "Date", "Earnings", "Deductions", "Total"}, 0
    );

    private static final DefaultTableModel empModel = new DefaultTableModel(
            new Object[]{"Employee Number", "Last Name", "First Name", "Position"}, 0
    );

    private static final DefaultTableModel salaryModel = new DefaultTableModel(
            new Object[]{"Employee Number", "Last Name", "First Name", "Basic Salary", "Gross Semi-monthly Rate", "Hourly Rate"}, 0
    );

    public static void loadEmployees(String filePath) {

        List<Employee> employees = EmpCSVReader.read(filePath);

        empModel.setRowCount(0);
        salaryModel.setRowCount(0);

        for (Employee e : employees) {

            // Employee table
            empModel.addRow(new Object[]{
                e.getEmpNumber(),
                e.getLastName(),
                e.getFirstName(),
                e.getPosition()
            });

            // Salary table
            salaryModel.addRow(new Object[]{
                e.getEmpNumber(),
                e.getLastName(),
                e.getFirstName(),
                e.getBasicSalary(),
                e.getGrossSemiMonthly(),
                e.getHourlyRate()
            });
        }
    }

    public static DefaultTableModel getPayslipModel() {
        return payslipModel;
    }

    public static DefaultTableModel getEmpModel() {
        return empModel;
    }

    public static DefaultTableModel getSalaryModel() {
        return salaryModel;
    }

}
