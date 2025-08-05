

/*  6. Write a program that would print the information (name, year of joining, salary, address) of three employees by
creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output.

*/
package Day3;


public class Employees {
	String name;
	int year_of_joining;
	String address;
	Employees(String name,int year_of_joining,String address){
		this.name=name;
		this.year_of_joining=year_of_joining;
		this.address=address;
	}
	void display() {
		String s=String.format("%s %d %s",this.name,this.year_of_joining,this.address);
		System.out.println(s);
	}
	public static void main(String[] args) {
		Employees employee1=new Employees("Robert",1994,"64C- WallsStreat");
		Employees employee2=new Employees("Sam",2000,"68D- WallsStreat");
		Employees employee3=new Employees("John",1999,"26B- WallsStreat");
		System.out.println("Name Year of joining Address");
		employee1.display();
		employee2.display();
		employee3.display();
	}

}