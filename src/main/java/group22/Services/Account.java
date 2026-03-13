/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Services;

import group22.DAO.AccountCSV;
import group22.Model.User;
import java.util.HashMap;

public class Account {
    
    private final HashMap<String, String[]> users;
    
    public Account(String filePath) {
        users = AccountCSV.loadUsers(filePath);
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
