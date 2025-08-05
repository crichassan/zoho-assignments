//1. Write a program that uses if statement to find the minimum of three numbers.
package day2.part1;

import java.util.Scanner;

public class Question1{
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter a First Number : ");
      int num1 = scan.nextInt();
      System.out.println("Enter a Second Number : ");
      int num2 = scan.nextInt();
      System.out.println("Enter a third Number : ");
      int num3 = scan.nextInt();

      int min =0;

      if(num1 < num2 && num1<num3 ){
         min = num1;
      }
      else if(num2<num1 && num2<num3){
          min = num2;
      }
      else{
          min = num3;
      }
      System.out.println("The Minimum Number is : "+min);
  }
}