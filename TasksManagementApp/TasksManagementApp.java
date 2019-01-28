import java.util.*;
public class TasksManagementApp{
static Scanner read = new Scanner(System.in);
public static void main (String args[]){

User user1=new User("Nouf",1000);
   Task t1=new Task( 1 ,"Art Homework","Open","20/1/2019",true);
      user1.addTask(t1);
   Task t2=new Task( 2 ,"Print Agendas","New","25/1/2019",true);
      user1.addTask(t2);
   Task t3=new Task( 3 ,"Get groceries","Completed","10/1/2019",false);
      user1.addTask(t3);

int menu;
do{
   System.out.println("1.add new task");
   System.out.println("2.find and print the task by id");
   System.out.println("3.Change the status of a task by entering the task id and the updated (new) status");
   System.out.println("4.Display the user information including all tasks’.");
   System.out.println("5.exit");
   System.out.print("your choice:");

   menu = read.nextInt();//by the user

switch(menu){

case 1: 
      if  (user1.numOfTask==user1.tasksList.length){
      System.out.println("the array is full");
      break;  }//end of if
      System.out.println("enter the id");
      int id=read.nextInt();
      
      System.out.println("enter the name");
      String name =read.next();
      
      System.out.println("enter the status");
      String status =read.next();
      
      System.out.println("enter the due date");
      String duedate =read.next();
      
      System.out.println("is it urgent ?");
      boolean urgent =read.nextBoolean();
      
   Task t4 =new Task(id,name,status,duedate,urgent);
   user1.addTask(t4);
break;

case 2 : 

   System.out.println("enter the id");
   id = read.nextInt();
   user1.printTask(user1.findTask(id));
break;

case 3 :
   System.out.println("enter the id");
   id=read.nextInt();
   System.out.println("enter the new status");
   status=read.next();
boolean x=user1.updateStatus(id,status);
   if (x)
   System.out.println("changed");
   else
   System.out.println("there is a problem");
    break;

case 4 : 
      user1.export();
break;

case 5:
break;

default : System.out.println("wrong input");      
}//end of switch

}//end of do
while(menu!=5);
}//end of main

}//end of class 
