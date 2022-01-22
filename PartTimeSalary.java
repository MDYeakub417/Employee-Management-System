package salarymanagementsystemproject;
public class PartTimeSalary extends Salary{
    protected PartTimeEmployee employee;
    PartTimeSalary(PartTimeEmployee employee,double hourbasedSalary,int hour,double bonus)
    {
        this.employee=employee;
        this.hourbasedSalary=hourbasedSalary;
        this.hour = hour;
        this.bonus=bonus;   
    }

  @Override
    public double getSalary() {
        salary= hour*hourbasedSalary;
        return salary;
    }
  
  @Override
     public double gettotalSalary() {
       
        salary=hour*hourbasedSalary;
       
        totalSalary= salary+bonus;
       return totalSalary;
    } 
}
