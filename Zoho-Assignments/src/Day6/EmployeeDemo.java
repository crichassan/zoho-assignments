/*3. Design a class Employee with private data members: employee ID, name, designation, department, and monthly
salary. Use proper getter and setter methods to access and update these fields. Add a method to calculate and return the
annual salary of the employee.*/
package Day6;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee(1234, "Madhu", "Software developer", "Development", 140000);
    
        System.out.println(emp.calculateAnnualSalary());
    }
}
