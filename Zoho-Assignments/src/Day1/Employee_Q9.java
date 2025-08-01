//Write a class Employee with attributes empId, name, department and salary and define a parametrized constructor Employee(int empId, String name, String department, double salary) and assign these variables to instance variables accordingly and display them?
package Day1;

//Employee.java
public class Employee_Q9 {
 // Instance variables
 int empId;
 String name;
 String department;
 double salary;

 // Parameterized constructor
 Employee_Q9(int empId, String name, String department, double salary) {
     this.empId = empId;
     this.name = name;
     this.department = department;
     this.salary = salary;
 }

 // Method to display employee details
 void display() {
     System.out.println("Employee ID   : " + empId);
     System.out.println("Name          : " + name);
     System.out.println("Department    : " + department);
     System.out.println("Salary        : " + salary);
 }

 
 public static void main(String[] args) {
   
     Employee_Q9 emp = new Employee_Q9(101, "Hassan", "CSE", 55000.00);
     
   
     emp.display();
 }
}

