/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author mathe
 */
public class AccountCSV {

    public static HashMap<String, String[]> loadUsers(String filePath) {

        HashMap<String, String[]> users = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length >= 6) {
                    users.put(data[0].trim(), new String[]{
                        data[1].trim(), // password
                        data[2].trim(), // position
                        data[4].trim(), // lastName
                        data[5].trim()  // firstName
                    });
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return users;
    }
}
