/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mathe
 */
public class EmpCSV {

    public static List<Employee> read(String filePath) {

        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] d = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

                Employee emp;
                emp = new Employee(
                        d[0], // empNumber
                        d[1], // lastName
                        d[2], // firstName
                        d[3], // birthdate
                        d[4], // address
                        d[5], // phone
                        d[10], // status
                        d[11], // position
                        d[6], // sss
                        d[8], // tin
                        d[7], // philHealth
                        d[9], // pagIbig
                        d[13], // basicSalary
                        d[17], // grossSemiMonthly
                        d[18] // hourlyRate
                ) {
                    @Override
                    public double calculateSalary() {
                        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    }
                };

                employees.add(emp);
            }

        } catch (IOException e) {
            System.err.println("Error reading employee CSV: " + e.getMessage());
        }

        return employees;
    }

    public static void removeEmployee(String filePath, int selectedRow) {

        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int currentRow = 0;

            while ((line = reader.readLine()) != null) {
                if (currentRow != (selectedRow + 1)) {
                    lines.add(line);
                }
                currentRow++;
            }

        } catch (IOException e) {
            System.err.println("Error reading CSV: " + e.getMessage());
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing CSV: " + e.getMessage());
        }
    }

}
