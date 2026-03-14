/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Services;

import com.toedter.calendar.JDateChooser;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author mathe
 */
public class LeaveServ {

    public static long calculateTotalDays(Date start, Date end) {
        if (start == null || end == null) {
            return 0;
        }

        long diff = end.getTime() - start.getTime();
        return (diff / (1000 * 60 * 60 * 24)) + 1;
    }
    
    public static void startDate(JDateChooser start) {
        Date today = new Date();
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        cal.add(Calendar.DAY_OF_MONTH, 365);
        Date maxDate = cal.getTime();
        
        start.setMinSelectableDate(today);
        start.setMaxSelectableDate(maxDate);
    }
    
    public static void endDate(Date start, JDateChooser end) {
        if (start != null) {
            
            end.setEnabled(true);

            Calendar cal = Calendar.getInstance();
            cal.setTime(start);
            
            //Min Date
            cal.add(Calendar.DAY_OF_MONTH, 1);
            Date minEnd = cal.getTime();
            end.setMinSelectableDate(minEnd);
            
            //Max Date
            cal.add(Calendar.DAY_OF_MONTH, 365);
            Date maxEnd = cal.getTime();
            end.setMaxSelectableDate(maxEnd);
            
            end.setDate(minEnd);
        }
    }
}
