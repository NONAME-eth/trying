package pro.New;

//Student Record Management →
// Store students in ArrayList, 
//  search/update/delete by roll number.
import java.util.Scanner;
import java.util.*;

public class Student {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Integer> studentrollnolist = new ArrayList<>();  
        List<String> studentnamelist = new ArrayList<>();

        Operations obj = new Operations();

        // Menu
        // Taking input of n studnets
        while (true) {
            System.out.println("--- Student Management System---");

            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
             System.out.println("3. Search Student ");
            System.out.println("3. Exit");

            System.out.println("Enter your choice: ");  
            int choice=sc.nextInt();        

            switch (choice) {

                case 1:
                   obj.add(studentrollnolist, studentnamelist, sc );
                    break;
                case 2:
                    obj.delete(studentrollnolist, studentnamelist, sc);
                    break;

                     case 3:
                     obj.Search(studentrollnolist, studentnamelist, sc);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}

class Operations {

    // 1. search operation
    public void Search(List<Integer> studentrollnolist, List<String> studentnamelist, Scanner sc) {
        System.out.println("Enter the Roll Number of student: ");
        int searchroll = sc.nextInt();

        System.out
                .println("Checking the student is available in list or not: " + studentrollnolist.contains(searchroll));
        System.out.println(
                "Searched student data: " + studentrollnolist.get(searchroll) + studentnamelist.get(searchroll));

    }

    // 2. delete operation
    public void delete(List<Integer> studentrollnolist, List<String> studentnamelist, Scanner sc) {
        System.out.println("Student Roll Number: " + studentrollnolist);
        System.out.println("Student Name: " + studentnamelist);

        System.out.println("Enter the index no you want to delete: ");
        int deleteroll = sc.nextInt();

        studentrollnolist.remove(deleteroll);
        studentnamelist.remove(deleteroll);

        System.out.println(
                "After Deleted records: " + " Roll Number: " + studentrollnolist + " Name: " + studentnamelist);
      
    }

    // 3. add operation

    public void add(List<Integer> studentrollnolist, List<String> studentnamelist, Scanner sc){
     System.out.println("Enter the Number of students data you want to enter: ");
     int n = sc.nextInt();
        System.out.println("You want to enter " + n + " number of students data");

         // storing inputs in arraylist from user

        for (int i = 0; i < n; i++) {
            System.out.println("Enter The Student RollNo: ");
            int rollno = sc.nextInt();
            sc.nextLine();
            studentrollnolist.add(rollno);

            System.out.println("Enter The Student Name: ");
            String name = sc.nextLine();
            studentnamelist.add(name);
        }

        System.out.println(studentrollnolist);
        System.out.println(studentnamelist);
    }

}