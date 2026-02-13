/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.DAO;

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
public class TempCSV {
    
   public static void duplicateCSV(String sourceFile, String destinationFile) {
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
   
    public static void resetCSV(String sourceFile, String tempFile) {
        File file = new File(tempFile);
        if (file.exists()) {
            file.delete();
        }
        duplicateCSV(sourceFile, tempFile);
    }
}
