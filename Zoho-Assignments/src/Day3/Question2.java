package Day3;

//2. Create a class named Student that has the following attributes:
//name (String)
//roll_no (int)
//phone_no (int)
//address (String)
//Create a constructor Student(String name, int roll_no, int phone_no, String address) and
//store and display the details for two students having names "Sam" and "John" respectively.

import java.util.Scanner;

public class Question2 {


  String name ;
  int roll_no ;
  String address;
  long phone_no ;


  Question2(int roll,long phone,String name , String address){
      this.name = name;
      this.roll_no = roll;
      this.address = address;
      this.phone_no = phone;
  }

  void printMethod(){
      System.out.println("-----------------------------------------------------");
      System.out.println("The Student Name : " + name);
      System.out.println("The Student Roll No : " + roll_no);
      System.out.println("The Student Address : "+ address);
      System.out.println("The Student Phone Number is : "+phone_no);
      System.out.println("-----------------------------------------------------");
  }
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a Phone Name : ");

      String name = scan.nextLine();

      System.out.print("Enter a Roll Number : ");

      int roll = scan.nextInt();
      System.out.print("Enter a Phone Number : ");
      long phone = scan.nextLong();
      scan.nextLine();
      System.out.print("Enter a Address : ");
      String add = scan.nextLine();


      Question2 obj = new Question2( roll,phone,name,add);

      obj.printMethod();


  }
}
