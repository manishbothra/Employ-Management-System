
package employ_management_system.java;
import java.util.Scanner;

public class Employ_Management_SystemJava extends employee{

    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("WELCOME TO EMPLOYEE MANAGEMENT SYSTEM");
       while(true){
           if(emp.length>empCount){
       System.out.println("Press 1 to add Employee");
       System.out.println("Press 2 to search Employee");
       System.out.println("Press 3 to delete Employee");
       System.out.println("Press 4 to replace the Employee");
       System.out.println("Press 5 to print the Employee list");
       int num1=sc.nextInt();
           OUTER:
           switch (num1) {
               case 1:
                   System.out.println("Enter 1 to add DIRECTOR");
                   System.out.println("Enter 2 to add MANAGER");
                   System.out.println("Enter 3 to add TRAINER");
                   int num2=sc.nextInt();
                   switch (num2) {
                       case 1:
                       {
                           System.out.println("Enter the employ id");
                           int id=sc.nextInt();
                           System.out.println("Enter the employ name");
                           String name=sc.next();
                           System.out.println("The employ type is");
                           String type="DIR";
                           //System.out.println("DIRECTOR");
                           System.out.println("Enter the employ DIN");
                           int din=sc.nextInt();
                           System.out.println("Enter the employ incentive");
                           int inc=sc.nextInt();
                           director dir=new director();
                           dir.add(id,name,type,din,inc);
                           System.out.println("Director added successfully\n\n");
                           break;
                       }
                       case 2:
                       {
                           System.out.println("Enter the employ id");
                           int id=sc.nextInt();
                           System.out.println("Enter the employ name");
                           String name=sc.next();
                           System.out.println("Enter the employ type");
                           String type="MAN";
                           //System.out.println("MANAGER");
                           System.out.println("Enter the employ department");
                           String dep=sc.next();
                           System.out.println("Enter the employ teamsize");
                           int ts=sc.nextInt();
                           manager man=new manager();
                           man.add(id,name,type,dep,ts);
                           System.out.println("Manager added successfully\n\n");
                           break;
                       }
                       case 3:
                       {
                           System.out.println("Enter the employ id");
                           int id=sc.nextInt();
                           System.out.println("Enter the employ name");
                           String name=sc.next();
                           System.out.println("Enter the employ type");
                           String type="TRN";
                           //System.out.println("TRAINER");
                           System.out.println("Enter the employ technology");
                           String tech=sc.next();
                           System.out.println("Enter the employ student_count");
                           int stc=sc.nextInt();
                           trainer trn=new trainer();
                           trn.add(id,name,type,tech,stc);
                           System.out.println("Trainer added successfully\n\n");
                           break;
                       }
                       default:
                           System.out.println("Invalid choice");
                           break;
                   }       break;
               case 2:
                   {
                       System.out.println("Enter the id you want to search");
                       int id=sc.nextInt();
                       String emptype;
                       emptype=employee.getEmpType( id);
                       if (null != emptype) {
                           switch (emptype) {
                               case "DIR":
                                   director dir=new director();
                                   dir.getDetails(id);
                                   System.out.println("Id:"+dir.getEmp_id());
                                   System.out.println("NAME:"+dir.getEmp_name());
                                   System.out.println("TYPE:"+dir.getEmp_type());
                                   System.out.println("DIN:"+dir.getDin_num());
                                   System.out.println("Incentive:"+dir.getIncentive());
                                   break OUTER;
                               case "MAN":
                                   manager man=new manager();
                                   man.getDetails(id);
                                   System.out.println("Id:"+man.getEmp_id());
                                   System.out.println("NAME:"+man.getEmp_name());
                                   System.out.println("TYPE:"+man.getEmp_type());
                                   System.out.println("DEPARTMENT:"+man.getDepartment());
                                   System.out.println("TEAMSIZE:"+man.getTeamsize());
                                   break OUTER;
                               case "TRN":
                                   trainer trn=new trainer();
                                   trn.getDetails(id);
                                   System.out.println("Id:"+trn.getEmp_id());
                                   System.out.println("NAME:"+trn.getEmp_name());
                                   System.out.println("TYPE:"+trn.getEmp_type());
                                   System.out.println("TECHNOLOGY:"+trn.getTechnology());
                                   System.out.println("STUDENT_COUNT:"+trn.getStudent_count());
                                   break OUTER;
                               case "null":
                                   System.out.println("No information available\n\n");
                                   break;
                               default:
                                   break;
                           }
                       }
                       else{
                           System.out.println("No information available\n\n");
                           break;
                       }
                   }
               case 3:
               {
                   System.out.println("Enter the id you want to delete");
                   int id=sc.nextInt();
                   String emptype=employee.getEmpType(id);
                  if("DIR".equals(emptype)){
                      director dir=new director();
                      dir.delete(id);
                      System.out.println("Employee deleted successfully \n\n");
                      break;
                  }
                  else if("MAN".equals(emptype)){
                      manager man=new manager();
                      man.delete(id);
                      System.out.println("Employee deleted successfully\n\n");
                      break;
                  }
                  else if("TRN".equals(emptype)){
                      trainer trn=new trainer();
                      trn.delete(id);
                      System.out.println("Employee deleted successfully\n\n");
                      break;
                  }
                  else {
                      System.out.println("Invalid choice\n\n");
                      break;
                      
                  }    
                   }  
               case 4:
               {
                   System.out.println("Enter the id you want to replace");
                   int rep=sc.nextInt();
                   String emptype=employee.getEmpType(rep);
                   switch (emptype){
                       case "DIR":
                           director dir=new director();
                           System.out.println("Enter the new employ name");
                           String name=sc.next();
                           System.out.println("The new employ type is");
                           String type="DIR";
                           System.out.println("DIRECTOR");
                           System.out.println("Enter the new employ DIN");
                           int din=sc.nextInt();
                           System.out.println("Enter the new employ incentive");
                           int inc=sc.nextInt();
                           dir.replace(rep,name,type,din,inc);
                           System.out.println("Employee replaced successfully");
                           break;
                       case "MAN":
                           manager man=new manager();
                           System.out.println("Enter the new employ name");
                            name=sc.next();
                           System.out.println("The new employ type is");
                            type="MAN";
                           System.out.println("MANAGER");
                           System.out.println("Enter the new employ department");
                           String dep=sc.next();
                           System.out.println("Enter the new employ teamsize");
                            inc=sc.nextInt();
                           man.replace(rep,name,type,dep,inc);
                           System.out.println("Employee replaced successfully");
                           break;
                       case "TRN":
                           trainer trn=new trainer();
                           System.out.println("Enter the new employ name");
                            name=sc.next();
                           System.out.println("The new employ type is");
                            type="TRN";
                           System.out.println("TRAINER");
                           System.out.println("Enter the new employ technology");
                           String tech=sc.next();
                           System.out.println("Enter the new employ student count");
                            inc=sc.nextInt();
                           trn.replace(rep,name,type,tech,inc);
                           System.out.println("Employee replaced successfully");
                           break;
                       case "null":
                            System.out.println("No information available\n\n");
                                break;
                            default:
                                break;  
                   }
               }
               case 5:
               {
                director dir1=new director();
                manager man1=new manager();
                trainer trn1=new trainer();
                dir1.sort();
                man1.sort();
                trn1.sort();
                   for(int i=0;i<empCount;i++){
                       
                       if(emp[i].emp_id==0){
                           System.out.println();
                           
                       }
                       
                       else{
                           if("DIR".equals(emp[i].emp_type)){
                               director dir=new director();
                               dir.getDetails(emp[i].emp_id);
                               System.out.println("Employee Id:"+dir.getEmp_id());
                               System.out.println("Employee Name:"+dir.getEmp_name());
                               System.out.println("Employee Type:"+dir.getEmp_type());
                               System.out.println("Employee DIN Number:"+dir.getDin_num());
                               System.out.println("Employee Incentive:"+dir.getIncentive()+"\n\n");
                               
                           }
                           if("MAN".equals(emp[i].emp_type)){
                               manager man=new manager();
                               man.getDetails(emp[i].emp_id);
                               System.out.println("Employee Id:"+man.getEmp_id());
                               System.out.println("Employee Name:"+man.getEmp_name());
                               System.out.println("Employee Type:"+man.getEmp_type());
                               System.out.println("Employee Department:"+man.getDepartment());
                               System.out.println("Employee Teamsize:"+man.getTeamsize()+"\n\n");
                               
                           }
                           if("TRN".equals(emp[i].emp_type)){
                               trainer trn=new trainer();
                               trn.getDetails(emp[i].emp_id);
                               System.out.println("Employee Id:"+trn.getEmp_id());
                               System.out.println("Employee Name:"+trn.getEmp_name());
                               System.out.println("Employee Type:"+trn.getEmp_type());
                               System.out.println("Employee Technology:"+trn.getTechnology());
                               System.out.println("Employee StudentCount:"+trn.getStudent_count()+"\n\n");
                               
                           }
                       }
                   }                  
                   
                   
               }
           }
      } 
            else{
               System.out.println("More Employees cannot be added");
               break;
               }
          
        }  
    }    
}
