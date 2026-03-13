/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Model;

/**
 *
 * @author mathe
 */
public class User {

    private final String username;
    private final String position;
    private final String firstName;
    private final String lastName;

    public User(String username, String position, String lastName, String firstName) {
        this.username = username;
        this.position = position;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getUsername() { return username; }
    public String getPosition() { return position; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
}
