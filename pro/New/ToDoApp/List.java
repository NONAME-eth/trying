package pro.New.ToDoApp;
import java.util.Scanner;
import java.util.*;
public class List {
    public static void main(String[] args){

//INput 
   Scanner sc=new Scanner (System.in);
   TaskManager object=new TaskManager();

 // menu  
   while(true){
               System.out.println("---To-Do-App");
               System.out.println("1. Add Items In a List");
               System.out.println("2. Show Tasks");
               System.out.println("3. Completed Tasks");
               System.out.println("4. Remove Task");
               System.out.println("5. Exit");

               System.out.println("Enter your choice(1-5): ");
               int choice=sc.nextInt();


    switch(choice){
           case 1:
                System.out.println("Add task: ");
                  int addingtask=sc.nextInt();


               

           break;

           case 2:
              object.showtask( );
           break;

           case 3:
              object.taskcomp(int id , String title, boolean iscompleted);
           break;

           case 4:
             System.out.println("Enter the task you want to remove/delete: ");
             int remitem=sc.nextInt();


           break;

           case 5:
              System.out.println("Exit");
           break;

           default:
           System.out.println("Invalid Input");

        
    }

   }
     


    }
}
