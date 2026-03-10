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
    protected String empName;
    protected String Date;
    protected String logIn;
    protected String logOut;

    public AttendData(String empNumber, String empName, String Date, String logIn, String logOut) {
        this.empNumber = empNumber;
        this.empName = empName;
        this.Date = Date;
        this.logIn = logIn;
        this.logOut = logOut;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDate() {
        return Date;
    }

    public String getLogIn() {
        return logIn;
    }

    public String getLogOut() {
        return logOut;
    }
    
}
