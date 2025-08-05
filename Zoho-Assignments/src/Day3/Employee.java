/*3. Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees.*/
package Day3;

public class Employee {
	String name;
	int employee_Id;
	String designation;
	double salary;
	Employee(){
		System.out.println("The object has been created");
	}
	Employee(String name,int employee_Id,String designation,double salary){
		this.name=name;
		this.employee_Id=employee_Id;
		this.designation=designation;
		this.salary=salary;
	}
	Employee(Employee real){
		this.name=real.name;
		this.employee_Id=real.employee_Id;
		this.designation=real.designation;
		this.salary=real.salary;
	}
	void display() {
		System.out.println("Name is "+this.name);
		System.out.println("Employee_Id is "+this.employee_Id);
		System.out.println("Designation is "+this.designation);
		System.out.println("Salary is "+this.salary);
	}
	public static void main(String[] args) {
		Employee employee1=new Employee();
		Employee employee2=new Employee("sarathi",10,"Software Developer",50000);
		Employee employee3=new Employee(employee2);
		employee1.display();
		employee2.display();
		employee3.display();
	}
	
}
