/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Services;

import group22.DAO.AttendCSV;
import group22.DAO.EmpCSV;
import group22.Model.AttendData;
import group22.Model.Employee;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 * Central data service for MotorPH system.
 * Loads employees, attendance, salary, and payslip data.
 * Provides access to table models and employee/attendance lists.
 */
public class Data {

    // Table models
    private static final DefaultTableModel payslipModel = new DefaultTableModel(
            new Object[]{"Employee Number", "Last Name", "First Name", "Date", "Earnings", "Deductions", "Total"}, 0
    );

    private static final DefaultTableModel empModel = new DefaultTableModel(
            new Object[]{"Employee Number", "Last Name", "First Name", "Position"}, 0
    );

    private static final DefaultTableModel salaryModel = new DefaultTableModel(
            new Object[]{"Employee Number", "Last Name", "First Name", "Basic Salary", "Gross Semi-monthly Rate", "Hourly Rate"}, 0
    );

    private static final DefaultTableModel attendModel = new DefaultTableModel(
            new Object[]{"Employee Number", "Employee", "Date", "Time In", "Time Out"}, 0
    );

    // Lists
    private static List<Employee> employees;
    private static List<AttendData> attendances;

    // -------------------- EMPLOYEE METHODS --------------------
    public static void loadEmployees(String filePath) {
        employees = EmpCSV.read(filePath);

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

    public static Employee findEmployee(String name) {
        for (Employee e : getEmployees()) {
            String fullName = e.getLastName() + ", " + e.getFirstName();
            if (fullName.equals(name)) {
                return e;
            }
        }
        return null;
    }

    public static List<Employee> getEmployees() {
        return employees;
    }

    // -------------------- ATTENDANCE METHODS --------------------
    public static void loadAttendance(String filePath) {
        attendances = AttendCSV.read(filePath); // read attendance CSV
        attendModel.setRowCount(0); // clear model

        for (AttendData a : attendances) {
            attendModel.addRow(new Object[]{
                    a.getEmpNumber(),
                    a.getLastName() + ", " + a.getFirstName(), // combine for Employee column
                    a.getDate(),
                    a.getLogIn(),
                    a.getLogOut()
            });
        }
    }

    public static List<AttendData> getAttendances() {
        return attendances;
    }

    // -------------------- TABLE MODELS GETTERS --------------------
    public static DefaultTableModel getPayslipModel() {
        return payslipModel;
    }

    public static DefaultTableModel getEmpModel() {
        return empModel;
    }

    public static DefaultTableModel getSalaryModel() {
        return salaryModel;
    }

    public static DefaultTableModel getAttendModel() {
        return attendModel;
    }

    // -------------------- TEMPORARY HELPER --------------------
    public static void addPaidData(String emp, String lastName, String firstName, String date,
                                   String earnings, String deductions, String total) {
        payslipModel.addRow(new Object[]{emp, lastName, firstName, date, earnings, deductions, total});
    }
}