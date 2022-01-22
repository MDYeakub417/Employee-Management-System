package salarymanagementsystemproject;
public class FullTimeEmployee extends Employee{
    FullTimeEmployee() {
    }
    FullTimeEmployee(int empolyeeId,String empolyeeName, long empolyeePhone, String empolyeeEmail, String empolyeeAddress)
    {
        this.empolyeeId=empolyeeId;
        this.empolyeeName = empolyeeName;
        this.empolyeePhone = empolyeePhone;
        this.empolyeeEmail = empolyeeEmail;
        this.empolyeeAddress = empolyeeAddress;
    }

    public void addEmployee(FullTimeEmployee employee)
    {
        this.FullTimeEmployeeLists.add(employee);
    }
}
