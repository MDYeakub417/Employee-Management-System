package salarymanagementsystemproject;
public class PartTimeEmployee extends Employee{
    PartTimeEmployee(int empolyeeId,String empolyeeName, long empolyeePhone, String empolyeeEmail, String empolyeeAddress)
    {
        this.empolyeeId=empolyeeId;
        this.empolyeeName = empolyeeName;
        this.empolyeePhone = empolyeePhone;
        this.empolyeeEmail = empolyeeEmail;
        this.empolyeeAddress = empolyeeAddress;
    }
    
    public void addEmployee(PartTimeEmployee employee)
    {
        this.PartTimeEmployeeLists.add(employee);
    }   
}
