/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employ_management_system.java;

/**
 *
 * @author Manish Bothra
 */
public class manager extends employee {
    String department;
    int teamsize;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getTeamsize() {
        return teamsize;
    }

    public void setTeamsize(int teamsize) {
        this.teamsize = teamsize;
    }
    public void add(int emp_id,String emp_name,String emp_type,String department,int teamsize){
        manager man=new manager();
        man.department=department;
        man.teamsize=teamsize;
        man.emp_type=emp_type;
        emp[empCount]=man;
        super.add(emp_name, emp_id, emp_type);
    }
    @Override
    public void getDetails(int id){
        for (employee emp1 : emp) {
            if (id == emp1.emp_id) {
                this.department = ((manager) emp1).department;
                this.teamsize = ((manager) emp1).teamsize;
                super.getDetails(id);
                return;
            }
        }
    }
    @Override
    public void delete(int id){
        for(int i=0;i<empCount;i++){
            if(emp[i].emp_id==id){
                ((manager)emp[i]).department=null;
                ((manager)emp[i]).teamsize=0;
                super.delete(id);
            }
        }
    }
    public void replace(int rep,String name,String type,String dep,int inc){
        for (int i=0;i<empCount;i++) {
            if (emp[i].emp_id == rep) {
               
                ((manager)emp[i]).department=dep;
                ((manager)emp[i]).teamsize=inc;
                super.replace(rep, type,name);
                return;
                
            }
        }
   }
    @Override
    public void sort(){
        for(int i=0;i<empCount-1;i++){
           for(int j=0;j<empCount-1;j++){
               if(emp[j].emp_id>emp[j+1].emp_id){
                  if("MAN".equals(emp[j].emp_type)){
                     ((manager)emp[j+1]).department=((manager)emp[j]).department; 
                     ((manager)emp[j+1]).teamsize=((manager)emp[j]).teamsize;
                     super.sort();
                  } 
                  else if("MAN".equals(emp[j+1].emp_type)){
                      ((manager)emp[j]).department=((manager)emp[j+1]).department; 
                      ((manager)emp[j]).teamsize=((manager)emp[j+1]).teamsize; 
                      super.sort();
                  }
                  else{
                      
                  }
               }
           }
        }
   }
}
