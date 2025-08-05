/*3. A class Point is declared as follows:
class Point{
public:
Point(){int=0;int=0;} //default constructor
void setPoint(int,int); //set coordinates
final int getX(){return x;} //get x coordinates
final int getY() return y;} //get y coordinates
void printPoint(); // print (x,y) coordinates
private int x;
private int y;
};
Write the implementation of the class Point in the same file. Then, declare a class called Circle that is derived from the
class Point. The class Circle has public member functions Circle (constructor), setRadius(), getRadius() and area() and
one private data member radius. The class Circle indirectly uses the private members x and y of class Point to store the
coordinate of the center of the circle. The class Circle also checks to make sure the radius value is a positive number;
otherwise, it is set to the default value 1.
Note: The private members of class Point can only be indirectly accessed by class Circle using public methods of class
point. Implement the class Circle and write a driver program to test the class Circle. An example of the output of the
driver program is.
Enter x: 2
Enter y: 2
Enter radius: 1
Circle center is (2,2)
Radius is 1
Area is 3.14*/
package Day4;

import java.util.Scanner;

class Point{
     private int x;
     private int y;

     Point(){
        x=0;
        y=0;
     }

     public void setPoint(int x,int y){
        this.x = x;
        this.y =y;

     }

     public int getX(){
        return x;
     }

     public int getY(){
        return y;
     }

     void printPoint(){
        System.out.println( "The Circles Center Point is: " + "(" + x + " , " + y + ")");

     }

     
}


class Circle extends Point{

    private double radius;

    Circle(int x , int y,int z){
        setPoint(x, y);
        setRadius(z);

    }

   public void setRadius(int a){
        if(a>0){
            this.radius = a;
        }
        else{
            this.radius = 1;
        }
        
   }

   public double getRadius(){
    return radius;
   }

   void printRadius(){
    System.out.println("The Radius Is : "+ getRadius());

   }

   public double area(){
        return (3.1415 * (radius * radius));
   }

   public void printArea(){
    System.out.println("The Area is : " + area());
   }



}


public class CirclePoint{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The X Value: ");
        int a = scan.nextInt();

        System.out.print("Enter The Y Value: ");
        int b = scan.nextInt();

        System.out.print("Enter a Radius: ");
        int r = scan.nextInt();

        Circle c = new Circle(a, b, r);

        c.printPoint();
        c.printRadius();
        c.printArea();







    }
}
