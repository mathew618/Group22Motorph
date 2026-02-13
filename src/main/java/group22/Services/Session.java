/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Services;

/**
 *
 * @author mathe
 */
public class Session {
    private static User currentUser;

    public Session() {
    }
    
    public static void start(User user) {
        currentUser = user;
    }
    
    public static User getCurrentUser() {
        return currentUser;
    }
    
    public static void end() {
        currentUser = null;
    }
    
    public static boolean isActive() {
        return currentUser != null;
    }
}
