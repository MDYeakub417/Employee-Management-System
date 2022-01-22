package salarymanagementsystemproject;
public class FullTimeSalary extends Salary{
    protected FullTimeEmployee employee;

    FullTimeSalary() {
    }
    
    FullTimeSalary(FullTimeEmployee employee,double basicSalary, double bonus, double insurance,double promotion,double demotion)
    {
        this.employee=employee;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.insurance = insurance;
        this.promotion=promotion;
        this.demotion=demotion;
        
    }

  @Override
    public double getSalary() {
        salary=basicSalary+bonus+insurance+promotion-demotion;
        return salary;
    }

 
  @Override
    public double getTax() {
        salary=basicSalary+bonus+insurance+promotion-demotion;
        tax=0.05*salary;
        return tax;
    }
  
    
  @Override
     public double gettotalSalary() {
       
        salary=basicSalary+bonus+insurance+promotion-demotion;
        tax=0.05*salary;
        totalSalary= salary-tax;
       return totalSalary;
    } 
}
