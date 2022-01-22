package salarymanagementsystemproject;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class SalaryManagementSystemProject {
     public static ArrayList<FullTimeEmployee> FullTimeEmployeeLists = new ArrayList<FullTimeEmployee>();
     public static ArrayList<FullTimeSalary> FullTimeSalaryLists = new ArrayList<FullTimeSalary>();
     public static ArrayList<PartTimeEmployee> PartTimeEmployeeLists = new ArrayList<PartTimeEmployee>();
     public static ArrayList<PartTimeSalary> PartTimeSalaryLists = new ArrayList<PartTimeSalary>();
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      try
      {   
       int n=1,n1=1,a,a1,a2;
       //Using Constractor for full time emoployee
       FullTimeEmployee emp =new FullTimeEmployee(1,"Emon",01234567325,"emon@gmail.com","dhaka");
       FullTimeEmployeeLists.add(emp);
       FullTimeSalary sal =new FullTimeSalary(emp,10000,2000,1000,0,0);
       FullTimeSalaryLists.add(sal);
       FullTimeEmployee emp1 =new FullTimeEmployee(2,"Abhijeet",01243652363,"abhijeet@gmail.com","dhaka");
       FullTimeEmployeeLists.add(emp1);
       FullTimeSalary sal1 =new FullTimeSalary(emp1,12000,3000,1000,0,0);
       FullTimeSalaryLists.add(sal1);
       FullTimeEmployee emp2 =new FullTimeEmployee(3,"Ajoy",01226721252,"ajoy@gmail.com","dhaka");
       FullTimeEmployeeLists.add(emp2);
       FullTimeSalary sal2 =new FullTimeSalary(emp2,15000,2000,1000,0,0);
       FullTimeSalaryLists.add(sal2);
       //Using Constractor for part time emoployee
       PartTimeEmployee emp3 =new PartTimeEmployee(4,"Partha",01245714562,"partha@gmail.com","dhaka");
       PartTimeEmployeeLists.add(emp3);
       PartTimeSalary sal3 =new PartTimeSalary(emp3,250,5,1000);
       PartTimeSalaryLists.add(sal3);
       PartTimeEmployee emp4 =new PartTimeEmployee(5,"Rafiad",01233172745,"rafiad@gmail.com","dhaka");
       PartTimeEmployeeLists.add(emp4);
       PartTimeSalary sal4 =new PartTimeSalary(emp4,250,7,1200);
       PartTimeSalaryLists.add(sal4);
       PartTimeEmployee emp5 =new PartTimeEmployee(6,"Yeakub",01234563213,"yeakub@gmail.com","dhaka");
       PartTimeEmployeeLists.add(emp5);
       PartTimeSalary sal5 =new PartTimeSalary(emp5,200,8,1500);
       PartTimeSalaryLists.add(sal5);
       
       System.out.print("----------------------------------------------------------------------------------");
       System.out.println(" ");
       System.out.println("                       Employee Salary Management System");
       System.out.println("----------------------------------------------------------------------------------");
       System.out.println(" ");
       String Username;
       int password;
       
   while(n1==1){
       System.out.println(" ");
       System.out.print("Enter username: ");
       Username=input.next();
       System.out.println(" ");
       System.out.print("Enter password: ");
       password=input.nextInt();
       if(Username.equals("username") && password==123456)
       {
       while(n==1)
       { 
         System.out.println(" ");
         System.out.println("Please select an option: ");
         System.out.println(".........................");
         System.out.println(" ");
         System.out.println("      1. Full Time Job");
         System.out.println("      2. Part Time Job");
         System.out.println(" ");
         System.out.print("Choose your option: ");
         a = input.nextInt(); 
         switch(a)
         {
             case 1:
         System.out.println(" ");
         System.out.println("Full Time Job: ");
         System.out.println("...............");
         System.out.println(" ");
         System.out.println("      1. Add Employee");
         System.out.println("      2. Delete Employee");
         System.out.println("      3. Update Employee Information");
         System.out.println("      4. Update Employee's Salary");
         System.out.println("      5. Print Employee's Salary");
         System.out.println("      6. Print Employee List");
         System.out.println(" ");
         System.out.print("Choose your option: ");
         a1 = input.nextInt();  
         switch(a1)
         {
              case 1:
              System.out.println(" ");
              System.out.println("Add Emoplyee:");
              System.out.println("..............");
              

              System.out.print("    Enter Employee's Id Number: ");
              int employeeId=input.nextInt();
              System.out.print("    Enter Employee's Name: ");
              String employeeName= input.next(); 
              System.out.print("    Enter Employee's Phone Number: ");
              long employeePhone= input.nextLong();
              System.out.print("    Enter Employee's Email Address: ");
              String employeeEmail= input.next();
              System.out.print("    Enter Employee's Address: ");
              String employeeAddress= input.next();
              FullTimeEmployee e1 =new FullTimeEmployee(employeeId,employeeName,employeePhone,employeeEmail,employeeAddress);
              System.out.println(" ");
              System.out.println("Add Salary: ");
              System.out.println("............");
              System.out.print("    Basic salary: ");
              double basicSalary=input.nextDouble();
              System.out.print("    Bonus: ");
              double bonus=input.nextDouble();
              System.out.print("    Insurance: ");
              double insurance=input.nextDouble();
              System.out.print("    Promotion: ");
              double promotion=input.nextDouble();
              System.out.print("    Deemotion: ");
              double demotion=input.nextDouble();
              FullTimeEmployeeLists.add(e1);
              
              FullTimeSalary s1 = new FullTimeSalary(e1,basicSalary,bonus,insurance,promotion,demotion);
              FullTimeSalaryLists.add(s1);
             System.out.println("Successfully New Employee Added.");
              break;
            case 2:
               System.out.println(" ");
               System.out.println("Remove Employee:");
               System.out.println(".................");
               System.out.print("  Enter Employee's Id Number: ");
               int employeeId1=input.nextInt();
               int number=0;
               for(int i=0;i<FullTimeEmployeeLists.size();i++)
               {
                   if(FullTimeEmployeeLists.get(i).getEmpolyeeId()==employeeId1)
                   {
                      
                       FullTimeEmployeeLists.remove(i);
                       FullTimeSalaryLists.remove(i);
                       number=1;
                       System.out.println(" ");
                       System.out.println("Successfull Employee Removed."); 
                   }
                   
               }
               if(number==0)
                   {
                      System.out.println(" ");
                      System.out.println("Employee not found."); 
                   }
               break;
            case 3:
               System.out.println(" ");
               System.out.println("Update Employee's Information: ");
               System.out.println("...............................");
               System.out.print("  Enter Employee's Id Number: ");
               int employeeId2=input.nextInt();
               int number1=0;
               for(int i=0;i<FullTimeEmployeeLists.size();i++)
               {
                   if(FullTimeEmployeeLists.get(i).getEmpolyeeId()==employeeId2)
                   {
                       System.out.println(" ");
                       System.out.print("    Enter Update Employee's Id Number:");
                       int employeeId3=input.nextInt();
                       System.out.print("    Enter Update Employee's Name: ");
                       String employeeName1= input.next(); 
                       System.out.print("    Enter Update Employee's Phone Number: ");
                       long employeePhone1= input.nextLong();
                       System.out.print("    Enter Update Employee's Email Address: ");
                       String employeeEmail1= input.next();
                       System.out.print("    Enter Update Employee's Address: ");
                       String employeeAddress1= input.next();
                       FullTimeEmployeeLists.get(i).setEmpolyeeId(employeeId3);
                       FullTimeEmployeeLists.get(i).setEmpolyeeName(employeeName1);
                       FullTimeEmployeeLists.get(i).setEmpolyeePhone(employeePhone1);
                       FullTimeEmployeeLists.get(i).setEmpolyeeEmail(employeeEmail1);
                       FullTimeEmployeeLists.get(i).setEmpolyeeAddress(employeeAddress1);
                      number1=1;
                      System.out.println("Successfully Employee Information Updated.");
                   }
                   
               }
               if(number1==0)
                   {
                      System.out.println(" ");
                      System.out.println("Employee not found."); 
                   }
               break;
            case 4:
                System.out.println(" ");
                System.out.println("Update Employee's Salary: ");
                System.out.println(".........................");;
                System.out.print("  Enter Employee's Id Number:");
                int employeeId4=input.nextInt();
                int number2=0;
                for(int i=0;i<FullTimeSalaryLists.size();i++)
                {
                    if(FullTimeSalaryLists.get(i).employee.empolyeeId==employeeId4)
                    {
                     
                     System.out.print("    Enter Update Employee's Basic Salary:");
                     double basicSalary1=input.nextDouble();
                     System.out.print("    Enter Update Employee's Bonus: ");
                     double bonus1=input.nextDouble();
                     System.out.print("    Enter Update Employee's Insurance: ");
                     double insurance1=input.nextDouble();
                     System.out.print("    Enter Update Employee's Promotion: ");
                     double promotion1=input.nextDouble();
                     System.out.print("    Enter Update Employee's Demotion: ");
                     double demotion1=input.nextDouble();
                     FullTimeSalaryLists.get(i).setBasicSalary(basicSalary1);
                     FullTimeSalaryLists.get(i).setBonus(bonus1);
                     FullTimeSalaryLists.get(i).setInsurance(insurance1);
                     FullTimeSalaryLists.get(i).setPromotion(promotion1);
                     FullTimeSalaryLists.get(i).setDemotion(demotion1);
                     number2=1;
                     System.out.println("Successfully Employee's salary updated.");
                    }
                    
                }
                if(number2==0)
                   {
                      System.out.println(" ");
                      System.out.println("Employee not found."); 
                   }
                break;
            case 5:
                System.out.println(" ");
                System.out.println("Employee's Salary: ");
                System.out.println("...................");
                System.out.print("  Enter Employee's id:");
                int employeeId5=input.nextInt();
                int number3=0;
                 for(int i=0;i<FullTimeSalaryLists.size();i++)
                {
                    if(FullTimeSalaryLists.get(i).employee.empolyeeId==employeeId5)
                    { 
                        System.out.println("    Employee's Id Number: "+FullTimeSalaryLists.get(i).employee.getEmpolyeeId());
                        System.out.println("    Basic salary: "+FullTimeSalaryLists.get(i).getBasicSalary());
                        System.out.println("    Bonus: "+FullTimeSalaryLists.get(i).getBonus());
                        System.out.println("    Insurance: "+FullTimeSalaryLists.get(i).getInsurance());
                        System.out.println("    Tax: "+FullTimeSalaryLists.get(i).getTax());
                        System.out.println("    Total salary: "+FullTimeSalaryLists.get(i).gettotalSalary());
                        number3=1;
                    }
                  
                 }
                 if(number3==0)
                   {
                      System.out.println(" ");
                      System.out.println("Employee not found."); 
                   }
                 
              break;
            case 6:
                System.out.println(" ");
                System.out.println("Employee List: ");
                System.out.println("...............");
                for(int i=0;i<FullTimeEmployeeLists.size();i++)
                { 
                  System.out.println("  Employee Id Number: "+FullTimeEmployeeLists.get(i).getEmpolyeeId()+","+" Employee Name: "+FullTimeEmployeeLists.get(i).getEmpolyeeName()+".");
                }
                break;
            default:
                System.out.println(" ");
                System.out.println("Wrong option!");
               break;
       }
       
       break;
        case 2:
                  
              System.out.println("Part Time Job: ");
              System.out.println("...............");
              System.out.println("      1. Add Employee");
              System.out.println("      2. Delete Employee");
              System.out.println("      3. Update Employee");
              System.out.println("      4. Update Employee's Salary");
              System.out.println("      5. Print Employee's Salary");
              System.out.println("      6. Print Employee List");
              System.out.println(" ");
         System.out.print("choose Your Option:");
         a1 = input.nextInt();  
         switch(a1)
         {
             case 1:
              System.out.println(" ");
              System.out.println("Add Employee: ");
              System.out.println("..............");
              System.out.print("    Enter Employee's Id Number:");
              int employeeId=input.nextInt();
              System.out.print("    Enter Employee's Name: ");
              String employeeName= input.next(); 
              System.out.print("    Enter Employee's Phone Number: ");
              long employeePhone= input.nextLong();
              System.out.print("    Enter Employee's Email Address: ");
              String employeeEmail= input.next();
              System.out.print("    Enter Employee's Address: ");
              String employeeAddress= input.next();
              PartTimeEmployee e1 =new PartTimeEmployee(employeeId,employeeName,employeePhone,employeeEmail,employeeAddress);
              System.out.println(" ");
              System.out.println("Add Salary: ");
              System.out.println("............");
              System.out.print("    Enter Employee's Hour Based Salary: ");
              double hourbasedSalary=input.nextDouble();
              System.out.print("    Enter Employee's Work Hour: ");
              int hour=input.nextInt();
              System.out.print("    Enter Employee's Bonus: ");
              double bonus=input.nextDouble();
             
              PartTimeEmployeeLists.add(e1);
              PartTimeSalary s1 = new PartTimeSalary(e1,hourbasedSalary,hour,bonus);
              PartTimeSalaryLists.add(s1);
            System.out.println("Successfully Employee Added.");
              break;
            case 2:
                System.out.println(" ");
                System.out.println("Remove Employee: ");
                System.out.println(".................");
                System.out.println("Enter Employee's Id Number: ");
               int employeeId1=input.nextInt();
               int number=0;
               for(int i=0;i<PartTimeEmployeeLists.size();i++)
               {
                   if(PartTimeEmployeeLists.get(i).getEmpolyeeId()==employeeId1)
                   {
                       
                       PartTimeEmployeeLists.remove(i);
                       PartTimeSalaryLists.remove(i);
                       number=1;
                       System.out.println(" ");
                       System.out.println("Successfully Employee removed."); 
                   }
                   
               }
               if(number==0)
                   {
                      System.out.println(" ");
                      System.out.println("Employee not found."); 
                   }
               break;
            case 3:
                System.out.println(" ");
                System.out.println("Update Employee Information: ");
                System.out.println(".............................");
                System.out.println("  Enter Employee's Id Number: ");
               int employeeId2=input.nextInt();
               int number1=0;
               for(int i=0;i<PartTimeEmployeeLists.size();i++)
               {
                   if(PartTimeEmployeeLists.get(i).getEmpolyeeId()==employeeId2)
                   {
                       System.out.print("    Enter Update Employee's Id Number: ");
                       int employeeId3=input.nextInt();
                       System.out.print("    Enter Update Employee's Name: ");
                       String employeeName1= input.next();
                       System.out.print("    Enter Update Employee's phone Number: ");
                       long employeePhone1= input.nextLong();
                       System.out.print("    Enter Update Employee's Email Address: ");
                       String employeeEmail1= input.next();
                       System.out.print("    Enter Update Employee's Address: ");
                       String employeeAddress1= input.next();
                       PartTimeEmployeeLists.get(i).setEmpolyeeId(employeeId3);
                       PartTimeEmployeeLists.get(i).setEmpolyeeName(employeeName1);
                       PartTimeEmployeeLists.get(i).setEmpolyeePhone(employeePhone1);
                       PartTimeEmployeeLists.get(i).setEmpolyeeEmail(employeeEmail1);
                       PartTimeEmployeeLists.get(i).setEmpolyeeAddress(employeeAddress1);
                      number1=1;
                      System.out.println("Successfully Employee's information Updated.");
                   }
                   
               }
               if(number1==0)
                   {
                      System.out.println(" ");
                      System.out.println("Employee not found."); 
                   }
               break;
            case 4:
                System.out.println(" ");
                System.out.println("Update Employee's Salary: ");
                System.out.println("..........................");
                System.out.println("  Enter Employee's Id Number: ");
                int employeeId4=input.nextInt();
                int number2=0;
                for(int i=0;i<PartTimeSalaryLists.size();i++)
                {
                    if(PartTimeSalaryLists.get(i).employee.empolyeeId==employeeId4)
                    {
                        System.out.print("    Enter Update Employee's Hour Based Salary: ");
                        double hourbasedSalary1=input.nextDouble();
                        System.out.print("    Enter Update Emoployee's Work Hour: ");
                        int hour1=input.nextInt();
                        System.out.print("    Enter Update Emoployee's Bonus: ");
                        double bonus1=input.nextDouble();
                    
                     PartTimeSalaryLists.get(i).setHourbasedSalary(hourbasedSalary1);
                     PartTimeSalaryLists.get(i).setHour(hour1);
                     PartTimeSalaryLists.get(i).setBonus(bonus1);
                     
                     number2=1;
                     System.out.println(" ");
                     System.out.println("Successfully Employee's Salary Updated.");
                    }
                    
                }
                if(number2==0)
                   {
                      System.out.println(" ");
                      System.out.println("Employee not found."); 
                   }
                break;
            case 5:
                System.out.println(" ");
                System.out.println("Employee's Salary: ");
                System.out.println("...................");
                System.out.println("  Enter Employee's Id Number: ");
                int employeeId5=input.nextInt();
                int number3=0;
                 for(int i=0;i<PartTimeSalaryLists.size();i++)
                {
                    if(PartTimeSalaryLists.get(i).employee.empolyeeId==employeeId5)
                    {
                        System.out.println("    Employee's Id Number: "+PartTimeSalaryLists.get(i).employee.getEmpolyeeId());
                        System.out.println("    Hour Based Salary: "+PartTimeSalaryLists.get(i).getHourbasedSalary());
                        System.out.println("    Work Hour: "+PartTimeSalaryLists.get(i).getHour());
                        System.out.println("    Bonus: "+PartTimeSalaryLists.get(i).getBonus());
                        System.out.println("    Total salary: "+PartTimeSalaryLists.get(i).gettotalSalary());
                        number3=1;
                    }
                  
                 }
                 if(number3==0)
                   {
                      System.out.println(" ");
                      System.out.println("Employee not found."); 
                   }
                 
              break;
            case 6:
                System.out.println(" ");
                System.out.println("Employee List: ");
                System.out.println("...............");
                for(int i=0;i<PartTimeEmployeeLists.size();i++)
                {
                  System.out.println("Employee Id Number: "+PartTimeEmployeeLists.get(i).getEmpolyeeId()+","+" Employee Name: "+PartTimeEmployeeLists.get(i).getEmpolyeeName()+".");
                   
                }
                break;
            default:
                System.out.println(" ");
                System.out.println("Wrong option!");
               break;   
         }
       
     break;
         } 
         System.out.println(" ");
        System.out.print("Enter 1 to select an option: ");
      n = input.nextInt();
     }
          File file =new File("SalaryManagementSystem.dat");
          FileOutputStream output = new FileOutputStream (file);
          ObjectOutputStream output1 =new ObjectOutputStream(output);
       for(int i=0;i<FullTimeEmployeeLists.size();i++)
        {
            output1.writeObject(FullTimeEmployeeLists.get(i));
            output1.writeUTF("\n");
            output1.writeObject(FullTimeSalaryLists.get(i));
            output1.writeUTF("\n");
        }
        
        for(int i=0;i<PartTimeEmployeeLists.size();i++)
        {
            output1.writeObject(PartTimeEmployeeLists.get(i)); 
            output1.writeUTF("\n");
            output1.writeObject(PartTimeSalaryLists.get(i));
            output1.writeUTF("\n");
        }
        
        output1.flush();
        output1.close();
        n1++;
       }
       else{
           System.out.println("Wrong username or password.");
           n1=1;
       }
      }
    }catch(FileNotFoundException e)
    {
        System.out.println(e);
    }catch(Exception e)
    {
        System.out.println(e);
    }
    }
    
}
