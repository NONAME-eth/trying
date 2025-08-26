package pro.NewTo;

import java.util.*;
public class PMSMenu {
 public static void main(String[] args){
 
 PMSOperation obj=new PMSOperation();

    Scanner sc=new Scanner(System.in);

    while(true){
         
         System.out.println("--- Product Management System---");
         System.out.println("1. Add Product Name");
          System.out.println("2. Remove Product");
           System.out.println("3. Display Product");
            System.out.println("4. Clear List");
              System.out.println("5. Search Product");
                 System.out.println("6. Exit");

                 int choice=0;

        try{
               System.out.println("Enter Your Choice: ");
             choice=sc.nextInt();
            sc.nextLine();
        }  
        catch(InputMismatchException e){
          System.out.println("Invalid Input "+" Enter choice in numbers only(1-6) ");
          sc.nextLine();
          return;

        }       
           
            switch(choice){

               case 1:
              
               obj.addProduct(sc);
               break;
              
               case 2:
                obj.remProduct( sc);
               break;
            
               case 3:
                obj.displayProduct();
               break;
          
               case 4:
                obj.delAll();
               break;

               case 5:
                  obj.searchProduct(sc);
               break;

                case 6:
                  System.out.println("Exit");
                  return;
           
               default:
           
            }

    }
 }
}

