/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.DAO;

import static group22.DAO.EmpCSV.escapeCSV;
import group22.Model.Request;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mathe
 */
public class RequestCSV {
    
    public static List<Request> read(String filePath) {

        List<Request> requests = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] d = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

                if (d.length < 4) {
                    System.out.println("Skipping invalid row: " + line);
                    continue;
                }

                Request req = new Request(
                        d[0].trim(),
                        d[1].trim(),
                        d[2].trim(),
                        d[3].trim()
                );

                requests.add(req);
            }

        } catch (IOException e) {
            System.err.println("Error reading attendance CSV: " + e.getMessage());
        }

        return requests;
    }
    
    public static void addRequests(String filePath, String... Data) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < Data.length; i++) {
                sb.append(escapeCSV(Data[i]));

                if (i < Data.length - 1) {
                    sb.append(",");
                }
            }
            sb.append("\n");

            writer.write(sb.toString());
            writer.flush();
            
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
