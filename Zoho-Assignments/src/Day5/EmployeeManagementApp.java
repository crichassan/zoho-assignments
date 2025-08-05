/*Create a Java application to manage employees in a company. Define a base class Employee with a method
calculateSalary(). Then create two subclasses FullTimeEmployee, PartTimeEmployee and ContractEmployee that
override calculateSalary() method based on their working type.*/
package Day5;

import java.util.Scanner;

//Base class
abstract class Employee {
 protected String employeeId;
 protected String name;

 public void inputDetails(Scanner scanner) {
     System.out.print("Enter Employee ID: ");
     employeeId = scanner.nextLine();

     System.out.print("Enter Employee Name: ");
     name = scanner.nextLine();
 }

 public abstract double calculateSalary();

 public void displayDetails() {
     System.out.println("\nEmployee ID: " + employeeId);
     System.out.println("Name: " + name);
     System.out.println("Salary: ₹" + calculateSalary());
 }
}

//Subclass for full-time employees
class FullTimeEmployee extends Employee {
 private double monthlySalary;

 public void inputFullTimeDetails(Scanner scanner) {
     inputDetails(scanner);
     System.out.print("Enter Monthly Salary: ");
     monthlySalary = Double.parseDouble(scanner.nextLine());
 }

 @Override
 public double calculateSalary() {
     return monthlySalary;
 }
}

//Subclass for part-time employees
class PartTimeEmployee extends Employee {
 private int hoursWorked;
 private double hourlyRate;

 public void inputPartTimeDetails(Scanner scanner) {
     inputDetails(scanner);
     System.out.print("Enter Hours Worked: ");
     hoursWorked = Integer.parseInt(scanner.nextLine());
     System.out.print("Enter Hourly Rate: ");
     hourlyRate = Double.parseDouble(scanner.nextLine());
 }

 @Override
 public double calculateSalary() {
     return hoursWorked * hourlyRate;
 }
}

//Subclass for contract employees
class ContractEmployee extends Employee {
 private int contractMonths;
 private double monthlyContractPay;

 public void inputContractDetails(Scanner scanner) {
     inputDetails(scanner);
     System.out.print("Enter Contract Duration (months): ");
     contractMonths = Integer.parseInt(scanner.nextLine());
     System.out.print("Enter Monthly Pay: ");
     monthlyContractPay = Double.parseDouble(scanner.nextLine());
 }

 @Override
 public double calculateSalary() {
     return contractMonths * monthlyContractPay;
 }
}

//Main class
public class EmployeeManagementApp {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("=== Employee Management System ===");
     System.out.print("Select Employee Type (F=Full-Time, P=Part-Time, C=Contract): ");
     String type = scanner.nextLine().trim().toUpperCase();

     switch (type) {
         case "F":
             FullTimeEmployee fte = new FullTimeEmployee();
             fte.inputFullTimeDetails(scanner);
             fte.displayDetails();
             break;

         case "P":
             PartTimeEmployee pte = new PartTimeEmployee();
             pte.inputPartTimeDetails(scanner);
             pte.displayDetails();
             break;

         case "C":
             ContractEmployee ce = new ContractEmployee();
             ce.inputContractDetails(scanner);
             ce.displayDetails();
             break;

         default:
             System.out.println("Invalid employee type selected!");
     }

     scanner.close();
 }
}

