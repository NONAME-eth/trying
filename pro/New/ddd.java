


/* 🍔 
Fast-Food Order System
Queue + User Input
Customer places orders → order served one by one. */

package pro.New;
import java.util.*;
public class ddd {
   public static void main(String [] args){
    Scanner sc=new Scanner(System.in);

    Queue<String> orderlist=new ArrayDeque<>();
    int input;

    do{
        System.out.println("---Food Ordering System");
        System.out.println("1.Menu");
        System.out.println("2.Place order");
        System.out.println("3.Serve order");
        System.out.println("4.view pending list");
        System.out.println("5.Exit");
       
        System.out.print("\nEnter your choice: ");
        input=sc.nextInt();
        sc.nextLine();

        switch(input){
            case 1:
            System..out.println("Menu");
            do{
               System.out.println("1.Veg-Burgers");
                     System.out.println("\t Pasta Burger" + "Price " + 49 );
                     System.out.println("\tTandoori Burger" + "Price " + 69);
                     System.out.println("\tDouble Tikki Burger" + "Price " + 89);
                     System.out.println("\tAalo Tikki Burger" + "Price " + 29);
                     System.out.println("\tVeg Loaded Burger" + "Price " + 39);
                     System.out.println("\tCheesy Panner Burger" + "Price " + 99);
              System.out.println("2.Fries");
                     System.out.println("\tPeri-Peri Fries " + " Price " + 89);
                     System.out.println("\tMasala Fries " + " Price " + 69);
                     System.out.println("\tCreamy Fries " + " Price " + 79 );
                     System.out.println("\tSpicy Fries " + " Price " + 69 );
                     System.out.println("\tPlain Fries " + " Price " + 49 );
              System.out.println("3.Veg-Pizza");
                     System.out.println("\tPlain Pizza " + " Price " + 69);  
                     System.out.println("\tOnion Capsicum Pizza " + " Price " + 120); 
                     System.out.println("\tGarlic Pizza " + " Price " + 149); 
                     System.out.println("\tLoaded Cheese Pizza " + " Price " + 289); 
                     System.out.println("\tSpicy Veg Loaded Pizza " + " Price " + 320);
              System.out.println(4.Exit From Menu);
              
              switch(menuchoice){
                         case 1:
                         System.out.print("\nSelect Your Burger From Menu");
                         System.out.print("\nEnter the Burger name: ");
                         String burgerinput=sc.nextLine();
                         orderlist.offer(burgerinput);
                         System.out.println("Order: " + orderlist );
                         break;
                         
                         case 2:
                         System.out.print("\nSelect Your Fries From Menu");
                         System.out.print("\nEnter your fries name: ");
                         String friesinput=sc.nextLine();
                         orderlist.offer(friesinput);
                         System.out.println("Order: " + orderlist);
                         break;

                         case 3:
                         System.out.print("\nSelect Your Pizza From Menu");
                         System.out.print("\nEnter your Pizza name: ");
                         String pizzainput=sc.nextLine();
                         orderlist.offer(pizzainput)
                         System.out.println("Order: " + orderlist );
                        break;

                        case 4:
                        System.out.println("Exit");
                        return;

                        default:
                        System.out.println("Invalid Input");
                        return;

              }




            }while(menuchoice!=4);


            break;

            case 2:
             System.out.print("\nEnter the order from menu: ");
             String orderinput=sc.nextLine();
             System.out.println("Order " + orderinput);
            break;

            case 3:

            break;

            case 4:
             System.out.print("");
            break;


            case 5:

            break;

            default:



        }
    }while(input!=5);
   } 
}
