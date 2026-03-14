/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package group22.motorph;

import group22.UI.Login;
import group22.Services.Data;
import group22.DAO.TempCSV;

/**
 *
 * @author mathe
 */
public class MotorPH {
    
    public static final String CSV_NAME = "Employee.csv";
    public static final String TEMP_CSV_NAME = "temp_emp.csv";
    
    public static final String ATTENDANCE_CSV_NAME = "AttendanceData.csv";
    public static final String ATTEND_TEMP_CSV_NAME = "temp_attend.csv";
    
    public static final String REQUESTS_CSV_NAME = "SupportRequests.csv";
    public static final String LEAVES_CSV_NAME = "Leaves.csv";
    
    public static void main(String[] args) {
        TempCSV.duplicateCSV(CSV_NAME, TEMP_CSV_NAME);
        TempCSV.duplicateCSV(ATTENDANCE_CSV_NAME, ATTEND_TEMP_CSV_NAME);
        
        Data.loadEmployees(TEMP_CSV_NAME);
        Data.loadAttendance(ATTEND_TEMP_CSV_NAME);
        Data.loadSupportRequest(REQUESTS_CSV_NAME);
        Data.loadLeaveRequest(LEAVES_CSV_NAME);
        
        new Login().setVisible(true);
    }
}
