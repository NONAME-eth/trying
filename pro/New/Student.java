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

        // Taking input of n studnets

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

        sc.close();
    }
}

class Operations {
    public void Search() {
        System.out.println();
    }
}