/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author mathe
 */
public class AttendServ {
    
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("MM-dd-yyyy");
    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");
    
    public static void logIn(JTextField empName, JTextField empNumber, DefaultTableModel model) {
        String name = empName.getText().trim();
        String empNo = empNumber.getText().trim();
        
        if (!checkInput(name, empNo)) {
            return;
        }

        LocalDate date = LocalDate.now();
        LocalTime timeIn = LocalTime.now();

        model.addRow(new Object[]{
            empNo,
            name,
            date.format(DATE_FORMAT),
            timeIn.format(TIME_FORMAT),
            ""
        });

        empName.setText("");
        empNumber.setText("");
    }
    
    public static void logOut(JTextField empName, JTextField empNumber, DefaultTableModel model) {
        String name = empName.getText().trim();
        String empNo = empNumber.getText().trim();
        
        if (!checkInput(name, empNo)) {
            return;
        }

        LocalDate date = LocalDate.now();
        LocalTime timeOut = LocalTime.now();

        for (int i = 0; i < model.getRowCount(); i++) {
            String rowEmpNo = model.getValueAt(i, 0).toString();
            String rowName = model.getValueAt(i, 1).toString();
            String rowDate = model.getValueAt(i, 2).toString();
            String rowTimeOut = model.getValueAt(i, 4).toString();

            if (rowDate.equals(date.format(DATE_FORMAT))
                    && rowName.equals(name)
                    && rowEmpNo.equals(empNo)
                    && rowTimeOut.isEmpty()) {

                model.setValueAt(timeOut.format(TIME_FORMAT), i, 4);
                JOptionPane.showMessageDialog(null, "Logged out successfully!");
                empName.setText("");
                empNumber.setText("");
                return;
            }
        }
        // If no matching record is found
        JOptionPane.showMessageDialog(null, "No matching login record found for logout.");
    }
    
    public static void monthFilter(JComboBox MonthPicker, TableRowSorter sorter) {
        String selected = (String) MonthPicker.getSelectedItem();

        if ("All".equals(selected)) {
            sorter.setRowFilter(null);
        } else {
            int monthIndex = MonthPicker.getSelectedIndex() - 1; // Subtract 1 for Jan = 0

            sorter.setRowFilter(new RowFilter<TableModel, Integer>() {
                @Override
                public boolean include(RowFilter.Entry<? extends TableModel, ? extends Integer> entry) {
                    try {
                        String dateString = entry.getStringValue(2); // 3rd column = Date
                        LocalDate date = LocalDate.parse(dateString, DATE_FORMAT);
                        return date.getMonthValue() == (monthIndex + 1); // back to 1–12
                    } catch (Exception e) {
                        return false;
                    }
                } 
            });
        }
    }

    private static boolean checkInput(String name, String empNumber) {
        if (name.isEmpty() && empNumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter employee name and employee number.");
            return false;
        } else if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter employee name.");
            return false;
        } else if (empNumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter employee number.");
            return false;
        }
        return true;
    }
    
}
