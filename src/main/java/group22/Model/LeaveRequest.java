/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group22.Model;

/**
 *
 * @author mathe
 */
public class LeaveRequest {
    
    private final String username;
    private final String type;
    private final String start;
    private final String end;
    private final String total;
    private final String status;
    private final String reason;

    public LeaveRequest(String username, String type, String start, String end, String total, String status, String reason) {
        this.username = username;
        this.type = type;
        this.start = start;
        this.end = end;
        this.total = total;
        this.status = status;
        this.reason = reason;
    }

    public String getUsername() {
        return username;
    }

    public String getType() {
        return type;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public String getTotal() {
        return total;
    }

    public String getStatus() {
        return status;
    }

    public String getReason() {
        return reason;
    }

    
}
