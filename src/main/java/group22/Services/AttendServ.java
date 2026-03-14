/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Services;

import group22.Model.User;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AttendServ {

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("MM-dd-yyyy");
    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static void recordLogin(User user, DefaultTableModel model) {

        String empNo = user.getUsername();
        String fullName = user.getLastName() + " " + user.getFirstName();
        String date = LocalDate.now().format(DATE_FORMAT);
        String time = LocalTime.now().format(TIME_FORMAT);

        // Check if already logged in today
        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equals(empNo)
                    && model.getValueAt(i, 2).toString().equals(date)) {  // column 2 = Date
                JOptionPane.showMessageDialog(null, "Already logged in today");
                return;
            }
        }

        model.addRow(new Object[]{
            empNo,
            fullName,
            date,
            time,
            "" // Time-Out empty
        });

        JOptionPane.showMessageDialog(null, "Login recorded");
    }

    public static void recordLogout(User user, DefaultTableModel model) {

        String empNo = user.getUsername();
        String date = LocalDate.now().format(DATE_FORMAT);
        String time = LocalTime.now().format(TIME_FORMAT);

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equals(empNo)
                    && model.getValueAt(i, 2).toString().equals(date)
                    && model.getValueAt(i, 4).toString().isEmpty()) {   // column 4 = Time-Out

                model.setValueAt(time, i, 4);   // set Time-Out
                JOptionPane.showMessageDialog(null, "Logout recorded");
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "No login record found");
    }
}
