/*5. Create a class named Shape with a method that prints "This is a shape". Create another class named Polygon
inheriting the Shape class with the same method that prints "Polygon is a shape". Create two other classes named
Rectangle and Triangle having the same method which prints "Rectangle is a polygon" and "Triangle is a polygon"
respectively. Again, make another class named Square having the same method which prints "Square is a rectangle".
Now, try calling the method by the object of each of these classes.*/
package Day4;
class shape {
    void shapePrint(){
        System.out.println("This Is A Shape ");
    }
}

class Polygon extends Shape{
    void shapePrint(){
        System.out.println("Polygon is a shape");
    }
}

class Rectangle extends Polygon{
    void shapePrint(){
        System.out.println("Rectangle is a polygon");

    }
}

class Triangle extends Polygon{
    void shapePrint(){
        System.out.println("Traiangle is a polygon");
    }
}

class Square extends Rectangle{
    void shapePrint(){
        System.out.println("Square is a rectangle");
    }
}


public class Shape{
    public static void main(String[] args){
        shape Sha = new shape();
        Sha.shapePrint();

        Polygon polygon = new Polygon();
        polygon.shapePrint();

        Rectangle rectangle = new Rectangle();
        rectangle.shapePrint();

        Triangle triangle = new Triangle();
        triangle.shapePrint();

        Square square = new Square();
        square.shapePrint();

        }
    }
