/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.DAO;

import group22.Model.AttendData;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mathe
 */
public class AttendCSV {

    public static List<AttendData> read(String filePath) {
        List<AttendData> attendance = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");

                if (d.length < 5) continue; // must have 5 columns

                AttendData emp = new AttendData(
                        d[0].trim(),                  // Employee Number
                        "",                            // Last Name (not used in table)
                        d[1].trim(),                   // First Name / Full Name
                        d[2].trim(),                   // Date
                        d[3].trim(),                   // Time-In
                        d[4].trim()                    // Time-Out
                );

                attendance.add(emp);
            }

        } catch (IOException e) {
            System.err.println("Error reading attendance CSV: " + e.getMessage());
        }

        return attendance;
    }
}
