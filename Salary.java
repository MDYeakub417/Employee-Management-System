package salarymanagementsystemproject;
import java.io.Serializable;
public abstract class Salary implements Serializable{
    protected double basicSalary;
    protected double hourbasedSalary;
    protected int hour;
    protected double bonus;
    protected double insurance;
    protected double promotion; 
    protected double demotion;
    protected double totalSalary;
    protected double salary;
    protected double tax;
    protected Employee employee;
    Salary()
    {
        
    }
    Salary(Employee employee,double basicSalary, double bonus, double insurance,double promotion,double demotion)
    {
        this.employee=employee;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.insurance = insurance;
        this.promotion=promotion;
        this.demotion=demotion;
        
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getHourbasedSalary() {
        return hourbasedSalary;
    }

    public void setHourbasedSalary(double hourbasedSalary) {
        this.hourbasedSalary = hourbasedSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getInsurance() {
        return insurance;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }
    public double getPromotion() {
        return promotion;
    }

    public void setPromotion(double promotion) {
        this.promotion = promotion;
    }

    public double getDemotion() {
        return demotion;
    }

    public void setDemotion(double demotion) {
        this.demotion = demotion;
    }
   

    public abstract double getSalary(); 

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getTax(){
        return tax;
    }
    
    public void setTax(double tax) {
        this.tax = tax;
    }
    
     public abstract double gettotalSalary(); 
}
