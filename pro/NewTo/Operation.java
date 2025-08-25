package pro.NewTo;

import java.util.ArrayList;
import java.util.Scanner;

public class Operation {
    
       ArrayList<String> products=new ArrayList<>();

// 1. add Product
    public void addProduct(Scanner sc){

         System.out.println("Enter product name: ");
                  String addpro=sc.nextLine();
        products.add(addpro);

       System.out.println("Product Added SuccessFully: " + products);

    }
//2 . remove Product
    public void remProduct(Scanner sc){
        if(products.isEmpty()){
            System.out.println("Product list is empty now");
            System.out.println("Please add products first to use remove operation");
        }
        else{
            System.out.println("Enter the Product name you want to remove: ");
            String removep=sc.nextLine();
    
            if(products.contains(removep)){
                System.out.println("Product available in list....");
                 products.remove(removep);
                 System.out.println("Product deleted successfully");
            }
        }
    }

// 3.dispaly produxct
    public void displayProduct(){
     
        System.out.println("Products: " + products);
}

// 4. Remove all products
   public void delAll(){
    products.clear();
    System.out.println("Products: " + products + " Number of products in list: " + products.size());
    
   }

// 5. Search Element or not
   public void searchProduct(Scanner sc){
     System.out.println("Products: " + products);

     System.out.println("Enter the element you want to seach: ");
     String search=sc.nextLine();

     for(int i=0;i< products.size();i++){
         if(products.contains(search)){
            System.out.println("Product available in a list");
         }
         else{
            System.out.println("Product not available in a list");
         }
     }
   }

}
