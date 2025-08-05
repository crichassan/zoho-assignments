

/*Day-4 Assignment Questions:
1. We want to store the information about different vehicles. Create a 
class named Vehicle with two data member named mileage and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), 
seating capacity and fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears,
 cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type,
 ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike. */

package Day4;
class Vehicle{
    double mileage; 
    double price;

     void vehicleSet(double mil, double pr){

        this.mileage = mil;
        this.price =  pr;
    }

    void displayVehicle(){
        System.out.println("Mileage              : "+mileage+ " Km/l");
        System.out.println("Price $              : "+price);
    }
    
}

class Car extends Vehicle{
    double ownershipCost;
    int warenty;
    int seatingCaoacity;
    String fuelType;

    void carSet(double owner, int warenty,int seating,String fuel){
        this.ownershipCost = owner;
        this.warenty = warenty;
        this.seatingCaoacity = seating;
        this.fuelType = fuel;
    }

    void carDisplay(){
        System.out.println("Owner Ship Cost $     : "+ownershipCost);
        System.out.println("Car Warenty           : "+ warenty + " Year");
        System.out.println("Seating Caacity       : "+ seatingCaoacity);
        System.out.println("Fuel Type             :"+ fuelType);

    }
}

class Bike extends Vehicle{
    int cylinders;
    int gears;
    String coolingType;
    String wheelType;
    double fuelTankSize;

    void bikeSet(int cylinder, int gears,String coolingType ,String wheel, double fuel){
      

        this.cylinders = cylinder;
        this.gears = gears;
        this.coolingType = coolingType;
        this.wheelType = wheel;
        this.fuelTankSize = fuel;

    }

    void bikeDisplay(){
        System.out.println("No of Cylinder       : " + cylinders);
        System.out.println("No of Gear           : " + gears);
        System.out.println("Bike Cooling Type is : "+coolingType);
        System.out.println("Bike Wheel Type      : "+wheelType);
        System.out.println("Bike Fuel Tank Size  : "+ fuelTankSize );
        
    }
}

class Audi extends Car{
    String modelType;

    void setModelAudi(String model){
        this.modelType = model;
    }

    void displayAudi(){
        System.out.println("-------Audi car Details-------");
        System.out.println("Model Type           : " + modelType);
        carDisplay();
        displayVehicle();
        System.out.println();
    }
}


class Ford extends Car{
    String modelType;

    void setModelFort(String model){
        this.modelType = model;
    }

    void displayFort(){
        System.out.println("-------Ford car Details-------");
        System.out.println("Model Type           : " + modelType);
        carDisplay();
        displayVehicle();
        System.out.println();
    }
}


class TVS extends Bike{
     String modelType;

    void setModelTVS(String model){
        this.modelType = model;
    }

    void displayTVS(){
        System.out.println("-------TVS Bike Details-------");
        System.out.println("Model Type           : " + modelType);
        bikeDisplay();
        displayVehicle();
        System.out.println();
    }
}

class Bajaj extends Bike{
     String modelType;

    void setModelBajaj(String model){
        this.modelType = model;
    }

    void displayBajaj(){
        System.out.println("-------Bajaj Bike Details-------");
        System.out.println("Model Type           : " + modelType);
        bikeDisplay();
        displayVehicle();
        System.out.println();
    }
}


public class VehiclesMain{
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.setModelAudi("Q7");
        audi.carSet(150000,5,5,"Diesel");
        audi.vehicleSet(15.0,500000.00);
        audi.displayAudi();


        Ford ford = new Ford();

        ford.setModelFort("i7");
        ford.carSet(800000, 10, 8, "Petrol;");
        ford.vehicleSet(10.5,245000000.00);
        ford.displayFort();


        TVS tvs = new TVS();
        tvs.setModelTVS("XL100");
        tvs.bikeSet(1, 0, "Air", "Alloy",5.55);
        ford.vehicleSet(40.00,100000.00);
        tvs.displayTVS();


        Bajaj bajaj = new Bajaj();

        bajaj.setModelBajaj("CD100");
        bajaj.bikeSet(2, 5, "Oil", "", 7.77);
        bajaj.vehicleSet(70.0,1200000.00);
        bajaj.displayBajaj();

    }
}