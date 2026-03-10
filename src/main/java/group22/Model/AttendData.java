/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Model;

/**
 *
 * @author mathe
 */
public class AttendData {
    protected String empNumber;
    protected String lastName;
    protected String firstName;
    protected String date;
    protected String logIn;
    protected String logOut;

    public AttendData(String empNumber,
                           String lastName,
                           String firstName,
                           String date,
                           String logIn,
                           String logOut) {
        this.empNumber = empNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.date = date;
        this.logIn = logIn;
        this.logOut = logOut;
    }

    public String getEmpNumber() { return empNumber; }

    public String getLastName() { return lastName; }
    
    public String getFirstName() { return firstName; }
    
    public String getDate() { return date;}

    public String getLogIn() { return logIn; }

    public String getLogOut() { return logOut; }
    
}
