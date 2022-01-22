package salarymanagementsystemproject;
import java.io.Serializable;
import java.util.ArrayList;
public class Employee implements Serializable{
     protected int empolyeeId;
     protected String empolyeeName;
     protected long empolyeePhone;
     protected String empolyeeEmail;
     protected String empolyeeAddress;
    
     public  ArrayList<FullTimeEmployee> FullTimeEmployeeLists = new ArrayList<FullTimeEmployee>();
     public  ArrayList<FullTimeSalary> FullTimeSalaryLists = new ArrayList<FullTimeSalary>();
     public  ArrayList<PartTimeEmployee> PartTimeEmployeeLists = new ArrayList<PartTimeEmployee>();
     public  ArrayList<PartTimeSalary> PartTimeSalaryLists = new ArrayList<PartTimeSalary>();
     Employee()
     {
         
     }
    Employee(int empolyeeId,String empolyeeName, long empolyeePhone, String empolyeeEmail, String empolyeeAddress)
    {
        this.empolyeeId=empolyeeId;
        this.empolyeeName = empolyeeName;
        this.empolyeePhone = empolyeePhone;
        this.empolyeeEmail = empolyeeEmail;
        this.empolyeeAddress = empolyeeAddress;
    }

    public int getEmpolyeeId() {
        return empolyeeId;
    }

    public void setEmpolyeeId(int empolyeeId) {
        this.empolyeeId = empolyeeId;
    }

    public String getEmpolyeeName() {
        return empolyeeName;
    }

    public void setEmpolyeeName(String empolyeeName) {
        this.empolyeeName = empolyeeName;
    }

    public long getEmpolyeePhone() {
        return empolyeePhone;
    }

    public void setEmpolyeePhone(long empolyeePhone) {
        this.empolyeePhone = empolyeePhone;
    }

    public String getEmpolyeeEmail() {
        return empolyeeEmail;
    }

    public void setEmpolyeeEmail(String empolyeeEmail) {
        this.empolyeeEmail = empolyeeEmail;
    }

    public String getEmpolyeeAddress() {
        return empolyeeAddress;
    }

    public void setEmpolyeeAddress(String empolyeeAddress) {
        this.empolyeeAddress = empolyeeAddress;
    }
}
