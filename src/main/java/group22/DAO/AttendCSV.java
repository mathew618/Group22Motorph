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
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] d = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

                if (d.length < 5) {
                    System.out.println("Skipping invalid row: " + line);
                    continue;
                }

                AttendData emp;
                emp = new AttendData(
                        d[0], // empNumber
                        d[1], // empName
                        d[2], // Date
                        d[3], // logIn
                        d[4] // logOut
                );

                attendance.add(emp);
            }

        } catch (IOException e) {
            System.err.println("Error reading attendance CSV: " + e.getMessage());
        }

        return attendance;
    }
}
