/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Model;

/**
 *
 * @author mathe
 */
public class Employee {
    private String empNumber;
    private String lastName;
    private String firstName;
    private String birthdate;
    private String address;
    private String phone;
    private String status;
    private String position;
    private String sss;
    private String tin;
    private String philHealth;
    private String pagIbig;
    private String basicSalary;
    private String grossSemiMonthly;
    private String hourlyRate;

    public Employee(String empNumber, String lastName, String firstName, String birthdate, String address, String phone, String status, String position, String sss, String tin, String philHealth, String pagIbig, String basicSalary, String grossSemiMonthly, String hourlyRate) {
        this.empNumber = empNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthdate = birthdate;
        this.address = address;
        this.phone = phone;
        this.status = status;
        this.position = position;
        this.sss = sss;
        this.tin = tin;
        this.philHealth = philHealth;
        this.pagIbig = pagIbig;
        this.basicSalary = basicSalary;
        this.grossSemiMonthly = grossSemiMonthly;
        this.hourlyRate = hourlyRate;
    }
    
    
    //getters
    public String getEmpNumber(){
        return empNumber;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getBirthdate(){
        return birthdate;
    }
    public String getAddress (){
        return address;
    }
    public String getPhone(){
        return phone;
    }
    public String getStatus(){
        return status;
    }
    public String getPosition(){
        return position;
    }
    public String getSss(){
        return sss;
    }
    public String getTin(){
        return tin;
    }
    public String getPhilHealth(){
        return philHealth;
    }
    public String getPagIbig(){
        return pagIbig;
    }
    public String getBasicSalary() {
        return basicSalary;
    }

    public String getGrossSemiMonthly() {
        return grossSemiMonthly;
    }

    public String getHourlyRate() {
        return hourlyRate;
    }
    

    //setters
    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setSss(String sss) {
        this.sss = sss;
    }
    public void setTin(String tin) {
        this.tin = tin;
    }
    public void setPhilHealth(String philHealth) {
        this.philHealth = philHealth;
    }
    public void setPagIbig(String pagIbig){
        this.pagIbig = pagIbig;
    }

    public void setBasicSalary(String basicSalary) {
        this.basicSalary = basicSalary;
    }
    public void setGrossSemiMonthly(String grossSemiMonthly) {
        this.grossSemiMonthly = grossSemiMonthly;
    }

    public void setHourlyRate(String hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    
}
