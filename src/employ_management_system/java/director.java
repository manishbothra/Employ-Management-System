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
public class director extends employee {
    int din_num;
     int incentive;
   

    public int getDin_num() {
        return din_num;
    }

    public void setDin_num(int din_num) {
        this.din_num = din_num;
    }

    public int getIncentive() {
        return incentive;
    }

    public void setIncentive(int incentive) {
        this.incentive = incentive;
    }

    
    public void add(int emp_id,String emp_name,String emp_type,int din_num,int incentive){
    director dir=new director();
    dir.din_num=din_num;
    dir.incentive=incentive;
   // dir.emp_type=emp_type;
    emp[empCount]=dir;//This is done because we have assigned values in emplyee class in the array 
    //but din_num and incentive are irector class variables so to assign them in array ,
    //emp[empCount]=dir means the obect variable is assigned to the array
    super.add(emp_name, emp_id, emp_type);
        
    }
    @Override
    public void getDetails(int id){
        for (employee emp1 : emp) {
            if (id == emp1.emp_id) {
                this.din_num = ((director) emp1).din_num;
                this.incentive = ((director) emp1).incentive;
                super.getDetails(id);
                return;
            }
        }
    }
    @Override
    public void delete(int id){
        for(int i=0;i<empCount;i++){
            if(emp[i].emp_id==id){
                
                ((director)emp[i]).din_num=0;
                ((director)emp[i]).incentive=0;
                
                super.delete(id);
                break;
                
            }
        }
    }
   public void replace(int rep,String name,String type,int din,int inc){
        for (int i=0;i<empCount;i++) {
            if (emp[i].emp_id == rep) {
             
                ((director)emp[i]).din_num=din;
                ((director)emp[i]).incentive=inc;
                super.replace(rep, type,name);
                return;
                
            }
        }
   }
    @Override
   public  void sort(){
        for(int i=0;i<empCount-1;i++){
           for(int j=0;j<empCount-1;j++){
               if(emp[j].emp_id>emp[j+1].emp_id){
                  if("DIR".equals(emp[j].emp_type)){
                     ((director)emp[j+1]).din_num=((director)emp[j]).din_num; 
                     ((director)emp[j+1]).incentive=((director)emp[j]).incentive; 
                     super.sort();
                  } 
                  else if("DIR".equals(emp[j+1].emp_type)){
                      ((director)emp[j]).din_num=((director)emp[j+1]).din_num; 
                      ((director)emp[j]).incentive=((director)emp[j+1]).incentive; 
                      super.sort();
                  }
                  else{
                      
                  }
               }
           }
        }
   }
}

