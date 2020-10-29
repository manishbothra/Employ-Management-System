/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employ_management_system.java;
import java.util.Arrays;


/**
 *
 * @author Manish Bothra
 */
public class employee {
     public String emp_name;
    public int emp_id;
    public String emp_type;
    
    public static employee[] emp=new employee[6];
    public static int empCount;
    
    public void add(String emp_name,int emp_id,String emp_type){
          emp[empCount].emp_id=emp_id;
        emp[empCount].emp_name=emp_name;
        emp[empCount].emp_type=emp_type;
        empCount++; 
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_type() {
        return emp_type;
    }

    public void setEmp_type(String emp_type) {
        this.emp_type = emp_type;
    }
   public static String getEmpType(int id){
     for (int i=0;i<empCount;i++){ 
             if (emp[i].emp_id == id) {
                 return emp[i].emp_type;
             }
         
         }
       return null;
   } 

   public void getDetails(int id){
         for (int i=0;i<empCount;i++) {
             if (emp[i].emp_id==id) {
                 this.emp_name = emp[i].emp_name;
                 this.emp_id = emp[i].emp_id;
                 this.emp_type = emp[i].emp_type;
                 return;
                }
             }
         }
   public void delete(int id){
         for (int i=0;i<empCount;i++) {
             if (emp[i].emp_id == id) {
                 emp[i].emp_id =0;
                 emp[i].emp_name=null;
                 emp[i].emp_type=null;
                 
                 break;
             }
         }
   }
   public void replace(int id,String emptype,String empname){
         for (int i=0;i<empCount;i++) {
             if (emp[i].emp_id == id) {
                 System.out.println(empname);
                 ((employee)emp[i]).emp_id = id;
                 ((employee)emp[i]).emp_name = empname;
                 ((employee)emp[i]).emp_type = emptype;
                 return;
             }
         }
   }
   public  void sort(){
       for(int i=0;i<empCount-1;i++){
           for(int j=0;j<empCount-1;j++){
               if(emp[j].emp_id>emp[j+1].emp_id){
                   int a=emp[j].emp_id;
                   emp[j].emp_id=emp[j+1].emp_id;
                   emp[j+1].emp_id=a;
                   String b=emp[j].emp_name;
                   emp[j].emp_name=emp[j+1].emp_name;
                   emp[j+1].emp_name=b;
                   String c=emp[j].emp_type;
                   emp[j].emp_type=emp[j+1].emp_type;
                   emp[j+1].emp_type=c;
               }
               else{
                  
               }
           }
       }
   }
  
   }
