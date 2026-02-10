/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.UI;

import group22.Model.Employee;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EmployeeDetails extends JFrame {
    
    private final Employee emp;
    
    public EmployeeDetails(Employee emp) {
        this.emp = emp;
        initUI();
    }

    private void initUI() {
        setTitle("Employee Details and Salary");
        setSize(450, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // Employee details panel
        JPanel detailsPanel = new JPanel(new GridLayout(0, 2, 10, 10));
        String[] labels = {
            "Employee Number:", "Last Name:", "First Name:", "Birthdate:",
            "Address:", "Phone Number:", "Status:", "Position:",
            "SSS:", "TIN:", "PhilHealth:", "Pag-ibig:"
        };
        
        String[] values = {
            emp.getEmpNumber(),
            emp.getLastName(),
            emp.getFirstName(),
            emp.getBirthdate(),
            emp.getAddress(),
            emp.getPhone(),
            emp.getStatus(),
            emp.getPosition(),
            emp.getSss(),
            emp.getTin(),
            emp.getPhilHealth(),
            emp.getPagIbig()
        };
        
        for (int i = 0; i < labels.length; i++) {
            detailsPanel.add(new JLabel(labels[i]));
            detailsPanel.add(new JLabel(values[i] != null ? values[i] : ""));
        }
        mainPanel.add(detailsPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        add(mainPanel);
    }
}
