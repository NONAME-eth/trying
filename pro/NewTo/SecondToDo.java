package pro.NewTo;

import java.util.*;
public class SecondToDo {
 public static void main(String[] args){
 
 Operation obj=new Operation();

    Scanner sc=new Scanner(System.in);

    while(true){
         
         System.out.println("--- Product Management System---");
         System.out.println("1. Add Product Name");
          System.out.println("2. Remove Product");
           System.out.println("3. Display Product");
            System.out.println("4. Clear List");
              System.out.println("5. Search Product");
                 System.out.println("6. Exit");

            System.out.println("Ente Your Choice: ");
            int choice=sc.nextInt();

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
               break;

               default:

            }

    }
 }
}

