/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package group22.motorph;

import group22.Model.Data;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mathe
 */
public class MotorPH {
    
    public static final String CSV_NAME = "Employee.csv";
    public static final String TEMP_CSV_NAME = "temp_emp.csv";
    
    private class Temp {

    //Duplicate CSV
    private static void duplicateCSV(String sourceFile, String destinationFile) {
        File file = new File(destinationFile);

        if (file.exists()) return;

        //Duplicate the file
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            System.err.println("Error duplicating CSV: " + e.getMessage());
        }
    }
    
}

    public static void main(String[] args) {
        Temp.duplicateCSV(CSV_NAME, TEMP_CSV_NAME);
        Data.loadEmployees(TEMP_CSV_NAME);
        
        
    }
}
