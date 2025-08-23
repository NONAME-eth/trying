package pro;

import java.util.Scanner;

public class Cacl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // WELCOME
        System.out.println("Welcome To Calculator");
        // INPUTS FROM USER
        System.out.print("\n Enter First Number: ");
        double firstnum = sc.nextDouble();
        System.out.print("\n Enter Second Number: ");
        double secondnum = sc.nextDouble();

    

        System.out.println("Enter Your choice(1-4): ");
      int choice=sc.nextInt();
    // Operation 
        while(true){
            System.out.println("Select Operation To Perform");
         
            System.out.println("1. Addition");
            switch(choice){

                
                case 1:
                   System.out.println("1. Addition");
                System.out.println("Addition Operation Selected");
               double add= firstnum+secondnum;
                System.out.println("Addition of two numbers: " + add);

                case 2:
                System.out.println("Addition Operation Selected");
               double sub= firstnum-secondnum;
                System.out.println("Addition of two numbers: " + sub);
            
                 case 3:
                System.out.println("Addition Operation Selected");
               double mul= firstnum-secondnum;
                System.out.println("Addition of two numbers: " + mul);

                           case 4:
                System.out.println("Addition Operation Selected");
               double div= firstnum-secondnum;
                System.out.println("Addition of two numbers: " + div);

                default:
                System.out.println("Entered wrong input");
            }
    
            
           
        }

    }

}

