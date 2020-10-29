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
public class trainer extends employee{
    String technology;
    int student_count;

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getStudent_count() {
        return student_count;
    }

    public void setStudent_count(int student_count) {
        this.student_count = student_count;
    }
    public void add(int emp_id,String emp_name,String emp_type,String technology,int student_count){
        trainer trn=new trainer();
        trn.technology=technology;
        trn.student_count=student_count;
        trn.emp_type=emp_type;
        emp[empCount]=trn;
        super.add(emp_name, emp_id, emp_type);
    
    }
    @Override
    public void getDetails(int id){
        for (employee emp1 : emp) {
            if (id == emp1.emp_id) {
                this.technology = ((trainer) emp1).technology;
                this.student_count = ((trainer) emp1).student_count;
                super.getDetails(id);
                return;
            }
        }
    }
    @Override
    public void delete(int id){
        for(int i=0;i<empCount;i++){
            if(emp[i].emp_id==id){
                ((trainer)emp[i]).student_count=0;
                ((trainer)emp[i]).technology=null;
                super.delete(id);
            }
        }
    }
     public void replace(int rep,String name,String type,String tech,int inc){
        for (int i=0;i<empCount;i++) {
            if (emp[i].emp_id == rep) {
               
                ((trainer)emp[i]).technology=tech;
                ((trainer)emp[i]).student_count=inc;
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
                  if("TRN".equals(emp[j].emp_type)){
                     ((trainer)emp[j+1]).student_count=((trainer)emp[j]).student_count; 
                     ((trainer)emp[j+1]).technology=((trainer)emp[j]).technology; 
                     super.sort();
                  } 
                  else if("TRN".equals(emp[j+1].emp_type)){
                      ((trainer)emp[j]).student_count=((trainer)emp[j+1]).student_count; 
                      ((trainer)emp[j]).technology=((trainer)emp[j+1]).technology;
                      super.sort();
                  }
                  else{
                      
                  }
               }
           }
        }
   }
}
