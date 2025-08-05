/*Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class
called threeD which is derived from twoD and also contains z and write methods to read and write z. Also write a
method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a print statement to the TwoD default constructor with a message "TwoD default constructor"
Add a print statement to other TwoD constructor with a message "TwoD constructor with two arguments"*/
package Day4;

import java.util.Scanner;

class TwoD{
    protected int x,y;

    public TwoD(){
        System.out.println("TwoD default constructor");
    }

      public TwoD(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("TwoD constructor with two arguments");
    }

    public void setX(int x){
        this.x =x;

    }

    public void setY(int y){
        this.y=y;
    }


    public int getX()
    {
        return x;
    }

    public int getY(){
        return y;
    }




}


class ThreeD extends TwoD{
    private int z;

    public ThreeD(){
        super();
    }

    public ThreeD(int x,int y,int z){
        super(x,y);
        this.z = z;
    }

    public void setZ(int z){
        this.z =z;
    }

    public int getZ(){
        return z;
    }
     public double squareRoot(double number){
        double start =0;
        double end = number;
        double mid =0;

        double ep = 0.000001;

        while ((end-start)>ep) {
            mid = (start+end)/2;

            double square = mid*mid;

            if(square<number){
                start = mid;
            }
            else{
                end = mid;
            }
        }

        return (start + end)/2;
    }


    public double distanceCalc(ThreeD other){


        int dx = this.getX() - other.getX();
        int dy = this.getY() - other.getY();
        int dz = this.getZ() - other.getZ();
        double num = (dx * dx + dy * dy + dz * dz);
        return squareRoot(num);

    }
}

class TwoDThreeD{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter X1 Y1 Z1 ");

        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int z1 = scan.nextInt();

        System.out.println("Enter X2 Y2 Z2");

        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int z2 = scan.nextInt();

        ThreeD obj1 = new ThreeD();

        obj1.setX(x1);
        obj1.setY(y1);
        obj1.setZ(z1);

        ThreeD obj2 = new ThreeD(x2,y2,z2);

        double distance = obj1.distanceCalc(obj2);

        System.out.println("Distance between two 3D points: " + distance);
        

    }
}