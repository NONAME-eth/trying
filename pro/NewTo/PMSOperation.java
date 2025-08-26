package pro.NewTo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PMSOperation {
    
       ArrayList<String> products=new ArrayList<>();


      int n;
// 1. add Product
    public void addProduct(Scanner sc){
    // Handling exception and taking input of add product.....    
        try{
             System.out.println("Enter total numbers of products you want to add: ");
         n=sc.nextInt();
        sc.nextLine();
        System.out.println("You want to add " + n + " numbers of items/products in a list");
        System.out.println();
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input. " + " Please enter in numbers only ");
            return;
        }
    // loop for taking input in arraylist by user   
        for(int i=0;i<n;i++){
                 System.out.println("Enter product name: ");
                  String addpro=sc.nextLine();

                    products.add(addpro);     
        }
                    System.out.println("Product Added SuccessFully: " + products);
                      System.out.println();
                
    }

//2 . remove Product

    public void remProduct(Scanner sc){
        if(products.isEmpty()){
            System.out.println("Product list is empty now");
            System.out.println("Please add products first to use remove operation");
            System.out.println();
           return;
        }
       
            System.out.println("Enter the Product name you want to remove: ");
            String removep=sc.nextLine();
         
            if(products.contains(removep)){
                System.out.println("Product available in list....");
                 products.remove(removep);
                 System.out.println("Product deleted successfully");
            }
        }
    

// 3.dispaly produxct
    public void displayProduct(){
     
        System.out.println("Products: " + products);
        System.out.println();
}

// 4. Remove all products
   public void delAll(){
    products.clear();
    System.out.println("Products: " + products + " Number of products in list: " + products.size());
    
   }

// 5. Search Element or not
   public void searchProduct(Scanner sc){
     System.out.println("Products: " + products);
     String search="";

    try{
         System.out.println("Enter the element you want to search: ");
           search=sc.nextLine();
    } 
    catch(InputMismatchException e){
        System.out.println("Invalid input. " + " Enter input in numbers");

    }
    
         if(products.contains(search)){
            System.out.println("Product available in a list");
         }
         else{
            System.out.println("Product not available in a list");
         }
     }
   }


