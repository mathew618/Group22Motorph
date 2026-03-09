/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Account {
    private final HashMap<String, String[]> users = new HashMap<>();

    public void loadUsers(String filePath) {

        users.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length >= 6) {
                    users.put(data[0].trim(), new String[] {
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
        
        
    }

    public User login(String username, String password) {
    if (!users.containsKey(username)) return null;

    String[] storedData = users.get(username);
    String storedPassword = storedData[0];
    if (storedPassword.equalsIgnoreCase(password)) {
        String position = storedData[1];
        String lastName = storedData[2];
        String firstName = storedData[3];
        return new User(username, position, lastName, firstName);
    }

    return null;
    }
}
