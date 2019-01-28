public class User{

private String name;
private int numOfTask=0;
private Task tasksList[] ;

public User(String name,int length){
   this.name = name;
   tasksList= new Task[length];
}//end of constructor

public boolean addTask(Task t){
   if (numOfTask < tasksList.length){
        tasksList[numOfTask++] = new Task(t);
        return true;}//end of if statment 
   else {   
        System.out.println("there is no place in the array");
        return false;}
}//end of methode 

public int findTask(int tID){
   if (tID<0){
       System.out.println("wrong input ");
       return -1 ;}//end of if statment 
   else {
      for(int i=0; i<numOfTask;i++){
         if (tID == tasksList[i].getID())
            return i;           
      }//end of loop
   }//end of else methode
    return -1;     
}//end of find methode 

public void printTask(int ndx){
   if (findTask(ndx) < 0)
      System.out.println("wrong");
   else
      System.out.print(tasksList[ndx].toString());
}//end of methode

public boolean updateStatus (int tID,String newStatus){

   if (findTask(tID)==-1){
      System.out.println("wront id"); 
      return false;
       }//end of if 
   else{
      tasksList[findTask(tID)].setStatus(newStatus);
     return true;
    }//end of else  
}//end of update methode  
public void export(){
   System.out.println("the user name is "+this.name);
   for (int i=0;i<numOfTask;i++)
      System.out.println(tasksList[i].toString());  
}//end of print methode

public int getNumOfTask(){
	return numOfTask;
}

public Task[] getTasksList(){
	return tasksList;
} 

}//end of class 
