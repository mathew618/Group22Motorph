/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Services;

/**
 *
 * @author mathe
 */
public class User {

    private final String username;
    private final String position;

    public User(String username, String position) {
        this.username = username;
        this.position = position;
    }

    public String getUsername() {
        return username;
    }

    public String getPosition() {
        return position;
    }
}
