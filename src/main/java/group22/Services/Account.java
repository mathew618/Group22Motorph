/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author mathe
 */
public class Account {

    private final HashMap<String, String[]> users = new HashMap<>();

    public void loadUsers(String filePath) {

        users.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 3) {
                    users.put(data[0].trim(), new String[]{
                        data[1].trim(), // password
                        data[2].trim() // position
                    });
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    public User login(String username, String password) {
        if (!users.containsKey(username)) return null;

        String storedPassword = users.get(username)[0];
        if (storedPassword.equals(password)) {
            String position = users.get(username)[1];
            return new User(username, position);
        }

        return null;
    }
    
}
