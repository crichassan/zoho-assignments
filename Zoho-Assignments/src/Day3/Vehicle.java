/* 4. Design the Vehicle class that stores information about a vehicle such as its vehicle ID, 
brand name, and price, such that it can internally keep track of how many vehicles have been created so far,
without requiring manual counting from outside the class.  */
package Day3;


public class Vehicle {
	static int total_vehicles;
	int vehicle_Id;
	String brand_name;
	long price;
	Vehicle(int vehicl_Id,String brand_name,long price){
		total_vehicles++;
		this.vehicle_Id=vehicl_Id;
		this.brand_name=brand_name;
		this.price=price;
	}
	public static void main(String[] args) {
		Vehicle vehicle1=new Vehicle(18,"AUDI",1000000000l);
		Vehicle vehicle2=new Vehicle(29,"TESLA",4000000000l);
		Vehicle vehicle3=new Vehicle(39,"TATA",3000000000l);
		Vehicle vehicle4=new Vehicle(48,"BMW",2000000000l);
		System.out.println(total_vehicles);
	}

}
