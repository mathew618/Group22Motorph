/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package group22.motorph;

import group22.Model.Data;
import group22.Model.TempCSV;

/**
 *
 * @author mathe
 */
public class MotorPH {
    
    public static final String CSV_NAME = "Employee.csv";
    public static final String TEMP_CSV_NAME = "temp_emp.csv";
    
    public static void main(String[] args) {
        TempCSV.duplicateCSV(CSV_NAME, TEMP_CSV_NAME);
        Data.loadEmployees(TEMP_CSV_NAME);
        
        new Login().setVisible(true);
    }
}
