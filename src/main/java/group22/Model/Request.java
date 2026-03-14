/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Model;

/**
 *
 * @author mathe
 */
public class Request {
    
    private final String username;
    private final String role;
    private final String category;
    private final String description;

    public Request(String username, String role, String category, String description) {
        this.username = username;
        this.role = role;
        this.category = category;
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
    
}
