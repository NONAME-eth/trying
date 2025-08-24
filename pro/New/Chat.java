package pro.New;

import java.util.*;
 
class Student{
    int rollNo;
    String name;
    int age;
    double marks;

    Student(int rollNo, String name, int age, double marks){
      this.rollNo=rollNo;
      this.name=name;
      this.age=age;
      this.marks=marks;

    }

    public String toString(){
return "Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Marks: " + marks;      
  
  }
}

public class Chat{
 ArrayList<Student> studentList=new ArrayList<>();

 // add student
 public static void addStudent(int rollNo,String name,int age,int marks){
    studentList.add(new Student(rollNo,name,age,marks));

 }

}
