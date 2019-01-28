public class Task{

private int id ;
private String name,status,duedate;
private boolean urgent ;

public Task(){}


public Task(int id , String name,String status,String duedate,boolean urgent){
   this.id = id ;
   this.name=name;
   this.status= status;
   this.duedate=duedate;
   this.urgent=urgent;
}//end of constructor with parameters.

public Task(Task task){
   this.id = task.id ;
   this.name=task.name;
   this.status= task.status;
   this.duedate=task.duedate;
   this.urgent=task.urgent;
}//end of coby constructor

public String toString(){
   String s1="\ntask id: "+id;
   String s2="\ntask name: "+name;
   String s3="\ntask status: "+status;
   String s4="\ntask due date: "+duedate;
   String s5= "\nurgency : " +urgent + "\n";
   
   return s1+s2+s3+s4+s5;
  
   }//end of to String 
   
public int getID(){
   return id;

}//end of getter

public void setStatus(String status){
   this.status=status; }//end of setter
}//end of class
