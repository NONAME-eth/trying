package pro.New.ToDoApp;

import java.util.ArrayList;

public class TaskManager {

     private ArrayList<Task> tasks=new ArrayList<>();  
    
   

 //creating arraylist            
      

    //methods 
    public void addTask(int id,String title,boolean iscompleted){

         if(iscompleted==true){
            System.out.println("Task already done");
         }
         else {
            Task obj=new Task( id,title , iscompleted);
        
            
        
 
          System.out.println("Task added successfully"); 
         }
        }


    //show task
    public void showtask(int id,String title,boolean iscompleted){
    
        System.out.println(tasks);
    }  
    

    //completed tasks
    public void taskcomp(int id,String title,boolean iscompleted){
        if(iscompleted==false){
            System.out.println("Task not completed yet");
        }
        else{
            System.out.println("Tasks done: " + tasks);
        }
    }

    // Remove a task
    public void remtask(int id,String title,boolean iscompleted ){
  
        



        if(tasks==null){
            System.out.println("No task in the list");
        }
        else{
         

        }

    }
    



    }

    

